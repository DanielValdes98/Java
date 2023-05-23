import java.util.Scanner;

public class Area {
	public static void main(String args[]) {
		Scanner SC = new Scanner(System.in);		
		int base = 0, altura = 0;
		
		System.out.println("Ingrese la base del triangulo: ");
		base = SC.nextInt();
		System.out.println(" ");

		System.out.println("Ingrese la altura del triangulo: ");
		altura = SC.nextInt();
		System.out.println(" ");
		
		float resultado = (base * altura)/2;
		
		System.out.println("El area del triangulo es: " + resultado);

		
		
	}
}
