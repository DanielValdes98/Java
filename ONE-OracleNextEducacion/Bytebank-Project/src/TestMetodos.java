
public class TestMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta(100);
		miCuenta.depositar(350);
		
		miCuenta.depositar(2000);
		System.out.println(miCuenta.getSaldo()); 
		
		System.out.println(miCuenta.retirar(3000));
		System.out.println(miCuenta.getSaldo());
		
		Cuenta cuentaAlternativa = new Cuenta(200);
		cuentaAlternativa.depositar(50000);		
		
		boolean puedeTransferir = cuentaAlternativa.transferir(1000, miCuenta);
		
		if (puedeTransferir) {
			System.out.println("Transferencia exitosa");
		} else {
			System.out.println("No es posible");
		}
		
		System.out.println(cuentaAlternativa.getSaldo());
		System.out.println(miCuenta.getSaldo());
	}
}
