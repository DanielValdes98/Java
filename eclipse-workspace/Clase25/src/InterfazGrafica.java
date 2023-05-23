import javax.swing.*;

public class InterfazGrafica extends JFrame {
	
	public InterfazGrafica() {
		setLayout(null); // Indica que vamos a hacer uso de coordenadas
		
		
	}
	
    public static void main(String args[]) {
    	InterfazGrafica formulario = new InterfazGrafica();
    	formulario.setBounds(0,0,400,300);
    	formulario.setVisible(true);
    	formulario.setLocationRelativeTo(null);
    	formulario.setResizable(false); // Permiso para modificar el tamaño de la interfaz o no
    }
}
