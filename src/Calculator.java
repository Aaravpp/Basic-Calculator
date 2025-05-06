import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator implements ActionListener{
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton,eightButton,nineButton;
	JButton fourButton,fiveButton,sixButton;
	JButton oneButton,twoButton,threeButton;
	JButton dotButton,zeroButton,equalButton;
	JButton divButton,mulButton,minusButton,plusButton,clearButton;
	
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
		sevenButton.addActionListener(this);
		sevenButton.setFont(new Font("Arial", Font.BOLD, 25));
		
		jf.add(sevenButton);
		
		eightButton = new JButton("8");
		eightButton.setBounds(120, 150, 70, 70);
		eightButton.addActionListener(this);
		eightButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(eightButton);
		
		nineButton = new JButton("9");
		nineButton.setBounds(220, 150, 70, 70);
		nineButton.addActionListener(this);
		nineButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(nineButton);
		
		fourButton = new JButton("4");
		fourButton.setBounds(20, 245, 70, 70);
		fourButton.addActionListener(this);
		fourButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(fourButton);
		
		fiveButton = new JButton("5");
		fiveButton.setBounds(120, 245, 70, 70);
		fiveButton.addActionListener(this);
		fiveButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(fiveButton);
		
		sixButton = new JButton("6");
		sixButton.setBounds(220, 245, 70, 70);
		sixButton.addActionListener(this);
		sixButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(sixButton);
		
		oneButton = new JButton("1");
		oneButton.setBounds(20, 345, 70, 70);
		oneButton.addActionListener(this);
		oneButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(oneButton);
		
		twoButton = new JButton("2");
		twoButton.setBounds(120, 345, 70, 70);
		twoButton.addActionListener(this);
		twoButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(twoButton);
		
		threeButton = new JButton("3");
		threeButton.setBounds(220, 345, 70, 70);
		threeButton.addActionListener(this);
		threeButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(threeButton);
		
		dotButton = new JButton(".");
		dotButton.setBounds(20, 445, 70, 70);
		dotButton.addActionListener(this);
		dotButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(dotButton);
		
		zeroButton = new JButton("0");
		zeroButton.setBounds(120, 445, 70, 70);
		zeroButton.addActionListener(this);
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
		
		clearButton = new JButton("AC");
		clearButton.setBounds(420, 445, 70, 70);
		clearButton.addActionListener(this);
		clearButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(clearButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

	public static void main(String[] args) {
		
		new Calculator();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == sevenButton) {
			displayLabel.setText(displayLabel.getText()+"7");
		}
		else if(e.getSource() == eightButton) {
			displayLabel.setText(displayLabel.getText()+"8");
		}
		else if(e.getSource() == nineButton) {
			displayLabel.setText(displayLabel.getText()+"9");
		}
		else if(e.getSource() == fourButton) {
			displayLabel.setText(displayLabel.getText()+"4");
		}
		else if(e.getSource() == fiveButton) {
			displayLabel.setText(displayLabel.getText()+"5");
		}
		else if(e.getSource() == sixButton) {
			displayLabel.setText(displayLabel.getText()+"6");
		}
		else if(e.getSource() == oneButton) {
			displayLabel.setText(displayLabel.getText()+"1");
		}
		else if(e.getSource() == twoButton) {
			displayLabel.setText(displayLabel.getText()+"2");
		}
		else if(e.getSource() == threeButton) {
			displayLabel.setText(displayLabel.getText()+"3");
		}
		else if(e.getSource() == dotButton) {
			displayLabel.setText(displayLabel.getText()+".");
		}
		else if(e.getSource() == zeroButton) {
			displayLabel.setText(displayLabel.getText()+"0");
		}
		else if(e.getSource() == equalButton) {
		}
		else if(e.getSource() == divButton) {
		}
		else if(e.getSource() == mulButton) {
		}
		else if(e.getSource() == minusButton) {
		}
		else if(e.getSource() == plusButton) {
		}
		else if(e.getSource() == clearButton) {
			displayLabel.setText("");
		}
		
	}

}	