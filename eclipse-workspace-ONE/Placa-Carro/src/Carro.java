
public class Carro {
	
	public static boolean validaPlaca(String placa) {
		
		placa = placa.replaceAll("[^a-zA-Z0-9]", "");

		if(placa.length()!= 7) {
			return false;
		}
		
		if(!placa.substring(0,3).matches("[A-Z]*")) {
			return false;
		}
	
		return placa.substring(3).matches("[0-9]*");
	}
}
