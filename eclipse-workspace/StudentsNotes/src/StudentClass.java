
public class StudentClass {
	private int DNI;
	private String nombre;
	private double nota;
	
	public StudentClass(int dni, String name, double note) {
		this.DNI = dni;
		this.nombre = name;
		this.nota = note;
	}
	
	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

}
