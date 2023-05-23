public class Operacion {
	public static void main(String args[]) {
		int a = 8;
		int b = 4;
		float resultado = 0;
		int operacion = 3;
		
		
		if(operacion == 1) {
			resultado = a + b;
			System.out.println("La suma es: " + resultado);
		} 
		else if(operacion == 2) {
			resultado = a - b;
			System.out.println("La resta es: " + resultado);
		}
		else if(operacion == 3) {
			resultado = a * b;
			System.out.println("La multiplicacion es: " + resultado);
		}
		else if(operacion == 4) {
			resultado = a / b;
			System.out.println("La division es: " + resultado);
		} else {
			System.out.println("Esa opcion no existe");
		}

	}
}