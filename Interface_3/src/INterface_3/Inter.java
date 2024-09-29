package INterface_3;

import java.awt.EventQueue;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inter extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private DefaultListModel<String> modelVocales;
	private DefaultListModel<String> modelConsonantes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inter frame = new Inter();
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
	public Inter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese palabra");
		lblNewLabel.setBounds(29, 11, 113, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(162, 8, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.setBounds(282, 7, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Comienza con vocal");
		lblNewLabel_1.setBounds(69, 54, 129, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Comienza con consonante");
		lblNewLabel_2.setBounds(248, 54, 170, 14);
		contentPane.add(lblNewLabel_2);
		
		modelVocales = new DefaultListModel<>();
		modelConsonantes = new DefaultListModel<>();

		JList<String> list_1 = new JList<>(modelVocales);
		list_1.setBounds(58, 79, 113, 154);
		contentPane.add(list_1);
		
		JList<String> list_2 = new JList<>(modelConsonantes);
		list_2.setBounds(247, 79, 124, 154);
		contentPane.add(list_2);

		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String palabra = textField.getText().trim();
				if (!palabra.isEmpty()) {
					char primeraLetra = palabra.toLowerCase().charAt(0);
					if (esVocal(primeraLetra)) {
						modelVocales.addElement(palabra);
					} else {
						modelConsonantes.addElement(palabra);
					}
					textField.setText(""); 
				}
			}
		});
	}


	private boolean esVocal(char letra) {
		return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
	}
}
