import javax.swing.*;

import java.awt.event.*;

public class TextFields extends JFrame implements ActionListener {
	private JTextField textfield;
	private JLabel label;
	private JButton boton;
	
	public TextFields() {
		setLayout(null);
		
		textfield = new JTextField();
		textfield.setBounds(150, 50, 100,30);
		add(textfield);
		
		label = new JLabel("Usuario: ");
		label.setBounds(50, 50, 100, 30);
		add(label);
		
		boton = new JButton("Aceptar");
		boton.setBounds(50, 150, 100, 30);
		add(boton);
		boton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton) {
			String texto = textfield.getText();
			setTitle(texto);
		}
	}
	
	public static void main(String args[]) {
		TextFields formulario = new TextFields();
		formulario.setBounds(0,0,450,300);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}
}
