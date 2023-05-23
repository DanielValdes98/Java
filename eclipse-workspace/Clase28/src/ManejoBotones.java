import javax.swing.*;
import java.awt.event.*;

public class ManejoBotones extends JFrame implements ActionListener {
	private JButton boton1, boton2, boton3;
	private JLabel label1;
	
	public ManejoBotones() {
		setLayout(null);
		
		boton1 = new JButton("1");
		boton1.setBounds(100, 200, 100, 30);
		add(boton1);
		boton1.addActionListener(this);
		
		boton2 = new JButton("2");
		boton2.setBounds(200, 200, 100, 30);
		add(boton2);
		boton2.addActionListener(this);
		
		boton3 = new JButton("3");
		boton3.setBounds(300, 200, 100, 30);
		add(boton3);
		boton3.addActionListener(this);
		
		label1 =  new JLabel("En espera...");
		label1.setBounds(100,100,150,30);
		add(label1);

	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton1) {
			System.out.println("El numero es: " + 1);
			label1.setText("El numero es 1");
		} else if(e.getSource() == boton2) {
			System.out.println("El numero es: " + 2);
			label1.setText("El numero es 2");
		} else {
			System.out.println("El numero es: " + 3);
			label1.setText("El numero es 3");
		}
	}
	
	public static void main(String args[]) {
		ManejoBotones formulario = new ManejoBotones();
		formulario.setBounds(0,0,450,350);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}
}
