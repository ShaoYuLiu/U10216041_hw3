import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class BMI1 extends JFrame{
	// Create text field for Name, Age, Weight, Height
	private JTextField jtfName = new JTextField();
	private JTextField jtfAge = new JTextField();
	private JTextField jtfWeight = new JTextField();
	private JTextField jtfHeight = new JTextField();
	private JTextField jtfBMI = new JTextField();
	private JTextField jtfStatus = new JTextField();
	private JButton jbtOK = new JButton("OK!");
	
	public BMI(){
		JPanel p1 = new JPanel(new GridLayout(5, 2));
		p1.add(new JLabel("Name: "));
		p1.add(jtfName);
		p1.add(new JLabel("Age: "));
		p1.add(jtfAge);
		p1.add(new JLabel("Weight(kg): "));
		p1.add(jtfWeight);
		p1.add(new JLabel("Height(cm): "));
		p1.add(jtfHeight);
		
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		p2.add(jbtOK);
		
		JPanel p3 = new JPanel(new GridLayout(2, 2));
		p3.add(new JLabel("BMI= "));
		p3.add(jtfBMI);
		p3.add(new JLabel("Status= "));
		p3.add(jtfStatus);
		
		// Add the panels to the frame
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);
		
		// Regist listener
		jbtOK.addActionListener(new ButtonListener());
	}
	
	private class ButtonListener implements ActionListener{
		private double bmi;
		public void actionPerformed(ActionEvent e){
			double Weight = Double.parseDouble(jtfWeight.getText());
			double Height = Double.parseDouble(jtfHeight.getText());
			
			bmi = Weight / Math.pow((Height/100), 2);
			jtfBMI.setText(String.format("%.2f", bmi));
			if (bmi < 18.5)
				jtfStatus.setText("UnderWeight");
			else if(bmi < 25)
				jtfStatus.setText("Normal");
			else if(bmi < 30)
				jtfStatus.setText("OverWeight");
			else
				jtfStatus.setText("Obese");
		}
	}
	
	public static void main(String[] args){
		BMI frame = new BMI();
		frame.setSize(200, 250);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
