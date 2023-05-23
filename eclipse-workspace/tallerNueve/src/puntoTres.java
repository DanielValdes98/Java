import java.util.InputMismatchException;
import java.util.Scanner;

public class puntoTres {
	static int numA, numB, resultado;
	
    public void catchs(){
        Scanner input = new Scanner(System.in);
        
        try {		            
            System.out.print("Ingrese el numero A: ");
            numA = input.nextInt();
            System.out.print("Ingrese el numero B :");
            numB = input.nextInt();
            resultado = numA * numB;
            System.out.print(numA + " * " + numB + " = " + resultado);
            
        } catch (InputMismatchException ex) {
            System.out.println("Debe ser números enteros");
        } 
        
    	/* 
    	 * El bloque try intenta ejecutar las instrucciones definidas, pero si en el transcurso de la ejecución se genera una
    	 * excepción (InputMismatchException) que sucede en la llamada al método 'nextInt' de la clase Scanner, se ejecuta las
    	 * instrucciones definidas en el catch
		 */
    }
}

