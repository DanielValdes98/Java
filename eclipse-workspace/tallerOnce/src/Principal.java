import java.util.Scanner;

public class Principal {

public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("INGRESE LOS SIGUIENTES DATOS:");
		
		System.out.println("Nombre: ");
		String nombre = input.nextLine();
		
		System.out.println("Edad: ");
		int edad = input.nextInt();
		
		System.out.println("Sexo: ");
		char sexo = input.next().charAt(0);
		
		System.out.println("Peso (kg): ");
		Double peso = input.nextDouble();
		
		System.out.println("Altura (m): ");
		Double altura = input.nextDouble();
	
		Persona personaUno = new Persona(nombre, edad, sexo, peso, altura);
		Persona personaDos = new Persona(nombre, edad, sexo);
		Persona personaTres = new Persona();
		
		personaTres.setNombre("Jennifer");
		personaTres.setEdad(23);
		personaTres.setSexo('M');
		personaTres.setPeso(70);
		personaTres.setAltura(1.71);
		
		System.out.println("Primer persona:");
		System.out.println(personaUno.toString());
		personaUno.MayoriaEdad(personaUno);
		personaUno.comprobarPesoIdeal(personaUno);
		System.out.println();
		
		System.out.println("Segunda persona:");
		System.out.println(personaDos.toString());
		personaDos.MayoriaEdad(personaDos);
		System.out.println();
		
		System.out.println("Tercer persona:");
		System.out.println(personaTres.toString());
		personaTres.MayoriaEdad(personaTres);
		personaTres.comprobarPesoIdeal(personaTres);
	}
}
