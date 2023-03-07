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

public class Clase5 {
	
	public static void main(String[] args) {
		Alumno alumno1 = new Alumno("Daniel","001");
		Alumno alumno2 = new Alumno("Jennifer","002");
		Alumno alumno3 = new Alumno("Luciana","003");
		Alumno alumno4 = new Alumno("Pepito","004");
		Alumno alumno5 = new Alumno("Clara","005");
		Alumno alumno6 = new Alumno("Luz","006");
		
		
		// Set: no tiene orden, no exite una posicion especifica
		Collection<Alumno> listaAlumnos = new ArrayList<>();
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		
		Alumno alumnoNuevo = new Alumno("Daniel", "001");
		
		System.out.println(alumno1.equals(alumnoNuevo));
		System.out.println(listaAlumnos.contains(alumnoNuevo));

	}
}
