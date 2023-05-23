
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Class2 {
	
	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Ruby", 30);
		Curso curso2 = new Curso("Python", 20);
		Curso curso3 = new Curso("Java", 41);
		Curso curso4 = new Curso("React", 10);
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		System.out.println(cursos.toString());
		
		Collections.sort(cursos);
		System.out.println(cursos);
		
		Collections.sort(cursos, Collections.reverseOrder());
		System.out.println(cursos);
		
		// Otras formas sin inplementar Comparable en clase Curso:
		cursos.sort(Comparator.comparing(Curso::getNombre)); 
		System.out.println(cursos);;
		
		Collections.sort(cursos, Comparator.comparing(Curso::getNombre).reversed());
		System.out.println(cursos);

	}
}
