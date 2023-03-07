import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

public class MenuConversor extends JFrame implements ActionListener, ItemListener {

	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("Seleccione la opcion de la conversión:");
	JButton btnNewButton;
	JComboBox<Object> comboBox;
	Object[] opcionesConversion = {"Conversor de monedas","Conversor de temperatura"};
	//Object unitChoice = JOptionPane.showInputDialog(null, "seleccione", "conversor", JOptionPane.QUESTION_MESSAGE, null, opcionesConversion, opcionesConversion[1]);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuConversor frame = new MenuConversor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuConversor() {
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
			if(opcionConversionSeleccionada.equals(opcionesConversion[0])) {
				System.out.println("Convitiendo moneda...");				
				//double  monto = Double.parseDouble(valor);				
				Conversor newConversor = new Conversor();
				newConversor.setVisible(true);
			} else if(opcionConversionSeleccionada.equals(opcionesConversion[1])) {
				System.out.println("Convitiendo temperatura...");
			} else {
				JOptionPane.showMessageDialog(btnNewButton, "Error, opción no registrada");
			}
		}		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
}
