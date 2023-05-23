import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MenuSeleccion extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("Seleccione la opcion de la conversión:");
	JButton btnNewButton;
	JComboBox<Object> comboBox;
	Object[] opcionesConversion = {"Conversor de monedas","Conversor de temperatura"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuSeleccion frame = new MenuSeleccion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MenuSeleccion() {
		setResizable(false);
		setTitle("Menú");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 287, 167);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 251, 106);
		contentPane.add(panel);
		panel.setLayout(null);
		lblNewLabel.setBounds(10, 11, 180, 28);
		panel.add(lblNewLabel);
		
		comboBox = new JComboBox<Object>();
		comboBox.setBounds(10, 40, 180, 22);		
		for(Object opcion : opcionesConversion) {
			comboBox.addItem(opcion);
		}
		panel.add(comboBox);		
		
		btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(10, 73, 89, 23);
		btnNewButton.addActionListener(this);
		panel.add(btnNewButton);	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(btnNewButton == e.getSource()) { // e.getSource: Verifica si el btn fue presionado
			String opcionConversionSeleccionada = comboBox.getSelectedItem().toString();
			System.out.println(opcionConversionSeleccionada);
			
			if(opcionConversionSeleccionada == "Conversor de monedas") {
				ConversorMonedas conversorMoneda = new ConversorMonedas(opcionConversionSeleccionada);
				conversorMoneda.setVisible(true);				
				this.setVisible(false);
			} else if (opcionConversionSeleccionada  == "Conversor de temperatura") {
				ConversorTemperatura conversorMoneda = new ConversorTemperatura(opcionConversionSeleccionada);
				conversorMoneda.setVisible(true);				
				this.setVisible(false);
			} else {
				System.out.println("Error, opcion no registrada en nuestro sistema");
			}
		}
	}

}
