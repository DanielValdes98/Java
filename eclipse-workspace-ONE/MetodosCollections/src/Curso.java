import java.util.List;
import java.util.ArrayList;

public class Curso {
	
	private String nombre;
	private int tiempo;
	private List<Aula> claseList = new ArrayList<>();
	
	public Curso(String nombre, int tiempo) {
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	
	public Curso(String nombre, int tiempo, List<Aula> claseList) {
		this.nombre = nombre;
		this.tiempo = tiempo;
		this.setClaseList(claseList);
	}
	
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Aula> getAulaList() {
		return claseList;
		// return Collections.unmodifiableList(claseList); //No se puede modificar la lista
	}

	public void setClaseList(List<Aula> claseList) {
		this.claseList = claseList;
	}	
	
	public void addAula(Aula clase) {
		this.claseList.add(clase);
	}

	@Override
	public String toString() {
		return this.nombre;
	}
}
