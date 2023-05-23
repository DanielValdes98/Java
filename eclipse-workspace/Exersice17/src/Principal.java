import java.util.Scanner;

public class Principal{
    public static void main(String args[]){
    	String usuario = "", password = "";
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Ingrese el usuario: ");
    	usuario = input.nextLine();
    	
    	System.out.println("Ingrese la clave: ");
    	password = input.nextLine();
    	
    	if(usuario.equals("danielv_c")&& password.equals("123")) {
    		System.out.println("Acceso permitido");
    	} else {
    		System.out.println("Malo");
    	}
    	
    }
}