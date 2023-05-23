import java.util.Scanner;

public class puntoDos {	
	
	static int contador = 0;
	static int numTem;	
	static int numero;
	static Scanner input = new Scanner(System.in);	
	
	public static void menu() {
	
		digitos();
		
	}
		public static void digitos() {			
		
		System.out.println("CALCULAR LAS CIFRAS DE UN NUMERO");		
		System.out.print("Introduzca el numero: ");
		numero = input.nextInt();
		
		do {
			numero = numero / 10;
			contador++;
			
		} while (numero != 0);

			System.out.println("la cantidad de digitos es : " + contador);
			contador = 0;
			
			pregunta();
			
		}	
		
		public static void pregunta() {
			System.out.println("Marque 1 si desaa digitar otro numero o marque 0 si no desea continuar ");
			numTem = input.nextInt();
			if(numTem == 1) {
				digitos();
			} else {
				salida();	
			}
		}
		
		public static void salida() {
			System.out.println("El programa a finalizado"); 
		}		
}

