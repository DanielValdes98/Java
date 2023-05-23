import java.util.Scanner;

public class puntoCuatro {
	public static int numerador = 10;
	public static Integer denominador = 0;
	public static float division;
	 
	public void errores () {
		 
		 Scanner digite = new Scanner(System.in);
		 
		 
		 /* 
		 // Error de sintaxis:
		 int a;
		 int b;		 
		 int suma;
		 
		 System.out.println("Ingrese el numero A ");
		 a = digite.nextInt();
		 
		 System.out.println("Ingrese el numero B ");
		 b = digite.nextInt();
		 
		 suma = a + b;
		 
		 System.out.println("La suma es: " + SUMA);
		 
		 */
		 
		 /* 
		 // Error lógico: 
		 int a;
		 int b;		 
		 int suma;
		 
		 System.out.println("Ingrese el numero A ");
		 a = digite.nextInt();
		 
		 System.out.println("Ingrese el numero B ");
		 b = digite.nextInt();
		 
		 suma = a / b;
		 
		 System.out.println("La suma es: " + suma);
		 */			 
		 
		
		 //Excepcion:
		 System.out.println("No he hecho la división");
		 division = numerador / denominador;
		 System.out.println("Despues de hacer la división");
		 	 
	 }
}