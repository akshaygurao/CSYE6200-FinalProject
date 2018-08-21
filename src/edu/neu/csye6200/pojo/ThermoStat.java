package edu.neu.csye6200.pojo;

public class ThermoStat {
	
	private int temperature;
	private String room;
	
	
	public ThermoStat(int temperature, String room) {
		super();
		this.temperature = temperature;
		this.room = room;
	}


	public int getTemperature() {
		return temperature;
	}


	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}


	public String getRoom() {
		return room;
	}


	public void setRoom(String room) {
		this.room = room;
	}


	@Override
	public String toString() {
		return "ThermoStat [temperature=" + temperature + ", room=" + room + "]";
	}
	
	
	

}
