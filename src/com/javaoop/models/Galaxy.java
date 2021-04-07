package com.javaoop.models;

import com.javaoop.abstracts.Phone;
import com.javaoop.interfaces.Ringable;

public class Galaxy extends Phone implements Ringable{

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);

	}
	
	@Override
	public String ring() {
		return ("\n%s %s says %s").formatted(this.getClass().getSimpleName(),
					this.getVersionNumber(), 
					this.getRingTone());
	}
	
	@Override
	public String unlock() {
		return ("Unlocking via finger print.");
	}
	
	@Override
	public void displayInfo() {
		System.out.printf("%s %s from %s",
					this.getClass().getSimpleName(),
					this.getVersionNumber(), 
					this.getCarrier());
	}

}
