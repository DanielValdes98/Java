

public class Vehicle {
	
	// Statics variables
	public static String MAKE = "Augur";
	public static int numVehicles = 0;
	
	// Instance variables
	private String ChassisNo;
	private String model;
	
	// Constructor
	public Vehicle(String model) {
		numVehicles += 1;
		this.ChassisNo = "ch" + Integer.toString(numVehicles);
		this.model = model;
		System.out.println("Vehicle manufactured");
		System.out.println("The vehicle is manufactured by: " + MAKE);
	}

	public String getChassisNo() {
		return ChassisNo;
	}

	public void setChassisNo(String chassisNo) {
		ChassisNo = chassisNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public static int totalVehicles() {
		return numVehicles;
	}
	
	public static String getMAKE() {
		return MAKE;
	}

	public static void setMAKE(String mAKE) {
		MAKE = mAKE;
	}

	@Override
	public String toString() {
		return "The vehicle manufactured by: " + Vehicle.MAKE + "\n" + 
				"The model type is: " + this.model + "\n" + 
				"The chassis number is: " + this.ChassisNo + "\n" + 
				"The engine make is: " + Engine.MAKE + "\n" +
				"The engine capacity is: " + Engine.CAPACITY + "\n" ;
	}
	
	
	// STATIC CLASS
	public static class Engine extends Vehicle {
		
		private static final String MAKE  ="Predicter";
		private static final int CAPACITY = 1600;
		
		public Engine(String model) {
			super(model);
		}

		public static String getMake() {
			return MAKE;
		}
		public static int getCapacity() {
			return CAPACITY;
		}		
	} // end Engine class	
	
} // end Vehicle class
