import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
	  String cadena1;
	  String cadena2;
	  
	  Scanner input = new Scanner(System.in);
	  System.out.println("Ingrese la primer cadena: ");
	  cadena1 = input.next();
	  
	  System.out.println("Ingrese la segunda cadena: ");
	  cadena2 = input.next();

	  String[][] cadenas = {
                {cadena1, cadena2},

        };
        for (String[] par : cadenas) {
            System.out.println(String.format("'%s' y '%s' son anagramas? %b", par[0], par[1], esAnagrama(par[0], par[1])));
        }
  }

	  // Ordenar una cadena
    public static String ordenar(String cadena) {
        char[] caracteres = cadena.toCharArray();
        Arrays.sort(caracteres);
        return new String(caracteres);
    }

    // Anagrama
    public static boolean esAnagrama(String cadena, String posibleAnagrama) {
        // Convertir a minúsculas, remplazar signos de puntuación y remplazar vocales acentuadas
        cadena = cadena.toLowerCase().replace(" ", "").replace(".", "").replace(",", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
        posibleAnagrama = posibleAnagrama.toLowerCase().replace(" ", "").replace(".", "").replace(",", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
        // Ordenar de la misma manera
        cadena = ordenar(cadena);
        posibleAnagrama = ordenar(posibleAnagrama);
        // Regresar resultado de la comparación
        return cadena.equals(posibleAnagrama);
    }
}