package com.class28_Super_Keyword;

//class device, then create child class "Apple"
public class Device {
	String deviceType, name;
	
	public Device(String deviceType, String name) {
		
		
		this.name=name;
		this.deviceType=deviceType;
	}
}

class Apple extends Device{

	public Apple(String deviceType, String name) {
		super(deviceType,name);
		
		
	}
}
