package org.car;

public class CarExterior {
	
	char moonroof;
	
	public String getType(){
		String type = "SUV";
		return type;
	}
	public String getModel(){
		String model = "LEXUS-GX460";
		return model;
	}
	public String getColor(){
		String color = "Starfire Pearl";
		return color;
	}
	public int getWheel(){
		int wheelDiameter = 18;
		return wheelDiameter;
	}
	public void getSteering(){
		System.out.println("Steering: Power tilt-and-telescopic steering column with automatic tilt-away");   
	}
}
