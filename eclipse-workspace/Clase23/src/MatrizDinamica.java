import java.util.Scanner;

public class MatrizDinamica {
	public static void main(String args[]) {
		
		int rows = 0, columns = 0, contador = 1;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Cuantas filas?");
		rows = input.nextInt();
		
		System.out.println("Cuantas columnas?");
		columns = input.nextInt();
		
		int matriz[][] = new int[rows][columns];
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				matriz[i][j] = contador;
				contador++;
				System.out.print("[" + matriz[i][j] + "]");
			}
			System.out.println("");
		}
		
		
	}
}
