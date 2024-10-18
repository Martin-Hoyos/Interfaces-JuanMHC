package Calcu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JTextField;

public class CAl extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CAl frame = new CAl();
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
	public CAl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(e -> {
			textField.setText(textField.getText() + "1");
		});
		btnNewButton.setBounds(76, 89, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		btnNewButton_1.setBounds(209, 89, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		btnNewButton_2.setBounds(76, 134, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("5");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		btnNewButton_3.setBounds(209, 134, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("3");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		btnNewButton_4.setBounds(327, 89, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btnNewButton_5.setBounds(327, 134, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		btnNewButton_6.setBounds(76, 189, 89, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		btnNewButton_7.setBounds(209, 189, 89, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		btnNewButton_8.setBounds(327, 189, 89, 23);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		btnNewButton_9.setBounds(209, 253, 89, 23);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("+");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "  +  ");
			}
		});
		btnNewButton_10.setBounds(485, 89, 89, 23);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("-");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "  -  ");
			}
		});
		btnNewButton_11.setBounds(485, 134, 89, 23);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("x");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "  *  ");
			}
		});
		btnNewButton_12.setBounds(485, 189, 89, 23);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("/");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "  /  " );
			}
		});
		btnNewButton_13.setBounds(485, 253, 89, 23);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("Borrar");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_14.setBounds(327, 253, 89, 23);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton(".");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		btnNewButton_15.setBounds(76, 253, 89, 23);
		contentPane.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("=");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String expression = textField.getText();
			        if (expression.contains(" + ")) {

			            String[] partes = expression.split("\\+"); 
			            double num1 = Double.parseDouble(partes[0].trim());
			            double num2 = Double.parseDouble(partes[1].trim());
			            double resultado = num1 + num2;
			            textField.setText(String.valueOf(resultado));
			        } else if (expression.contains(" - ")) {

			            String[] partes = expression.split("-");
			            double num1 = Double.parseDouble(partes[0].trim());
			            double num2 = Double.parseDouble(partes[1].trim());
			            double resultado = num1 - num2;
			            textField.setText(String.valueOf(resultado));
			        } else if (expression.contains(" * ")) {

			            String[] partes = expression.split("\\*");
			            double num1 = Double.parseDouble(partes[0].trim());
			            double num2 = Double.parseDouble(partes[1].trim());
			            double resultado = num1 * num2;
			            textField.setText(String.valueOf(resultado));
			        } else if (expression.contains(" / ")) {

			            String[] partes = expression.split("/");
			            double num1 = Double.parseDouble(partes[0].trim());
			            double num2 = Double.parseDouble(partes[1].trim());
			            if (num2 != 0) {
			                double resultado = num1 / num2;
			                textField.setText(String.valueOf(resultado));
			            } else {
			                textField.setText("Error: División por 0");
			            }
			        }  else if (expression.contains("√")) {
	
		                String numberStr = expression.replace("√", "").trim();
		                double number = Double.parseDouble(numberStr);
		                double resultado = Math.sqrt(number);
		                textField.setText(String.valueOf(resultado));
		        }else if (expression.contains("²")) {
		        	String cuadrado = expression.replace("²", "").trim();
		        	double number=Double.parseDouble(cuadrado);
		        	double resultado = number * number;
		        	textField.setText(String.valueOf(resultado));
		        }else if(expression.contains("³")) {
		        	String cuadrado = expression.replace("³", "").trim();
		        	double number=Double.parseDouble(cuadrado);
		        	double resultado = number * number* number;
		        	textField.setText(String.valueOf(resultado));
		        }
			}
		});
        btnNewButton_16.setBounds(435, 28, 89, 23);
        contentPane.add(btnNewButton_16);
        
        textField = new JTextField();
        textField.setBounds(28, 11, 388, 51);
        contentPane.add(textField);
        textField.setColumns(10);
        
        JButton btnNewButton_17 = new JButton("√");
        btnNewButton_17.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		textField.setText(textField.getText() + "√");
        	}
        });
        btnNewButton_17.setBounds(485, 312, 89, 23);
        contentPane.add(btnNewButton_17);
        
        JButton btnNewButton_18 = new JButton("χ²");
        btnNewButton_18.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		textField.setText(textField.getText() + "²");
        	}
        });
        btnNewButton_18.setBounds(327, 312, 89, 23);
        contentPane.add(btnNewButton_18);
        
        JButton btnNewButton_19 = new JButton("X³");
        btnNewButton_19.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		textField.setText(textField.getText() + "³");
        	}
        });
        btnNewButton_19.setBounds(209, 312, 89, 23);
        contentPane.add(btnNewButton_19);
        
        JButton btnNewButton_20 = new JButton("Log");
        btnNewButton_20.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String input = textField.getText();
                

                if (!input.isEmpty()) {
 
                    double number = Double.parseDouble(input);
                    

                    double logBase10 = Math.log10(number);
                    

                    textField.setText(String.valueOf(logBase10));
        	}
        	}
        });
        btnNewButton_20.setBounds(76, 312, 89, 23);
        contentPane.add(btnNewButton_20);
        
        
        
    }
}

