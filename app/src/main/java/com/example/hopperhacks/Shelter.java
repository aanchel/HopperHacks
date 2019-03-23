package com.example.hopperhacks;

import java.util.ArrayList;

public class Shelter implements Comparable{
	
	public long distance;
	public String location;
	public String type;
	public String needs;
	public String name;
	
	public Shelter(long distance, String location, String type, String needs, String name) {
		this.distance = distance;
		this.location = location;
		this.type = type;
		this.needs = needs;
		this.name = name;
	}
	public long getDistance() {
		return distance;
	}
	
	public String getType() {
		return type;
	}
	public String getNeeds() {
		return needs;
	}
	@Override
	public int compareTo(Object other) {
		if (this.getDistance() == ((Shelter)(other)).getDistance()) {
			return 0;
		}
		if (this.getDistance() > ((Shelter)(other)).getDistance()) {
			return 1;
		}
		return -1;
	}
	public String toString() {
		return name + " in " + location + ", " + distance + " miles away.\n\r";
	}

}
