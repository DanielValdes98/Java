public class Videojuego {
	/*
	private final static int HORAS_ESTIMADAS_DEF=10;
	public final static int MAYOR=1;
	public final static int MENOR=-1;
	public final static int IGUAL=0;
	*/
	private String titulo;
	private int horasEstimadas = 10;
	private boolean entregado = false;
	private String genero;
	private String compania;
	
	public Videojuego() {
		
	}
	
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}
	
	public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compania = compania;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compania=" + compania + "]";
	}
	
	public boolean entregar() {
        return this.entregado = true;
	}
	 
	    
	public boolean devolver() {
	    return this.entregado = false;
	}	
	
	
	public boolean isEntregado() {
		return entregado;
	}
	
	public static int compareTo(String a, String b) {
		return a.compareTo(b);
	}
	
	
}