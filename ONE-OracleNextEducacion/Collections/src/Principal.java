import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		String variable1 = "Ejemplo 1";
		String variable2 = "Ejemplo 2";
		String variable3 = "Ejemplo 3";
		String variable4 = "Ejemplo 4";
		
		ArrayList<String> lista = new ArrayList<>(); // Lista vacia de Strings
		lista.add(variable1);
		lista.add(variable2);
		lista.add(variable3);
		lista.add(variable4);		
		System.out.println(lista);
		
		lista.remove(2);		
		System.out.println(lista);
		
		lista.set(1, "Ejemplo modificado");
		System.out.println(lista);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i)); // Valor de la posicion i
		}
		
		for( String clase : lista ) {
			System.out.println(clase);
		}
		
		lista.forEach(clase ->{
			System.out.println(clase);
		});
		
		
	}
}
