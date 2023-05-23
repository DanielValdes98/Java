
public class puntoCuatro {
	static byte b;
	public static void arreglo() {
		byte arregloBytes[] = new byte[10];
		
		for(int i = 0; i < arregloBytes.length; i++) {
			arregloBytes[i] = 1;
		}
		
		for(byte b:arregloBytes) {
			System.out.print(b);
		}
	}
}
