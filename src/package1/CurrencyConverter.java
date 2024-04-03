package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JComboBox comboBox;
	//private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Create the frame.
	 */
	public CurrencyConverter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 602);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(167, 297, 196, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		String [] choices = {"", "Dollars to Euros", "Dollars to YEN", "Dollars to GHA CEDI"};
		
		comboBox = new JComboBox(choices);
		comboBox.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		comboBox.setBounds(373, 292, 153, 43);
		contentPane.add(comboBox);
		
		 JLabel lblNewLabel = new JLabel("Enter a number to convert");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel.setBounds(190, 242, 266, 44);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1.setBounds(190, 392, 266, 63);
		contentPane.add(lblNewLabel_1);
		comboBox.addActionListener(this);
		
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text = textField.getText();
		double x = Double.parseDouble(text);
		if( e.getSource() == comboBox) {
			String selected = comboBox.getSelectedItem().toString();
		
		if(selected.equalsIgnoreCase("Dollars to Euros")) {
			x = x*0.92407459;
			String s = Double.toString(x);
			int result = s.indexOf(".");
			String output = s.substring(0, result + 3);
			lblNewLabel_1.setText(output + " Euros");
			
			
		}
		else if(selected.equalsIgnoreCase("Dollars to YEN")) {
			 x = x* 151.34125;
			 String s = Double.toString(x);
			 int result = s.indexOf(".");
			 String output = s.substring(0, result + 3);
			 lblNewLabel_1.setText(output + " JAP YEN");
			 
		}
		else if(selected.equalsIgnoreCase("Dollars to GHA CEDI")) {
			x = x* 13.000876;
			String s = Double.toString(x);
			int result = s.indexOf(".");
			String output = s.substring(0, result + 3);
			lblNewLabel_1.setText(output + " GHA CEDIS");
			
		}
	}
	}
}
