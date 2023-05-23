public interface Entregable {
	
	public static boolean entregar(boolean entregado) {
	        return entregado = true;
	}
	 
	    
	public static boolean devolver(boolean entregado) {
        return entregado = false;
	}	
	
	
    public static boolean isEntregado(boolean entregado) {
    	return entregado;
    }
    
    public static int compareTo(String a, String b) {
    	return a.compareTo(b);
    }
}