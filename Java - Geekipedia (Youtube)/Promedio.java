public class Promedio {
	public static void main(String args[]){
		int matematicas = 5;
		int biologia = 8;
		int quimica = 7;
		float promedio = 0;

		promedio = (matematicas + biologia + quimica) / 3;

		if (promedio >= 3) {
			System.out.println("El alumnó aprobó con: " + promedio);
		} else {
			System.out.println("El alumno no aprobó con: " +  promedio);
		}

	}
}