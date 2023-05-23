import java.util.Scanner;

public class Ecuacion {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);		
		int X = 0, Y = 0, Z = 0;
		
		System.out.println("Ingrese el valor de X: ");
		X = num.nextInt();
		
		System.out.println("Ingrese el valor de Y: ");
		Y = num.nextInt();
		
		System.out.println("Ingrese el valor de Z: ");
		Z = num.nextInt();
		
		System.out.println(" ");
		
		
		double a = (Math.pow(X, 5) - 6)/4;
		System.out.println("A:  " + a);
		System.out.println(" ");
		
		double b = Math.pow(X, Y) - Math.pow(6, X);
		System.out.println("B:  " + b);
		System.out.println(" ");
		

		double c = 4 * Math.cos(Z/5) - Math.sin(Math.pow(X, 2));
		System.out.println("C:  " + c);
		System.out.println(" ");
		
double d = Math.pow(X, 4) - Math.sqrt((6*X - Math.pow(Y, 3)));
		System.out.println("D:  " + d);
		System.out.println(" ");
		
		double e = 1 / ( Y - (1 / ( X - Math.pow(2, Y)) ));
		System.out.println("E:  " + e);
		System.out.println(" ");
		
		
double f = 7 * Math.cos(Math.sqrt(5 - Math.sin(Math.sqrt((3 * X) - 4))));
		System.out.println("F:  " + f);
		System.out.println(" ");
	}
}
