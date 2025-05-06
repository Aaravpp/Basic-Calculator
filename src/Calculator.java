import java.awt.*;
import javax.swing.*;

public class Calculator {
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton,eightButton,nineButton;
	JButton fourButton,fiveButton,sixButton;
	JButton oneButton,twoButton,threeButton;
	JButton dotButton,zeroButton,equalButton;
	JButton divButton,mulButton,minusButton,plusButton;
	
	public Calculator() {
		
		jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(500, 580);
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
		sevenButton.setFont(new Font("Arial", Font.BOLD, 25));
		
		jf.add(sevenButton);
		
		eightButton = new JButton("8");
		eightButton.setBounds(120, 150, 70, 70);
		eightButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(eightButton);
		
		nineButton = new JButton("9");
		nineButton.setBounds(220, 150, 70, 70);
		nineButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(nineButton);
		
		fourButton = new JButton("4");
		fourButton.setBounds(20, 245, 70, 70);
		fourButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(fourButton);
		
		fiveButton = new JButton("5");
		fiveButton.setBounds(120, 245, 70, 70);
		fiveButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(fiveButton);
		
		sixButton = new JButton("6");
		sixButton.setBounds(220, 245, 70, 70);
		sixButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(sixButton);
		
		oneButton = new JButton("1");
		oneButton.setBounds(20, 345, 70, 70);
		oneButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(oneButton);
		
		twoButton = new JButton("2");
		twoButton.setBounds(120, 345, 70, 70);
		twoButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(twoButton);
		
		threeButton = new JButton("3");
		threeButton.setBounds(220, 345, 70, 70);
		threeButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(threeButton);
		
		dotButton = new JButton(".");
		dotButton.setBounds(20, 445, 70, 70);
		dotButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(dotButton);
		
		zeroButton = new JButton("0");
		zeroButton.setBounds(120, 445, 70, 70);
		zeroButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(zeroButton);
		
		equalButton = new JButton("=");
		equalButton.setBounds(220, 445, 70, 70);
		equalButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(equalButton);
		
		divButton = new JButton("/");
		divButton.setBounds(320, 150, 70, 70);
		divButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(divButton);
		
		mulButton = new JButton("x");
		mulButton.setBounds(320, 245, 70, 70);
		mulButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(mulButton);
		
		minusButton = new JButton("-");
		minusButton.setBounds(320, 345, 70, 70);
		minusButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(minusButton);
		
		plusButton = new JButton("+");
		plusButton.setBounds(320, 445, 70, 70);
		plusButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(plusButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

	public static void main(String[] args) {
		
		new Calculator();
		
	}

}	