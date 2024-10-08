package Menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import java.awt.Scrollbar;
import java.awt.ScrollPane;

public class Menu_interactivo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_interactivo frame = new Menu_interactivo();
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
	public Menu_interactivo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRO DE PERSONAS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(122, 11, 182, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo");
		lblNewLabel_1.setBounds(21, 43, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(68, 40, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(68, 91, 136, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(12, 94, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Edad");
		lblNewLabel_3.setBounds(258, 94, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(301, 91, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Profesion");
		lblNewLabel_4.setBounds(12, 150, 55, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(68, 147, 136, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Telefono");
		lblNewLabel_5.setBounds(258, 150, 55, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(311, 147, 113, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("REGISTRAR ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(85, 209, 119, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CANCELAR");
		btnNewButton_1.setBounds(227, 209, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("Tabla usando matriz de datos");
		lblNewLabel_6.setBounds(36, 263, 150, 14);
		contentPane.add(lblNewLabel_6);
		
		
		JLabel lblNewLabel_7 = new JLabel("Usando table model ");
		lblNewLabel_7.setBounds(36, 417, 362, 32);
		contentPane.add(lblNewLabel_7);
        
        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(36, 473, 362, 117);
        contentPane.add(scrollPane_1);
        
        table_2 = new JTable();
        table_2.setModel(new DefaultTableModel(
        	new Object[][] {
        		{"8", "8", "8", null, "51", null},
        		{"1", "1", "21", "21", "5", null},
        		{"42", "428", "4", "84", "84", "842"},
        		{"84", "82", "482", "4", "284", "8"},
        		{"482", "428", "4", "284", "28", "428"},
        		{"42", "842", "8", "428", "428", "42"},
        		{"842", "8", "428", "42", "842", "8"},
        		{"428", "42", "842", "82", "48", null},
        	},
        	new String[] {
        		"New column", "New column", "New column", "New column", "New column", "New column"
        	}
        ));
        scrollPane_1.setViewportView(table_2);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(36, 288, 362, 129);
        contentPane.add(scrollPane);
        
        table = new JTable();
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        	},
        	new String[] {
        		"Codigo", "Nombre", "Edad", "Profesion", "Telefono"
        	}
        ));
        scrollPane.setViewportView(table);
		
	}
}
