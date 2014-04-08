package org.car;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarExterior ex = new CarExterior();
		CarInterior in = new CarInterior();
		SafetyFeatures sf = new SafetyFeatures();
		Accessories acc = new Accessories();
		
		ex.moonroof= 'Y';
        in.DVD = 'Y';
        sf.TPMS = "Standard";
		acc.TRK = 'Y';
				
		System.out.println("Car Exterior Info....");
	    System.out.println("Type: " + ex.getType());
	    System.out.println("Model: " + ex.getModel());
		System.out.println("Color: " + ex.getColor());
		System.out.println("Wheel Diameter: " +ex.getWheel() + " inch");
		System.out.println("MoonRoof: " + ex.moonroof);
		ex.getSteering();
	
		System.out.println("\nCar Interior Info....");
	    System.out.println("Leather Color: " + in.getLeather());
	    System.out.println("Trim: "+ in.getTrim());
		System.out.println("Navigation: "+ in.getNavigation());
		System.out.println("Total No of Seat: " + in.getSeating());
		System.out.println("DVD: " + in.DVD);
		in.getRearViewMirror();
		
		System.out.println("\nCar Safety Features Info....");
	    System.out.println("Head Lamps: " + sf.getHeadLamps());
	    System.out.println("Tail Lamps: "+ sf.getTailLamps());
		System.out.println("Fog Lamps: "+ sf.getFogLamps());
		System.out.println("Total No of Air Bags: " + sf.getAirBags());
		System.out.println("Seat Belt: " + sf.getSeatBelt());
		System.out.println("Anti-Break Lock System: " + sf.getABS());
	    System.out.println("Tire Pressure Monitor System: " + sf.TPMS);
	    
	    System.out.println("\nCar Accessories Info....");
	    System.out.println("Remote Engine Starter: " + acc.getRES());
	    System.out.println("Glass Breakage Sensor: "+ acc.getGBS());
		System.out.println("Alloy Wheel locks: "+ acc.getWheelLocks());
		System.out.println("Exhaust Tip: " + acc.getExhaustTip());
		System.out.println("Tire Repair Kit: " + acc.TRK);
		acc.getRoofRack();
		
		System.out.println("\nCar Price: Starts From " + getPrice());
		System.out.println("Year Built: " + getYearBuilt());
		System.out.println("Gas Mileage: " + getGasMileage() + " MPG(combined)" );
		System.out.println("Horse Power: " + getGasMileage() +" hp");
		System.out.println("Engine: " + getEngine()  + " liter V8" );
	}		
		public static double getPrice(){
			double price = 50000;
			return price;
	}
		public static int getYearBuilt(){
			int YB = 2014;
			return YB;
	}
		public static int getGasMileage(){
			int gas = 17;
			return gas;
	}
        public static int getHorsePower(){
			int HP = 301;
			return HP;
	}
        public static double getEngine(){
			double engine = 4.6;
			return engine;
	}
}


