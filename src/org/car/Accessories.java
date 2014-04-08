package org.car;

public class Accessories {
	
	char TRK;

	public String getRES(){
		String res = "Optional";
		return res;
	}
	public char getGBS(){
		char gbs = 'Y';
		return gbs;
	}
	
	public char getWheelLocks(){
		char wh = 'Y';
		return wh;
	}
	public String getExhaustTip(){
		String et = "Stainless Steel";
		return et;
	}
	public void getRoofRack(){
		System.out.println("Roof Rack: Optional");
	}
}
