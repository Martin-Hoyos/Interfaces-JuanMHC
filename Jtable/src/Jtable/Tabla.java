package Jtable;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tabla extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabla frame = new Tabla();
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
	public Tabla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "2", "3", "4", "5", "6", "7", "8"},
				{"9", "10", "11", "12", "13", "14", "15", "16"},
				{"17", "18", "19", "20", "21", "22", "23", "24"},
				{"25", "26", "27", null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(27, 11, 397, 222);
		contentPane.add(table);
		 table.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                int row = table.getSelectedRow();
	                int col = table.getSelectedColumn();
	                Object value = table.getValueAt(row, col);

	                if (value != null && value instanceof String) {
	                    try {
	                        int number = Integer.parseInt((String) value);
	                        if (isPrime(number)) {
	                            JOptionPane.showMessageDialog(null, number + " es un número primo.");
	                        } else {
	                            JOptionPane.showMessageDialog(null, number + " no es un número primo.");
	                        }
	                    } catch (NumberFormatException ex) {
	                        // No hacer nada si el valor no es un número
	                    }
	                }
	            }
	        });
	}

	    // Método para comprobar si un número es primo
	    private boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
}