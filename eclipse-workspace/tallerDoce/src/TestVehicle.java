
public class TestVehicle {
	
	@SuppressWarnings("static-access")
	public static void main(String args[]) {
		System.out.println("Manufactured: " + Vehicle.MAKE);
		System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
		System.out.println();
		
		Vehicle vehicle1 = new Vehicle("Spark Life");
		System.out.println("The chassis number is: " + vehicle1.getChassisNo());
		System.out.println("The model type is: " + vehicle1.getModel());
		System.out.println();
		
		Vehicle.setMAKE("Seer");
		Vehicle vehicle2 = new Vehicle("Edict");
		System.out.println("The chassis number is: " + vehicle2.getChassisNo());
		System.out.println("The model type is: " + vehicle2.getModel());
		System.out.println();
		
		System.out.println("Number of vehicles manufactured: " + Vehicle.totalVehicles());
		System.out.println();
		System.out.println();
		
		System.out.println("USING TOSTRING() METHOD");
		System.out.println(vehicle1.toString());
		System.out.println(vehicle2.toString());
		System.out.println();
		System.out.println();
		
		Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune");
		System.out.println();

		System.out.println("OUTERCLASS - INNERCLASS FROM VEHICLE 3 OBJECT");
		System.out.println(vehicle3.toString());
		
		System.out.println("Vehicle number " + vehicle3.getChassisNo() + " is a " + vehicle3.getModel() + " model and has an engine"
				+ " capacity of " + vehicle3.getCapacity() + "cc");		
		
		/* PUNTO 4 ITEM f: NO FUNCIONA PORQUE LOS OBJETOS vehicle1 y vehicle2 NO TIENEN ACCESO AL MÉTODO getCapacity(), DEBIDO
		 * A QUE ES UN MÉTODO INTERNO DE LA CLASE ESTÁTICA Engine. 
		 * 
		System.out.println("Vehicle number " + vehicle2.getChassisNo() + " is a " + vehicle2.getModel() + " model and has an engine"
				+ " capacity of " + vehicle2.getCapacity() + "cc");
		
		System.out.println("Vehicle number " + vehicle1.getChassisNo() + " is a " + vehicle1.getModel() + " model and has an engine"
				+ " capacity of " + vehicle1.getCapacity() + "cc");
		*/


	}
}
