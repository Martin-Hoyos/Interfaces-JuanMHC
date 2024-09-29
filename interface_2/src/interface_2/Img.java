package interface_2;

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Img extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblNewLabel_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Img frame = new Img();
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
    public Img() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 450); // Aumenté el tamaño de la ventana
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        ButtonGroup group = new ButtonGroup();
        
        JButton btnNewButton = new JButton("Salir");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Salir nuevaVentana = new Salir();
                nuevaVentana.setVisible(true);
            }
        });
        btnNewButton.setBounds(315, 45, 89, 23);
        contentPane.add(btnNewButton);

        JRadioButton rdbtnNewRadioButton = new JRadioButton("Perro");
        rdbtnNewRadioButton.setBounds(25, 96, 109, 23);
        contentPane.add(rdbtnNewRadioButton);
        
        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Gato");
        rdbtnNewRadioButton_1.setBounds(25, 159, 109, 23);
        contentPane.add(rdbtnNewRadioButton_1);
        
        JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Tigre");
        rdbtnNewRadioButton_2.setBounds(25, 230, 109, 23);
        contentPane.add(rdbtnNewRadioButton_2);
        
        JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Leon");
        rdbtnNewRadioButton_3.setBounds(25, 304, 109, 23);
        contentPane.add(rdbtnNewRadioButton_3);
        
        group.add(rdbtnNewRadioButton);
        group.add(rdbtnNewRadioButton_1);
        group.add(rdbtnNewRadioButton_2);
        group.add(rdbtnNewRadioButton_3);

        JLabel lblNewLabel = new JLabel("Elija una opción para ver la imagen");
        lblNewLabel.setBounds(52, 25, 219, 14);
        contentPane.add(lblNewLabel);

        lblNewLabel_1 = new JLabel();
        lblNewLabel_1.setBounds(216, 96, 300, 231); // Aumenté el tamaño del JLabel
        contentPane.add(lblNewLabel_1);

        // Listener para las imágenes
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (rdbtnNewRadioButton.isSelected()) {
                    mostrarImagen("C:/Users/Martin/Pictures/Saved Pictures/1653826510_995351_1653826595_noticia_normal.jpg");
                } else if (rdbtnNewRadioButton_1.isSelected()) {
                    mostrarImagen("C:/Users/Martin/Pictures/Saved Pictures/75552.ngsversion.1422285553360.jpg");
                } else if (rdbtnNewRadioButton_2.isSelected()) {
                    mostrarImagen("C:/Users/Martin/Pictures/Saved Pictures/nationalgeographic_2810728.jpg");
                } else if (rdbtnNewRadioButton_3.isSelected()) {
                    mostrarImagen("C:/Users/Martin/Pictures/Saved Pictures/Leon-Selwo-Aventura-3.jpg");
                }
            }
        });
    }

    private void mostrarImagen(String ruta) {
        ImageIcon img = new ImageIcon(ruta);
        if (img.getImageLoadStatus() != java.awt.MediaTracker.COMPLETE) {
            // Mensaje de error si la imagen no se carga
            JOptionPane.showMessageDialog(null, "No se pudo cargar la imagen. Verifique la ruta.");
        } else {
            System.out.println("La imagen fue cargada correctamente"); // Mensaje de depuración
            lblNewLabel_1.setIcon(img);  // Directamente poner el ícono sin escalado por ahora
        }
    }
}
