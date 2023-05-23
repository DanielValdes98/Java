import javax.swing.*;

public class InterfazGrafica extends JFrame{
	private JLabel label1;
	
	public InterfazGrafica(){ // Constructor: Permite construir cosas pero en un,lugar donde se invoca
		setLayout(null); // Metodo para indicar que vamos a usar coordenadas para ubicar los elementos
		label1 = new JLabel("Ejercico de Daniel");
		label1.setBounds(10,20,200,300); //(X,Y, ancho, alto)
		add(label1);
	}
	
	public static void main(String args[]) {
		InterfazGrafica formulario = new InterfazGrafica(); // Se crea un objeto del tipo InterfazGrafica (JFrame)
		formulario.setBounds(0,0,400,300);
		formulario.setVisible(true); // Para que se vea la interfaz, sino poner false
		formulario.setLocationRelativeTo(null); // Cuando se aparezca que se vea en el centro de la pantalla
		
	}
}
