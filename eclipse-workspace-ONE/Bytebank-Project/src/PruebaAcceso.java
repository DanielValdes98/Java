
public class PruebaAcceso {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(200);	
		
		cuenta.depositar(500);
		cuenta.retirar(350);		
		System.out.println(cuenta.getSaldo());
		System.out.println(cuenta.getAgencia());
	}
}
