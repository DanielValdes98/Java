
public class Gerente extends Funcionario{
	
	
	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		   if (this.clave == clave) {
		        return true;
		    } else {
		        return false;
		    }
	}
	
	// Sobre-escritura del método
	public double getBonificacion() {
		return super.getSalario() + super.getBonificacion();
	}
}
