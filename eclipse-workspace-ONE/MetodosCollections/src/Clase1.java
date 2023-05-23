import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Clase1 {
	
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
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		cursos.add(curso5);
		cursos.add(curso6);
		cursos.add(curso7);
		cursos.add(curso8);
		
		
		System.out.println(cursos.toString());
		
		// Otras formas sin inplementar Comparable en clase Curso:
		cursos.sort(Comparator.comparing(Curso::getNombre)); 
		System.out.println(cursos);;
		
		Collections.sort(cursos, Comparator.comparing(Curso::getNombre).reversed());
		System.out.println(cursos);
		
		int tiempo = 0;
		for(Curso curso : cursos) {
			tiempo += curso.getTiempo();
		}
		System.out.println(tiempo); //Mide el tiempo de la funcion de arriba
		//Mide el tiempo pero usando otra funcion mas corta
		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).sum()); 

		int mayor = 0;
		for(Curso curso : cursos) {
			if(curso.getTiempo() > mayor)
			mayor = curso.getTiempo();
		}
		System.out.println(mayor); //Escoge el max de la funcion de arriba
		//Escoge el max pero usando otra funcion mas corta
		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt()); 
		
	}
}
