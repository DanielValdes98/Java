
public class Conversor {

	private String ocpiones;
	private double valor;
	private double resultado;
	
	public Conversor(String opciones, double valor) {
		this.ocpiones = opciones;
		this.valor = valor;
	}
	
	public String getOcpiones() {
		return ocpiones;
	}
	public void setOcpiones(String ocpiones) {
		this.ocpiones = ocpiones;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
}
