import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {
	private JButton boton;
	private JTextField textfiled;
	private JTextArea textarea;
	private JScrollPane pane;
	
	String texto = "";
	
	public Formulario() {
		setLayout(null);		
		
		textfiled = new JTextField();
		textfiled.setBounds(10,10,200,30);
		add(textfiled);
				
		boton = new JButton("Agregar");
		boton.setBounds(250,10,100,30);
		add(boton);
		boton.addActionListener(this);

		textarea = new JTextArea();
		pane = new JScrollPane(textarea);
		pane.setBounds(10,50,400,300);
		add(pane);
		
		pane = new JScrollPane(textarea);
		pane.setBounds(10,50,300,200);
		add(pane);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton) {
			texto += textfiled.getText() + "\n";
			textarea.setText(texto);
			textfiled.setText("");
		}
	}
	
	public static void main(String args[]) {
		Formulario formulario1 = new Formulario();
		formulario1.setBounds(0,0,500,400);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null);
		formulario1.setResizable(false);
	}
}
