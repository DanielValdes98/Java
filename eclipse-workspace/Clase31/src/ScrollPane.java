import javax.swing.*;

public class ScrollPane extends JFrame{
	private JTextField textfield;
	private JScrollPane scrollpane;
	private JTextArea textarea;
	
	public ScrollPane() {
		setLayout(null);
		
		textfield = new JTextField();
		textfield.setBounds(10,10,200,30);
		add(textfield);
		
		textarea = new JTextArea();
		scrollpane = new JScrollPane(textarea);
		scrollpane.setBounds(10,50,300,200);
		add(scrollpane);		
		
	}	
	
	public static void main(String args[]) {
		ScrollPane formulario = new ScrollPane();
		formulario.setBounds(0,0,520,450);
		formulario.setVisible(true);
		formulario.setLocationRelativeTo(null);
		formulario.setResizable(false);
	}
}
