import java.util.Scanner;

public class Principal {
	
	public static void main(String args[]) {
		int DNI = 0;
		String nombre;
		double nota = 0.0;		
		int longitud = 2;
			
		Scanner input = new Scanner(System.in);		
		StudentClass arrayStudents[] = new StudentClass[longitud];
		
		for(int i = 0; i < arrayStudents.length; i++) {
			String message = String.format("Ingrese el DNI del estudiante %d: ", i);
			System.out.print(message);
			DNI = input.nextInt();
			
			String message1 = String.format("Ingrese nombre del estudiante %d: ", i);
			System.out.print(message1);
			nombre = input.next();
			
			String message2 = String.format("Ingrese la nota del estudiante %d: ", i);
			System.out.print(message2);
			nota = input.nextDouble();
			
			System.out.println("");
		
			arrayStudents[i] = new StudentClass(DNI, nombre, nota);		
		}
		
		for(StudentClass j:arrayStudents) {
			System.out.println("Estudiante " + j.getNombre() + " identificado con el numero " + j.getDNI() + " tiene una nota de: " + j.getNota());		
		}
		
		double max = arrayStudents[0].getNota();
		String estudiante = null;
		int identificacion = 0;

		for(int j = 0; j < arrayStudents.length; j++) {
			
			if(arrayStudents[j].getNota() > max) {
				max = arrayStudents[j].getNota();
				estudiante = arrayStudents[j].getNombre();
				identificacion = arrayStudents[j].getDNI();
			}
		}
		System.out.println("");
		System.out.println("La nota mayor es de: " + max + ". Estudiante " + estudiante + " codigo " + identificacion);
	}
}


