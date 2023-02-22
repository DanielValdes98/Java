
public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNombre("Daniel");
		funcionario.setDocumento("1144208104");
		funcionario.setSalario(2000);
		
		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.getBonificacion());
	}
	
}
