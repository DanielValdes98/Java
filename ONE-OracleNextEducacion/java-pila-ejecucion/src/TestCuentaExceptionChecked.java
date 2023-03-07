
public class TestCuentaExceptionChecked {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		try {
			cuenta.depostita();
			System.out.println("Se ejecuta sin problema");
		} catch (MyException e) {
			System.out.println("Excepcion atrapada");
			e.printStackTrace();
		}
	}
}
