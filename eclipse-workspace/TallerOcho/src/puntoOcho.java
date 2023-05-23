import java.util.Scanner;

public class puntoOcho {	
	
	static int arregloA[][] = new int[2][2];
	static int arregloB[][] = new int[2][2];
	static int arregloResultado[][] = new int[2][2];
	static int p1, p2, p3, p4;
	static int response;
	
	static int numero;
	static Scanner input = new Scanner(System.in);	
	static String message;
	static int opcion; 
	static int eleccion; 
	
	public static void menu() {
	
		digitos();
		
	}
		public static void digitos() {			
		
			for(int i = 0; i < arregloA.length; i++) {
				for(int j = 0; j < arregloA.length; j++) {
					message = String.format("Arreglo A: Introduzca el numero de la fila %d y columna %d: ", i, j);
					System.out.print(message);
					numero = input.nextInt();
					arregloA[i][j] = numero;				
				}
			}	
			
			for(int i = 0; i < arregloB.length; i++) {
				for(int j = 0; j < arregloB.length; j++) {
					message = String.format("Arreglo B: Introduzca el numero de la fila %d y columna %d: ", i, j);
					System.out.print(message);
					numero = input.nextInt();
					arregloB[i][j] = numero;				
				}
			}
			
			pregunta();
		}	
		
		public static void ciclo() {
			
			System.out.println("¿Desea continuar? (1/0): ");
			response = input.nextInt();
			
			while(response != 0) {
		
				pregunta();
			}
			
			salida();
		}
		
		public static void pregunta() {
			System.out.println("Elija la opcion: "
					+ "\n " + "1. Enter Arreglo A"
					+ "\n " + "2. Enter Arreglo B"
					+ "\n " + "3. Display A + B"
					+ "\n " + "4. Display A - B"
					+ "\n " + "5. Display A * B"
					+ "\n " + "6. Exit"
			);	
			
			opcion = input.nextInt();
			
			switch (opcion) {
			case 1:
				arregloResultado = arregloA;
				for(int i = 0; i < 2; i++){
					for(int j = 0; j < 2; j++){
					System.out.print(arregloResultado[i][j]);
					}
					System.out.println();
					}
				break;
				
			case 2:
				arregloResultado = arregloB;
				for(int i = 0; i < 2; i++){
					for(int j = 0; j < 2; j++){
					System.out.print(arregloResultado[i][j]);
					}
					System.out.println();
					}
				break;
				
			case 3:
				arregloResultado = suma(arregloA, arregloB);
				
				for(int i = 0; i < 2; i++){
					for(int j = 0; j < 2; j++){
					System.out.print(arregloResultado[i][j]);
					}
					System.out.println();
					}
				break;
			
			case 4:
				arregloResultado = resta(arregloA, arregloB);
				
				for(int i = 0; i < 2; i++){
					for(int j = 0; j < 2; j++){
					System.out.print(arregloResultado[i][j]);
					}
					System.out.println();
					}
				break;
			
			case 5:
				arregloResultado = multiplicar(arregloA, arregloB);
				
				for(int i = 0; i < 2; i++){
					for(int j = 0; j < 2; j++){
					System.out.print(arregloResultado[i][j]);
					}
					System.out.println();
					}
				break;
				
			case 6:
				salida();
				break;

			default:
				System.out.println("Opcion no valida");
				ciclo();
				break;
			}
			
			ciclo();
			
		}
		
		public static int[][] suma(int [][] arregloA, int [][] arregloB) {
			p1 = arregloA[0][0] + arregloB[0][0];
			p2 = arregloA[0][1] + arregloB[0][1];
			p3 = arregloA[1][0] + arregloB[1][0];
			p4 = arregloA[1][1] + arregloB[1][1];
			
			arregloResultado[0][0] = p1; 
			arregloResultado[0][1] = p2;
			arregloResultado[1][0] = p3;
			arregloResultado[1][1] = p4;
			
			return arregloResultado ;
		}
		
		public static int[][] resta(int [][] arregloA, int [][] arregloB) {
			p1 = arregloA[0][0] - arregloB[0][0];
			p2 = arregloA[0][1] - arregloB[0][1];
			p3 = arregloA[1][0] - arregloB[1][0];
			p4 = arregloA[1][1] - arregloB[1][1];
			
			arregloResultado[0][0] = p1; 
			arregloResultado[0][1] = p2;
			arregloResultado[1][0] = p3;
			arregloResultado[1][1] = p4;
			
			return arregloResultado ;
		}
		
		public static int[][] multiplicar(int [][] arregloA, int [][] arregloB) {
			p1 = (arregloA[0][0] * arregloB[0][0]) + (arregloA[0][1] * arregloB[1][0]);
			p2 = (arregloA[0][0] * arregloB[0][1]) + (arregloA[0][1] * arregloB[1][1]);
			p3 = (arregloA[1][0] * arregloB[0][0]) + (arregloA[1][1] * arregloB[1][0]);
			p4 = (arregloA[1][0] * arregloB[0][1]) + (arregloA[1][1] * arregloB[1][1]);
			
			arregloResultado[0][0] = p1; 
			arregloResultado[0][1] = p2;
			arregloResultado[1][0] = p3;
			arregloResultado[1][1] = p4;
			
			return arregloResultado ;
		}
		
		public static void salida() {
			System.out.println("El programa a finalizado"); 
		}	
}