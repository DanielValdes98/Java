
public class TestVariables {
	public static void main(String[] args) {
		int age = 24;
		System.out.println("Age: " + age + " years old");
		
		double salary = 1250.70;
		System.out.println("Salary: " + salary);
		
		double variable1 = 230.89;
		int variable1Entero = (int) variable1; // Cambio el tipo de dato a int
		System.out.println(variable1Entero);
		
		long numeroGrande = 122222222222222L;
		short numeroPequenio = 13444;
		byte numeroMasPequenio = 15;
		float numeroDecimalPequenio = 2.5F;
		
		int resultado = (int) variable1 + variable1Entero;
		System.out.println(resultado);
		
        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);
	}
}
