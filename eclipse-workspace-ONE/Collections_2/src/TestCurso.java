
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TestCurso {
	
	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Java", 30);
		curso1.addAula(new Aula("ArrayList"));
		curso1.addAula(new Aula("List"));
		curso1.addAula(new Aula("LinkedList"));
		
		List<Aula> aulaList = curso1.getAulaList(); // Obliga a usar add
		aulaList.add(new Aula("Inmutable")); // Adiciona la lista
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		
		System.out.println(cursos.get(0).getAulaList());

	}
}