import java.util.Scanner;

public class PrincipalArreglo {
    public static void main(String args[]) {
        
        int longitud = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la longitud del vector: ");
        longitud = input.nextInt();

        int vector[] = new int[longitud];
        int valor = 0;

        int i = 0;
        for(int v:vector) {
            String mensaje = String.format("Ingrese el valor de la posicion %d: ", i);
            System.out.println(mensaje);
            valor = input.nextInt();
            vector[i] = valor;
            i++;
        }
        for(int c:vector) {
        	System.out.print("[" + c + "]");
        }
    }
}
        