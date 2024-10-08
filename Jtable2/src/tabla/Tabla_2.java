package tabla;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tabla_2 extends JFrame {

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
					Tabla_2 frame = new Tabla_2();
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
	public Tabla_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Paca", "Garte", "23"},
				{"Ana Lisa", "Melchoto", "12"},
				{"Rosa", "Melpito", "43"},
				{"Monica ", "Galindo", "63 "},
				{"Lali", "Cuadora", "21"},
				{"Mary", "Quita Sosvos", "19"},
				{"Flor D.", "Turra", "26"},
				{"Ana", "Tomia", "18"},
				{"Evelin", "Munda", "35"},
				{"Roque ", "Joso", "27"},
				{"German", "Teca", "41"},
			},
			new String[] {
				"Nombre", "Apellido", "Edad"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(88);
		table.getColumnModel().getColumn(1).setPreferredWidth(87);
		table.getColumnModel().getColumn(2).setPreferredWidth(83);
		table.setBounds(21, 29, 387, 202);
		contentPane.add(table);
	}
}
