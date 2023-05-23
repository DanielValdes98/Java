import java.util.Iterator;

public class TestCiclosWhile {
	public static void main(String[] args) {
		System.out.println("Ciclos");
		
		int contador = 0;
		int total = 0;
		
		while(contador < 10) {
			System.out.println(contador);
			contador += 1;		
			total = total + contador;
		}
		System.out.println("Total: " + total);
	}
}
