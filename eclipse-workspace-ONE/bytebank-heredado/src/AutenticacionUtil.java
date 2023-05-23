
public class AutenticacionUtil {
	
	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
        return this.clave == clave;	  
	}
}
