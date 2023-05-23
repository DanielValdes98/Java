
public class TestReferencia2 {
	public static void main(String[] args) {
		
		Cuenta cuentaUser = new Cuenta(240);
		
		// Opcion 1:
		Cliente cliente = new Cliente();
		cuentaUser.setTitular(cliente); 
				
		//Opcion 2:
		Cliente titular = new Cliente();
		cuentaUser.setTitular(titular);
		titular.setNombre("Daniel");
		
		System.out.println(cuentaUser.getTitular().getNombre());
	}
}
