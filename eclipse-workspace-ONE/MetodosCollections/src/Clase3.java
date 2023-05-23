import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Clase3 {
	
	public static void main(String[] args) {
		String alumno1 = "Daniel";
		String alumno2 = "Jennifer";
		String alumno3 = "Luciana";
		String alumno4 = "Pepito";
		String alumno5 = "Clara";
		String alumno6 = "Luz";
		
		
		// Set: no tiene orden, no exite una posicion especifica
		Set<String> listaAlumnos = new HashSet<>();
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);

		for(String alumno : listaAlumnos) {
			System.out.println(alumno);
		}

	}
}
