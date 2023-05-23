
public class puntoTres {
	public static void matriz() {
		long arreglo[][] = new long[4][3];
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				arreglo[i][j] = 5;
			}
		}
		
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(arreglo[i][j]);
			}
			
			System.out.println();
			}
	}
}
