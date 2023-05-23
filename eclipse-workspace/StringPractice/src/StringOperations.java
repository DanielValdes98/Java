import java.util.Scanner;

public class StringOperations {
	public static void main(String[] args){
		String materia = "APO II";
		String profesor = materia  + " con el professor Hector"; // Concatenar
		String horario = " los sabados de 2 – 5pm ";
		
		System.out.println(profesor);
		System.out.println(profesor += horario);		
	}
}

