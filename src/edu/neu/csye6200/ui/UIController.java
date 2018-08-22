/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author akshaygurao
 */
public class UIController {
	private Random generator = new Random();
    private String event = "True";
    private int currTemp = 66;
    private int setTemp = 71;
    private List<String> rooms;

    public UIController() {
        this.rooms = new ArrayList<>();
        this.rooms.add("BedRoom");
        this.rooms.add("Living Room");
    }

    public List<String> getRooms() {
        return rooms;
    }

    public void setRooms(List<String> rooms) {
        this.rooms = rooms;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public int getCurrTemp() {
        return currTemp;
    }

    public void setCurrTemp(int currTemp) {
        this.currTemp = currTemp;
    }

    public int getSetTemp() {
        return setTemp;
    }

    public void setSetTemp(int setTemp) {
        this.setTemp = setTemp;
    }
   
    public Random getGenerator() {
		return generator;
	}
	public static void demo(){
        
    }
}
