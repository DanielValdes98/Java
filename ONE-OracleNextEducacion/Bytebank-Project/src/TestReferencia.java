
public class TestReferencia {
	public static void main(String[] args) {
		Cliente user = new Cliente();
		user.setNombre("Daniel");
		user.setDocumento("1144208104");
		user.setTelefono("3104189457");
		
		Cuenta cuentaUser = new Cuenta(299); 
		cuentaUser.setTitular(user);
		cuentaUser.depositar(1000);;
		
		System.out.println(cuentaUser.getTitular());
		System.out.println(user);
	}
}
