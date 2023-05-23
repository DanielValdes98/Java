
public class OperacionVacaciones {
	public void CalcularAño(int clave, int antiguedad, String nombre) {
		if(clave == 1) {
			if(antiguedad < 1) {
				System.out.println("Aun no estas en periodo de vaciones");
			} else if(antiguedad == 1) {
				System.out.println(nombre + ", derecho a 6 dias");
			} else if(antiguedad >= 2 && antiguedad <= 6) {
				System.out.println(nombre + ", derecho a 14 dias");
			} else {
				System.out.println(nombre + ", derecho a 20 dias");
			}
		} else if(clave == 2) {
			if(antiguedad < 1) {
				System.out.println("Aun no estas en periodo de vaciones");
			} else if(antiguedad == 1) {
				System.out.println(nombre + ", derecho a 7 dias");
			} else if(antiguedad >= 2 && antiguedad <= 6) {
				System.out.println(nombre + ", derecho a 15 dias");
			} else {
				System.out.println(nombre + ", derecho a 22 dias");
			}
		} else if(clave == 3) {
			if(antiguedad < 1) {
				System.out.println("Aun no estas en periodo de vaciones");
			} else if(antiguedad == 1) {
				System.out.println(nombre + ", derecho a 10 dias");
			} else if(antiguedad >= 2 && antiguedad <= 6) {
				System.out.println(nombre + ", derecho a 20 dias");
			} else {
				System.out.println(nombre + ", derecho a 30 dias");
			}
		}else {
			System.out.println("Esa opcion no existe. Intentelo de nuevo.");
		}
	}
}
