import java.util.Scanner;

public class ArregloDos {
    public static void main(String args[]) {
        
        int longitud = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la longitud del vector: ");
        longitud = input.nextInt();

        int vector[] = new int[longitud];
        int valor = 0;

        for(int v:vector) {
            String mensaje = String.format("Ingrese el valor de la posicion %d: ", v);
            System.out.println(mensaje);
            valor = input.nextInt();
            vector[v] = valor;
            System.out.println(vector);
        }
    }
}
        