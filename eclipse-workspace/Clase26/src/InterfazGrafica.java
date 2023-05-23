import javax.swing.*;

public class InterfazGrafica extends JFrame{
	private JLabel mensaje1;
	private JLabel mensaje2;
	
	public InterfazGrafica() {
		setLayout(null);
		
		mensaje1 = new JLabel("Interfaz grafica");
		mensaje1.setBounds(10,20,300,30);
		add(mensaje1);

		mensaje2 = new JLabel("Version 1.0");
		mensaje2.setBounds(10,100,100,30);
		add(mensaje2);
	}
	
	public static void main(String args[]) {
		InterfazGrafica formulario = new InterfazGrafica();
		formulario.setBounds(0,0,400,300);
		formulario.setVisible(true);
		formulario.setLocationRelativeTo(null);
		formulario.setResizable(false);
		
	}
}
