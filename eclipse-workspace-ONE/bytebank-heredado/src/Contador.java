
public class Contador extends Funcionario implements Autenticable{

	@Override
	public double getBonificacion() {
		return 200;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}

}
