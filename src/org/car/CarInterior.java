package org.car;

public class CarInterior {
	
	char DVD;
	
	public String getLeather(){
		String color = "Black";
		return color;
	}
	public String getTrim(){
		String TrimType = "Mahogany";
		return TrimType;
	}
	public String getNavigation(){
		String NavSys = "Standard";
		return NavSys;
	}
	public int getSeating(){
		int TotalSeat = 7;
		return TotalSeat;
	}
	public void getRearViewMirror(){
		System.out.println("Rearview Mirror: Electrochromic(auto-dimming) inside rearview mirror");
	}
}
