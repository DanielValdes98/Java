import java.util.Scanner;

public class Principal {
    public static void main(String args[]){
    	String cadena_original = "", cadena_subtraccion = "";
    	int num_car = 0, desde = 0, hasta = 0;
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Introduce una cadena de carateres: ");
    	cadena_original = input.nextLine();
    	
    	num_car = cadena_original.length();
    	
    	System.out.println("La cadena " + cadena_original + " posee " + num_car + " carateres");
    	
    	System.out.println("Desde qué caracter empezamos: ");
    	desde = input.nextInt();
    	System.out.println("Hasta qué caracter : ");
    	hasta = input.nextInt();
    	
    	cadena_subtraccion = cadena_original.substring(desde, hasta);
    	System.out.println("Nueva cadena: " + cadena_subtraccion);
    	
    	
    }
}
