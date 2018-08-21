package edu.neu.csye6200;

import java.util.Random;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPRuntime;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;

import edu.neu.csye6200.pojo.CEPListerner;
import edu.neu.csye6200.pojo.ThermoStat;

public class Driver {

	private static Random generator = new Random();
	public static void GenerateRandomTick(EPRuntime cepRT) {
//	private Random generator = new Random();
//	public void GenerateRandomTick(EPRuntime cepRT) {
		int temperature = generator.nextInt(120);
		String room = "Bedroom";
		ThermoStat tick = new ThermoStat(temperature, room);
		System.out.println("Sending tick:" + tick);
		cepRT.sendEvent(tick);
	}

	public static void main(String[] args) {
		
		System.out.println("\t" + Driver.class.getName() + ".demo() starting...\n");
		
		Driver obj = new Driver();
		
		// Configure logging
		ConsoleAppender appender = new ConsoleAppender(new SimpleLayout()); 
		Logger.getRootLogger().addAppender(appender); 
		Logger.getRootLogger().setLevel((Level) Level.WARN);
		// TODO Auto-generated method stub

		BasicConfigurator.configure();
	    //The Configuration is meant only as an initialization-time object.
	    Configuration cepConfig = new Configuration();
	    // We register Ticks as objects the engine will have to handle
	    cepConfig.addEventType("Temp",ThermoStat.class.getName());
	 
	   // We setup the engine
	    EPServiceProvider cep = EPServiceProviderManager.getProvider("myCEPEngine",cepConfig);
	    
	    EPRuntime cepRT = cep.getEPRuntime();
		
		// We register an EPL statement (rule)
		EPAdministrator cepAdm = cep.getEPAdministrator();
		EPStatement cepStatement = cepAdm.createEPL("select * from " +
		                                "Temp(room='Bedroom').win:length(2) " +
		                                "where temperature > 70");
		
		// listener for events
		cepStatement.addListener(new CEPListerner());
		
		for (int i = 0; i < 20; i++) {
			GenerateRandomTick(cepRT);
		}
		
		System.out.println(Driver.class.getName() + ".demo() done!\n");
	}

}
