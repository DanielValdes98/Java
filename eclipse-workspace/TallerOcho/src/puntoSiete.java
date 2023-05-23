import java.util.Scanner;

public class puntoSiete {
	
	public void promedio() {
		Scanner input = new Scanner(System.in);
		String message;
		int nota;
		int suma = 0;
		double prom = 0;
		
		int arrayNotas[] = new int[5];
		
		for(int i = 0; i < arrayNotas.length; i++) {
			message = String.format("Digite la nota de la prueba %d: ", i);
			System.out.println(message);
			nota = input.nextInt();
			arrayNotas[i] = nota;
			suma = suma + arrayNotas[i];
		}
		
		//for(int valor:arrayNotas) {
			//System.out.println(valor);
		//}
		
		prom = suma/5;
		System.out.println("El promedio de las 5 notas es de: " + prom);

		
	}
}
