package org.car;

public class SafetyFeatures {
	
	String TPMS;
	
	public String getHeadLamps(){
		String HeadLamps= "LED";
		return HeadLamps;
	}
	public String getTailLamps(){
		String TailLamps  = "LED";
		return TailLamps;
	}
	public String getFogLamps(){
		String FogLamps= "LED";
		return FogLamps;
	}
	public int getAirBags(){
		int AirBags = 10;
		return AirBags;
	}
	public String getSeatBelt(){
		String SeatBelt = "Standard";
		return SeatBelt;
	}
	public char getABS(){
	    char ABS = 'Y';
		return ABS;
	}
}
