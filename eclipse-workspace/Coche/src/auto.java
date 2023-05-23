
public class auto {
	private int puertas;
	
	public auto(int p) {
		puertas = p;
	}
	
	public int IncrementarPuertas(int p) {
		this.puertas = p + 1;
		return puertas;
	}
}
