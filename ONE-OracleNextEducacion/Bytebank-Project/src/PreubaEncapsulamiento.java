
public class PreubaEncapsulamiento {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(0);
		Cliente cliente = new Cliente();
		
		cliente.setNombre("Daniel");
		cliente.setDocumento("F234SGH6");
		cliente.setTelefono("19485849");
		
		Cliente titular = cuenta.getTitular();
		
		cuenta.setTitular(cliente);
		
		System.out.println(cliente);
		System.out.println(cuenta.getTitular());
		System.out.println(titular);
				
	}
}
