public class Cuenta {

	private String titular;
	private double cantidad;
	
	public Cuenta(String t, double c) {
		this.titular = t;
		
		if(c < 0) {
			this.cantidad = 0;
		} else {
			this.cantidad = c;		
		}
	}
	
	public String getTitular() {
		return this.titular;		
	}
	
	public void setTitular( String t ) {
		this.titular = t;		
	}
	
	public double getCantidad() {
		return this.cantidad;		
	}
	
	public void setCantidad(Double c) {
		this.cantidad = c;
	}
	
	public void ingresar(double c) {
	  if(c > 0){
		  this.cantidad += c;		  
	  }
	}
	
	 public void retirar(double c) {
		 if(this.cantidad - c < 0){
			 this.cantidad = 0;
		 }
	 }
	 
	public String toString() {
		return "Cuenta [titular=" + this.titular + ", cantidad=" + this.cantidad + "]";
	}
}