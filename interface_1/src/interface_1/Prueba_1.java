package interface_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.BoxLayout;
import javax.swing.JTextPane;
import javax.swing.JTextField;

public class Prueba_1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba_1 frame = new Prueba_1();
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
	public Prueba_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		// Crear un grupo para los radio buttons
		ButtonGroup group = new ButtonGroup();
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Generar numeros");
		lblNewLabel.setBounds(14, 11, 83, 14);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		contentPane.add(lblNewLabel);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Entre 0 y 100", false);
		rdbtnNewRadioButton_1.setBounds(103, 22, 124, 23);
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1.setAlignmentX(CENTER_ALIGNMENT);
		contentPane.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Entre 100 y 200");
		rdbtnNewRadioButton_2.setBounds(103, 48, 208, 23);
		rdbtnNewRadioButton_2.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton_2.setAlignmentX(CENTER_ALIGNMENT);
		contentPane.add(rdbtnNewRadioButton_2);

		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Entre 200 y 500");
		rdbtnNewRadioButton_3.setBounds(103, 74, 138, 23);
		rdbtnNewRadioButton_3.setAlignmentX(CENTER_ALIGNMENT);
		contentPane.add(rdbtnNewRadioButton_3);

		// Agregar los radio buttons al grupo
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		group.add(rdbtnNewRadioButton_3);

		JButton btnNewButton = new JButton("Generar");
		btnNewButton.setBounds(156, 116, 71, 23);
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Random random = new Random();
                int numeroGenerado = 0;
				if (rdbtnNewRadioButton_1.isSelected()) {
                    numeroGenerado = random.nextInt(101);
                } else if (rdbtnNewRadioButton_2.isSelected()) {
                    numeroGenerado = random.nextInt(101) + 100;
                } else if (rdbtnNewRadioButton_3.isSelected()) {
                    numeroGenerado = random.nextInt(301) + 200; 
                }

                textField.setText(String.valueOf(numeroGenerado)); 
			}
		});
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(140, 165, 126, 43);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}

