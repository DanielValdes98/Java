
public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario daniel = new Contador();
		daniel.setSalario(2000);
		
		Gerente jennifer = new Gerente();
		jennifer.setSalario(10000);
		
		Contador victor = new Contador();
		victor.setSalario(5000);
		
		ControlBonificacion control = new ControlBonificacion();
		control.registrarSalario(daniel);
		control.registrarSalario(jennifer);
		control.registrarSalario(victor);

		
		
	}
}