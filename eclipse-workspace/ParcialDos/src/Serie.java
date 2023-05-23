public class Serie {

	private String titulo;
	private int NumeroTemporadas = 3;
	private boolean entregado = false;
	private String genero;
	private String creador;
	
	public Serie() {
	}
	
	public Serie(String Titulo, String Creador) {
	    this.titulo = Titulo;
	    this.creador = Creador;
	}
	
	public Serie(String Titulo, int NumeroTemporadas, String genero ,String Creador) {
	    this.titulo = Titulo;
	    this.NumeroTemporadas = NumeroTemporadas;
	    this.genero = genero;
	    this.creador = Creador;
	}	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporadas() {
		return NumeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		NumeroTemporadas = numeroTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", NumeroTemporadas=" + NumeroTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}

	public void entregar() {
	    entregado=true;
	}
	public void devolver() {
	    entregado=false;
	}
	public boolean isEntregado() {
	    if(entregado){
	        return true;
	    }
	    return false;
	}
}