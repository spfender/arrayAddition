package com.pfender;

public class Holiday 
{
	private String location;
	private int numOfDays;
	private String activities;
	
	//getter-setters
	public String getLocation()
	{
		return location;
	}
	
	public void setLocation(String location)
	{
		this.location = location;
	}
	
	public int getNumOfDays()
	{
		return numOfDays;
	}
	
	public void setNumOfDays(int numOfDays)
	{
		this.numOfDays = numOfDays;
	}
	
	
	//empty constructor
	public Holiday()
	{
		location = "Undefined location";
		numOfDays = 0;
		activities = "Undefined activities";
	}
	
	//constructor with 2 variables
	public Holiday (String location, int numOfDays)
	{
		this.location = location;
		this.numOfDays = numOfDays;
		this.activities = "boating";
	}
	
	//constructor with all variables
	public Holiday (String location, int numOfDays, String activities)
	{
		this.location = location;
		this.numOfDays = numOfDays;
		this.activities = activities;
	}
	//method declaration
	boolean buyTickets()
	{
		if (numOfDays >= 1)
		{ 
			return true;
		}
		return false;	
	}
	
	String longHoliday()
	{
		String longTrip = null;
		return longTrip;
	}
	
}
