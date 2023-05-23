import javax.swing.*;
import java.awt.event.*;

public class Conversion extends JFrame implements ActionListener {
	private JLabel label1;
	private JLabel label2;
	private JLabel resultado;
	private JTextField file1;
	private JTextField file2;
	private JButton boton;
	
	public Conversion() {
		setLayout(null);
		
		label1 = new JLabel("Valor 1: ");
		label1.setBounds(50,5,100,30);
		add(label1);
		
		label2 = new JLabel("Valor 2: ");
		label2.setBounds(50,35,100,30);
		add(label2);
		
		file1 = new JTextField();
		file1.setBounds(120,10,150,20);
		add(file1);
		
		file2 = new JTextField();
		file2.setBounds(120,40,150,20);
		add(file2);
		
		boton = new JButton("Sumar");
		boton.setBounds(10,80,100,30);
		add(boton);
		boton.addActionListener(this);
		
		resultado = new JLabel("Resultado: ");
		resultado.setBounds(120,80,100,30);
		add(resultado);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton) {
			int valor1 = 0, valor2 = 0, suma = 0;
			valor1 = Integer.parseInt(file1.getText());
			valor2 = Integer.parseInt(file2.getText());
			suma = valor1 + valor2;
			resultado.setText("Resultado: " + suma);
		}
	}
	public static void main(String args[]) {
		Conversion formulario = new Conversion();
		formulario.setBounds(0,0,350,200);
		formulario.setVisible(true);
		formulario.setLocationRelativeTo(null);
		formulario.setResizable(false);
	}
}
