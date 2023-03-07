
public class Administrador extends Funcionario implements Autenticable {
	
	private AutenticacionUtil util;
	
	public Administrador() {
		this.util = new AutenticacionUtil();
	}
	
	public void setClave(String clave) {
		this.util.setClave(clave);
	}
	
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}

	@Override
	public double getBonificacion() {
		return this.getSalario();
	}

}
