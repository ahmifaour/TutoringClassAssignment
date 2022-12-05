package com.ahmi.tutoringclass;
//The purpose of this class is to model a television.
//Ahmad Faour 12-04-2022
public class Television {
	final String MANUFACTURER = "Toshiba";
	final int SCREEN_SIZE = 55;
	final String MANUFACTURER2 = "Sharp";
	final int SCREEN_SIZE2 = 19;
	//The boolean powerOn is to return whether or not the power of the television is engaged.
	boolean powerOn = false;
	//The integer channel is designed to store the value of the station number, this identifying the channel.
	int channel = 2;
	//The integer volume is designed to store the television's volume value.
	int volume = 20;
	
	//The purpose of this constructor, is to declare what brand of Television is being referred to, and the size of it's screen upon Object declaration.
	public Television(String MANUFACTURER, int SCREEN_SIZE) {

	}
	
	public boolean isPowerOn() {
		return powerOn;
	}

	public void setPowerOn(boolean powerOn) {
		this.powerOn = powerOn;
	}
	
	public void power(boolean powerOn) {
		powerOn = !powerOn;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void increaseVolume(int volume) {
		this.volume = volume+1;
	}
	
	public void decreaseVolume(int volume) {
		this.volume = volume-1;
	}

	public String getMANUFACTURER() {
		return MANUFACTURER;
	}

	public int getSCREEN_SIZE() {
		return SCREEN_SIZE;
	}
	
	public String getMANUFACTURER2() {
		return MANUFACTURER2;
	}
	
	public int getSCREEN_SIZE2() {
		return SCREEN_SIZE2;
	}

}
