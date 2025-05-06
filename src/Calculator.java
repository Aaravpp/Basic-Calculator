import java.awt.Color;

import javax.swing.*;

public class Calculator {
	
	JFrame jf;
	JLabel displayLabel;
	
	public Calculator() {
		
		jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(500, 550);
		jf.setLocation(520, 100);
		
		displayLabel = new JLabel();
		displayLabel.setBounds(20, 50, 445, 60);
		displayLabel.setBackground(Color.LIGHT_GRAY);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.black);
		jf.add(displayLabel);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

	public static void main(String[] args) {
		
		new Calculator();
		
	}

}	