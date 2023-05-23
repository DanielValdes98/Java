
public class CrearCuenta {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(1000);
		primeraCuenta.depositar(1000);
		System.out.println(primeraCuenta.getSaldo());
		System.out.println(primeraCuenta.getAgencia());
		
		Cuenta segundaCuenta = new Cuenta(500);
		segundaCuenta.depositar(2000);
		System.out.println(segundaCuenta.getSaldo());
		System.out.println(segundaCuenta.getAgencia());
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta); 
	}
}
