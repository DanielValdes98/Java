
public class TestCuentaExceptionSaldo {
	
	public static void main(String[] args) {
		Cuenta cuenta = new CuentaAhorros(123);
		
		cuenta.depositar(1100);
		try {
			cuenta.retirar(1100);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(cuenta.getSaldo());
	}
}
