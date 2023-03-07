import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Clase2 {
	
	public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {
		{
			add(new LinkedList<>());
			add(new ArrayList<>());
		}
	};
	
	
	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Ruby", 30);
		Curso curso2 = new Curso("Python", 20);
		Curso curso3 = new Curso("Java", 41);
		Curso curso4 = new Curso("React", 15);
		Curso curso5 = new Curso("Angular", 30);
		Curso curso6 = new Curso("Go", 10);
		Curso curso7 = new Curso("C++", 45);
		Curso curso8 = new Curso("C#", 5);
		Curso curso9 = new Curso("Python", 20);
		Curso curso0 = new Curso("C++", 45);
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		cursos.add(curso5);
		cursos.add(curso6);
		cursos.add(curso7);
		cursos.add(curso8);		
		cursos.add(curso9);	
		cursos.add(curso0);	
		System.out.println(cursos.toString());

		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).sum()); 
		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).average().getAsDouble());
		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).min().getAsInt()); 
		
		// Creamos un mapa
		Map<String, List<Curso>> groupCurso = cursos.stream().collect(Collectors.groupingBy(Curso::getNombre));
		groupCurso.forEach((key, value) -> System.out.println(key + " - " + value.size()));
		
		System.out.println(cursos.parallelStream().filter(curso -> !curso.getNombre().equalsIgnoreCase("C#")).mapToInt(Curso::getTiempo).sum());

		
	}
}
