
public class Carro {
	public static void main(String args[]) {
		int puertas = 5;
		int incremento = 1;
		int resultado = puertas + incremento;
		
		auto miCoche = new auto(resultado);		
		
		System.out.println("Puertas: " + resultado);		
		System.out.println("Puertas implementando la fnción: " + miCoche.IncrementarPuertas(resultado));
	}
}
