//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

//import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
//import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
//import javax.swing.JSplitPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ConversorMonedas extends Conversor implements Convertir, ActionListener, ItemListener{
	
	private static final long serialVersionUID = 1L;
	private double resultado;
	private JPanel contentPane;
	private JTextField textField;
	JButton btnNewButton;
	JButton btnNewButton_1;
	JComboBox<Object> comboBox;
	private static String opcion;
	private static double valor;
	private JTextField textField_1;
	

	public ConversorMonedas(String tipo) {
		super(tipo);
		setResizable(false);
				
		ArrayList<String> opcionesDivisas = new ArrayList<>();
		opcionesDivisas.add("COP a USD");
		opcionesDivisas.add("COP a Euros");
		opcionesDivisas.add("COP a Libras Esterlinas");
		opcionesDivisas.add("COP a Yen Japonés");
		opcionesDivisas.add("COP a Won sul-coreano");
		opcionesDivisas.add("USD a COP");
		opcionesDivisas.add("Euros a COP");
		opcionesDivisas.add("Libras Esterlinas a COP");
		opcionesDivisas.add("Yen Japonés a COP");
		opcionesDivisas.add("Won sul-coreano a COP");
		
		// UI
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 356, 311);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 320, 250);
		contentPane.add(panel);
		panel.setLayout(null);		
		
		JLabel lblNewLabel_2 = new JLabel(tipo);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 11, 300, 14);
		panel.add(lblNewLabel_2);
	
		JLabel lblNewLabel_1 = new JLabel("Ingrese la cantidad de dinero a convertir:");
		lblNewLabel_1.setBounds(10, 49, 248, 14);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			    int caracter = e.getKeyChar();        
			    /* 
			     * Funcion para que solo lea numeros decimales
			     * Si la tecla no es un "." o si es un "." y el JTextField ya contiene uno (o mas) => e.consume()
			     */			     
			    if (((caracter < '0') || (caracter > '9')) 
			            && (caracter != KeyEvent.VK_BACK_SPACE)
			            && (caracter != '.' || textField_1.getText().contains(".")) ) {
			                e.consume();
			    }
			}
		});
		textField_1.setBounds(10, 74, 118, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Elije la moneda a la que deseas convertir tu dinero: ");
		lblNewLabel.setBounds(10, 105, 300, 14);
		panel.add(lblNewLabel);
		
		comboBox = new JComboBox<Object>();
		comboBox.setBounds(10, 130, 185, 22);
		for(Object opcionDivisa : opcionesDivisas) {
			comboBox.addItem(opcionDivisa);
		}
		panel.add(comboBox);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBackground(new Color(221, 221, 221));
		textField.setForeground(new Color(0, 0, 0));
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(10, 163, 185, 45);
		panel.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Convertir");
		btnNewButton.setBounds(10, 219, 89, 23);
		btnNewButton.addActionListener(this);
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(106, 219, 89, 23);
		btnNewButton_1.addActionListener(this);
		panel.add(btnNewButton_1);
	}
		
	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	@Override
	public double Convertidor(double valor, String opcion) {
		
		switch (opcion) {
		case "COP a USD": {
			resultado =  valor / 4732.01;
			System.out.println(resultado);	
			return resultado;
		}
		case "COP a Euros": {
			resultado =  valor / 5030.11;
			System.out.println(resultado);	
			return resultado;
		}
		case "COP a Libras Esterlinas": {
			resultado =  valor / 5640.69;
			System.out.println(resultado);	
			return resultado;
		}
		case "COP a Yen Japonés": {
			resultado =  valor / 34.80;
			System.out.println(resultado);	
			return resultado;
		}
		case "COP a Won sul-coreano": {
			resultado =  valor / 3.62;
			System.out.println(resultado);	
			return resultado;
		}
		case "USD a COP": {
			resultado =  valor * 4732.01;
			System.out.println(resultado);	
			return resultado;
		}
		case "Euros a COP": {
			resultado =  valor * 5030.11;
			System.out.println(resultado);	
			return resultado;
		}
		case "Libras Esterlinas a COP": {
			resultado =  valor * 5640.69;
			System.out.println(resultado);	
			return resultado;
		}
		case "Yen Japonés a COP": {
			resultado =  valor * 34.80;
			System.out.println(resultado);	
			return resultado;
		}
		case "Won sul-coreano a COP": {
			resultado =  valor * 3.62;
			System.out.println(resultado);	
			return resultado;
		}
		default:
			System.out.println("Opción por defecto, no es válida");
			throw new IllegalArgumentException("Unexpected value: " + opcion);
		}
		// return 0;
	}

	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(btnNewButton == e.getSource()) { // e.getSource: Verifica si el btn fue presionado
			if (textField_1.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Digite un valor");
			}
			valor = Double.parseDouble(textField_1.getText());
			opcion = comboBox.getSelectedItem().toString();
			resultado = Convertidor(valor, opcion);
			resultado = Math.round(resultado*100.0)/100.0;
			textField.setText(Double.toString(resultado));
		} else if(btnNewButton_1 == e.getSource()) {
			int continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");			
			if (JOptionPane.NO_OPTION == continuar || JOptionPane.CANCEL_OPTION == continuar) {
				this.setVisible(false);
				JOptionPane.showMessageDialog(null, "Programa terminado");
			} else if(JOptionPane.OK_OPTION == continuar) {
				MenuSeleccion frame = new MenuSeleccion();
				this.setVisible(false);	
				frame.setVisible(true);				
			} 
		} else {
			JOptionPane.showMessageDialog(null, "Programa terminado o restringida");
		}
	}	
} //end class
