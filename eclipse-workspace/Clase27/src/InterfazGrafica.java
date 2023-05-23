import javax.swing.*; // Crea el diseño, crea los componenetes
import java.awt.event.*; // Controla los eventos de los componentes de la interfaz, las funcionalidades de los componentes

public class InterfazGrafica extends JFrame implements ActionListener {
	JButton boton; 
	
	public InterfazGrafica() {
		setLayout(null);
		
		boton = new JButton("Cerrar");
		boton.setBounds(300, 250, 100, 30);
		add(boton);
		boton.addActionListener(this); // A este boton se le va a agregar un evento (funcionalidad)
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton) {
			System.exit(0); // Cierre la interfaz grafica
		}
	}

	public static void main(String args[]) {
		InterfazGrafica formulario = new InterfazGrafica();
		formulario.setBounds(0,0,450,350);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);

	}	
}
