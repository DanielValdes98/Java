
public class TestIR {
	public static void main(String[] args) {
		double salario = 3300.0;

		if(salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("El IR es: " + salario*0.075);
            System.out.println("Su tasa es 7%");
            System.out.println("Usted puede deducir hasta $ 142");
		} else if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("El IR es: " + salario*0.15);
			System.out.println("Su tasa es 15%");
            System.out.println("Usted puede deducir hasta $ 350");
		} else if (salario >= 3751.01 && salario <= 4664.0) {
			System.out.println("El IR es: " + salario*0.225);
            System.out.println("Su tasa es 22.5%");
            System.out.println("Usted puede deducir hasta $ 636");
		}
	}
}
