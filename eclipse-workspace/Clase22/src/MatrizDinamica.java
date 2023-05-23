import java.util.Scanner;

public class MatrizDinamica {
	public static void main(String args[]) {
		int filas = 0;
		int columnas = 0;
		int contador = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite el numero de filas: ");
		filas = input.nextInt();
		
		System.out.println("Digite el numero de columnas: ");
		columnas = input.nextInt();
		
		int numeros[][] = new int[filas][columnas];

		
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < columnas; j++) {
				numeros[i][j] = contador;
				contador++;
				System.out.print("[" + numeros[i][j]+ "]");
			}
			System.out.println("");
		}
	}
}
