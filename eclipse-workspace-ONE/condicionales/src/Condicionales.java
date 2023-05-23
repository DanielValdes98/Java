
public class Condicionales {
	public static void main(String[] args) {
		System.out.println("Clase condicionales:");

		int edad = 28;
		int cantidadPersonas = 2;
		boolean esPareja = cantidadPersonas > 1;
		boolean puedeEntrar = edad >= 18 && esPareja;
		
		System.out.println("Valor de la condicion: " + esPareja);
		
		if (puedeEntrar) {
			System.out.println("Puede acceder");
		} else {
			System.out.println("NO es permitido el ingreso");
		}
	}
}
