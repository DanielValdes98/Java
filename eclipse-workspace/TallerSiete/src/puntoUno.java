import java.util.Scanner;

public class puntoUno {	
	
	public void calcularBiciesto() {
		String message;		
		int annio;
		
		Scanner input = new Scanner(System.in);	
	
		System.out.println("CALCULO DE AÑOS BICIESTOS");		
		System.out.print("Introduzca el año: ");
		annio = input.nextInt();
		
		// Un año es bisiesto si es divisible por 4 y no lo es por 100 o si es divisible por 400:		
		if ( ( (annio % 4 == 0) && !(annio % 100 == 0) ) || (annio % 400 == 0)) {
			message = String.format("El año %d es biciesto", annio);
			System.out.println(message);
		} else {
			message = String.format("El año %d no es biciesto", annio);
			System.out.println(message);
		}
	}
}
