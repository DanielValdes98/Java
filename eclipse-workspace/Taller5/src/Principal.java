import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		//String listaFinal[] = {};
		String[] listaFinal = new String[10]; 
		int digito;
		
		for (int i = 0; i < listaFinal.length; i++) {
			System.out.println("Ingrese el digito: ");
			digito = input.nextInt();
			
			if(digito == 1) {
				listaFinal[i] = "D";
			} else if(digito == 2) {
				listaFinal[i] = "W";
			} else if(digito == 3) {
				listaFinal[i] = "E";
			} else if(digito == 4) {
				listaFinal[i] = "L";
			} else if(digito == 5) {
				listaFinal[i] = "H";
			} else if(digito == 6) {
				listaFinal[i] = "O";
			} else if(digito == 7) {
				listaFinal[i] = "R";
			}
		}
		System.out.print(listaFinal.toString());
	}
}
