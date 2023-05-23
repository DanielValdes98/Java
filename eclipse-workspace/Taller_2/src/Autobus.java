import java.util.Scanner;

public class Autobus {
	public static void main(String args[]) {
		Scanner AB = new Scanner(System.in);
		int numAutoBuses = 0;
		int numPersonasFurgo = 0;
		int numPersonas;
		int cupoMax = 45;

		
		System.out.println("Ingrese el numero de personas: ");
		numPersonas = AB.nextInt();
		
		if(numPersonas == cupoMax) {
			numAutoBuses = 1;
			System.out.println("El numero de autobuse(s) requerido es: " + numAutoBuses);
		} else if(numPersonas > cupoMax) {
			if(numPersonas % cupoMax == 0) {
				numAutoBuses = numPersonas / cupoMax;
				System.out.println("El numero de autobuses queridos son: " + numAutoBuses);
			} else {
				numAutoBuses = numPersonas / cupoMax;
				numPersonasFurgo = numPersonas - (numAutoBuses*cupoMax);
				System.out.println("El numero de autobuses queridos son: " + numAutoBuses + " y la cantidad de personas que se van en furgoneta es: " + numPersonasFurgo);
			}
		} else {
			numPersonasFurgo = numPersonas;
			System.out.println("La cantidad de personas en furgoneta es: " + numPersonasFurgo);
		}
	}
}
