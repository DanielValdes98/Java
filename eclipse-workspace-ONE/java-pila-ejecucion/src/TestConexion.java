
public class TestConexion {

	public static void main(String[] args) throws Exception {
		
		try(Conexion con = new Conexion()){
			con.leerDatos();
		} catch (IllegalStateException e) {
			System.out.println("Ejecutando catch");
			e.printStackTrace();
		}
		
		/*
        Conexion con = null;
		try{
	        con = new Conexion();
	        con.leerDatos();
		} catch(IllegalStateException ex){
		        System.out.println("Surgio un error en la conexion");
		        ex.printStackTrace();
		} finally {
			System.out.println("Ejecutando finally");
	        if (con != null){
	        	con.cerrar();
	        }
		}*/
		
		
	}
}
