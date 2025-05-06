import java.awt.*;
import javax.swing.*;

public class Calculator {
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton,eightButton,nineButton;
	JButton fourButton,fiveButton,sixButton;
	JButton oneButton,twoButton,threeButton;
	JButton dotButton,zeroButton,equalButton;
	
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
		
		fourButton = new JButton("4");
		fourButton.setBounds(20, 250, 70, 70);
		
		jf.add(fourButton);
		
		fiveButton = new JButton("5");
		fiveButton.setBounds(120, 250, 70, 70);
		
		jf.add(fiveButton);
		
		sixButton = new JButton("6");
		sixButton.setBounds(220, 250, 70, 70);
		
		jf.add(sixButton);
		
		oneButton = new JButton("1");
		oneButton.setBounds(20, 350, 70, 70);
		
		jf.add(oneButton);
		
		twoButton = new JButton("2");
		twoButton.setBounds(120, 350, 70, 70);
		
		jf.add(twoButton);
		
		threeButton = new JButton("3");
		threeButton.setBounds(220, 350, 70, 70);
		
		jf.add(threeButton);
		
		dotButton = new JButton(".");
		dotButton.setBounds(20, 450, 70, 70);
		
		jf.add(dotButton);
		
		zeroButton = new JButton("0");
		zeroButton.setBounds(120, 450, 70, 70);
		
		jf.add(zeroButton);
		
		equalButton = new JButton("=");
		equalButton.setBounds(220, 450, 70, 70);
		
		jf.add(equalButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

	public static void main(String[] args) {
		
		new Calculator();
		
	}

}	