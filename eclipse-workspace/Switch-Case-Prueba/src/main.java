
public class main {
	public static void main(String args[]) {
		int numA = 5, numB = 3, resultado = 0;
		int operacion = 3;
				
		switch (operacion) {
		case 1:
			resultado = numA + numB;
			System.out.println("El resultado es: " + resultado);
			break;
			
		case 2:
			resultado = numA - numB;
			System.out.println("El resultado es: " + resultado);
			break;
				
		case 3:
			resultado = numA * numB;
			System.out.println("El resultado es: " + resultado);
			break;
					
		case 4:
			resultado = numA / numB;
			System.out.println("El resultado es: " + resultado);
			break;

		default:
			System.out.println("Error, la opcion no existe");
			break;
		}
	}
}
