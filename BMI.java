import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;


public class BMI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMI frame = new BMI();
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
	public BMI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWeight = new JLabel("weight");
		lblWeight.setBounds(120, 115, 46, 15);
		contentPane.add(lblWeight);
		
		JLabel lblHeight = new JLabel("height");
		lblHeight.setBounds(120, 160, 46, 15);
		contentPane.add(lblHeight);
		
		textField = new JTextField();
		textField.setBounds(242, 22, 96, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(242, 67, 96, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(164, 229, 87, 23);
		contentPane.add(btnOk);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(120, 25, 46, 15);
		contentPane.add(lblName);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(120, 70, 46, 15);
		contentPane.add(lblAge);
		
		textField_2 = new JTextField();
		textField_2.setBounds(242, 112, 96, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(242, 157, 96, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}
}
