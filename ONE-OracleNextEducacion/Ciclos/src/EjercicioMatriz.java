
public class EjercicioMatriz {
	public static void main(String[] args) {
		for(int row = 0; row <= 10; row++) {
			for (int col = 0; col <= 10; col++) {
				if (col > row) {
					break;
				}
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
