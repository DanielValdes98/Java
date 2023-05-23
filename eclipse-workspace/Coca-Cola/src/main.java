 import java.util.Scanner;
 
public class main {
	public static void main(String args[]) {
		Scanner SC = new Scanner(System.in);
		String nombre = "";
		int clave = 0, antiguedad = 0;
		
		System.out.println("Bienvenido al sistema vacacional de Coca-Cola");
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("¿Cuál es tu nombre?: ");
		nombre = SC.nextLine();
		System.out.println(" ");
		
		System.out.println("¿Cuál es tu departamento(1: Ventas, 2: Call Center, 3: Servicio tecnico)?: ");
		clave = SC.nextInt();
		System.out.println(" ");
		
		System.out.println("¿Cuántos son tus años de servicio?: ");
		antiguedad = SC.nextInt();
		System.out.println(" ");
		
		OperacionVacaciones OV = new OperacionVacaciones();
		OV.CalcularAño(clave, antiguedad, nombre);
	}
}
