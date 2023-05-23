
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Class1 {
	
	public static void main(String[] args) {
		String curso1 = "Matematicas";
		String curso2 = "Español";
		String curso3 = "Historia";
		String curso4 = "Etica";
		
		ArrayList<String> cursos = new ArrayList<>(); // Lista de cursos vacia de Strings
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);		
		System.out.println(cursos);
		
		Collections.sort(cursos); // Modifica la lista y crea una nueva en orden ascendente
		System.out.println(cursos);
		
		Collections.sort(cursos, Collections.reverseOrder()); // Orden descendente
		System.out.println(cursos);
		
		cursos.sort(Comparator.reverseOrder()); // Orden descendente
		System.out.println(cursos);
		
		cursos.sort(Comparator.naturalOrder()); // Orden ascendente
		System.out.println(cursos);
		
		 //Devuelve una lista nueva
		List<String> cursosList = cursos.stream().sorted().collect(Collectors.toList());
		System.out.println(cursosList);
		
		
	}
}
