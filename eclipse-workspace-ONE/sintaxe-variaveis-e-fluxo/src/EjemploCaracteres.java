
public class EjemploCaracteres {
	public static void main(String[] args) {
		
		char caracter = 'a';
		System.out.println(caracter);
		
		caracter = 65;
		System.out.println(caracter);
		
		caracter = 65 + 1;
		System.out.println(caracter);
		
		//char segundoCaracter = caracter + 1; // No funciona porque la variable ya esta definida como tipo char
		char segundoCaracter = (char) (caracter + 1);
		System.out.println(segundoCaracter);
		
		String frase = "Alura Cursos Online";
		System.out.println(frase);
		System.out.println(frase + " 2023");
	}
}
