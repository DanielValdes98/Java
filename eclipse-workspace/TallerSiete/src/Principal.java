import java.util.Scanner;

public class Principal {
public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		puntoUno biciesto = new puntoUno();
		puntoDos cifras = new puntoDos();
		
		System.out.println("¿Qué desea hacer?" + "\n" + "1. Si desea conocer el año bisiesto" + "\n" + "2. Si quiere conocer la cantidad de digitos ");
		int opcion = input.nextInt();
		
		if(opcion == 1 ) {
			biciesto.calcularBiciesto();
		} else if(opcion == 2) {
			cifras.menu();
		} else {
			System.out.println("Opción no valida");
		}
	}
}
