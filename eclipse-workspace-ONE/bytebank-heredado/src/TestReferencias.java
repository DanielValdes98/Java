
public class TestReferencias {
	public static void main(String[] args) {
		
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Mauricio");
		
		Gerente gerente = new Gerente();
		gerente.setClave("Jennifer");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		gerente.iniciarSesion("Aola");
		
		
	}
}
