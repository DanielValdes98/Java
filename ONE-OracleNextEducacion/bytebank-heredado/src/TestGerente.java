
public class TestGerente {
	public static void main(String[] args) {
		
		Gerente gerenteX = new Gerente();		
		gerenteX.setSalario(5000);
		gerenteX.setClave("AluraCursosOnline");
		
		
		boolean auth = gerenteX.iniciarSesion("AluraCursosOnline");
		System.out.println(gerenteX.getBonificacion());
		System.out.println(auth);
		
	}
}
