import javax.swing.*;

public class TextArea extends JFrame {
	private JTextArea textArea;
	private JTextField textfield;
	
	public TextArea() {
		setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(10,50,400,250);
		add(textArea);
		
		textfield = new JTextField();
		textfield.setBounds(10,10,200,30);
		add(textfield);
	}
	
	public static void main(String args[]) {
		TextArea formulario = new TextArea();
		formulario.setBounds(0,0,450,350);
		formulario.setVisible(true);
		formulario.setLocationRelativeTo(null);
		formulario.setResizable(false);
	}
}
