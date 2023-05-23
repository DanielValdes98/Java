import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int botes;
		double altura = 0;
		double largo = 0;
		double ancho = 0;
		double area = 0;
		int bote5 = 1500; // pies cuadrados
		int bote1 = 300; // pies cuadrados
		int cantidadBotes = 0;
		int cantidadBotesAdicional = 0;
		int precio = 0;
		int precioAdicional = 0;
		double residuo;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese la altura: ");
		altura = input.nextDouble();
		
		System.out.println("Ingrese el largo: ");
		largo = input.nextDouble();
		
		System.out.println("Ingrese el ancho: ");
		ancho = input.nextDouble();
		
		area = largo * ancho;
		area *= 10.7639; // pasar de m2 a pies cuadrados
		System.out.println("El area que se va a pintar es de: " + area + " pies cuadrados");
		
		if(area <= 300) {
			cantidadBotes = 1;
			precio = 4;
			String message = String.format("Se necesita %d bote de 1 litro y se debe pagar %d $", cantidadBotes, precio);
			System.out.println(message);
		} else if (area > 300 && area < 1500) {
			cantidadBotes = (int) Math.ceil(area / bote1);
			precio = cantidadBotes * 4;
			String message = String.format("Se necesitan %d botes de 5 litros y se debe pagar %d $", cantidadBotes, precio);
			System.out.println(message);
		} else {
			cantidadBotes = (int) (area / bote5);
			precio = cantidadBotes * 15;
			String message = String.format("Se necesitan %d botes de 5 litros y se debe pagar %d $", cantidadBotes, precio);
			System.out.println(message);
			residuo = area % bote5;
			if((residuo) < 1500) {
				cantidadBotesAdicional = (int) Math.ceil(residuo / bote1);
				precioAdicional = cantidadBotesAdicional * 4;
				precio += precioAdicional;
				String message1 = String.format("Adicionalmente se necesitan %d bote(s) de 1 litro, se agregan %d $ adicionales. El total serian %d", cantidadBotesAdicional, precioAdicional, precio);
				System.out.println(message1);
			}
		}	
	} //end of main
} //end of class