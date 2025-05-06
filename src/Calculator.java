import java.awt.*;
import javax.swing.*;

public class Calculator {
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton,eightButton,nineButton;
	
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
		
		
		sevenButton = new JButton("7");
		sevenButton.setBounds(20, 150, 70, 70);
		
		jf.add(sevenButton);
		
		eightButton = new JButton("8");
		eightButton.setBounds(120, 150, 70, 70);
		
		jf.add(eightButton);
		
		nineButton = new JButton("9");
		nineButton.setBounds(220, 150, 70, 70);
		
		jf.add(nineButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

	public static void main(String[] args) {
		
		new Calculator();
		
	}

}	