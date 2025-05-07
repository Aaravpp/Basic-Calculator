import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator implements ActionListener{
	
	boolean isOperatorClicked = false;
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton,eightButton,nineButton;
	JButton fourButton,fiveButton,sixButton;
	JButton oneButton,twoButton,threeButton;
	JButton dotButton,zeroButton,equalButton;
	JButton divButton,mulButton,minusButton,plusButton,clearButton,delButton;
	
	String oldValue;
	String newValue;
	float oldValueF;
	float newValueF;
	float result;
	char operator;
	int i;
	
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
		equalButton.addActionListener(this);
		equalButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(equalButton);
		
		divButton = new JButton("/");
		divButton.setBounds(320, 150, 70, 70);
		divButton.addActionListener(this);
		divButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(divButton);
		
		mulButton = new JButton("x");
		mulButton.setBounds(320, 245, 70, 70);
		mulButton.addActionListener(this);
		mulButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(mulButton);
		
		minusButton = new JButton("-");
		minusButton.setBounds(320, 345, 70, 70);
		minusButton.addActionListener(this);
		minusButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(minusButton);
		
		plusButton = new JButton("+");
		plusButton.setBounds(320, 445, 70, 70);
		plusButton.addActionListener(this);
		plusButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(plusButton);
		
		clearButton = new JButton("AC");
		clearButton.setBounds(400, 445, 70, 70);
		clearButton.addActionListener(this);
		clearButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(clearButton);
		
		delButton = new JButton("←");
		delButton.setBounds(400, 345, 70, 70);
		delButton.addActionListener(this);
		delButton.setFont(new Font("Arial", Font.BOLD, 25));

		
		jf.add(delButton);
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

	public static void main(String[] args) {
		
		new Calculator();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == sevenButton) {
			
			if(isOperatorClicked) {
				
				displayLabel.setText("7");
				isOperatorClicked = false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
		}
		else if(e.getSource() == eightButton) {
			
			if(isOperatorClicked) {
				
				displayLabel.setText("8");
				isOperatorClicked = false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"8");
			}	
		}
		else if(e.getSource() == nineButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked = false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"9");
			}		
		}
		else if(e.getSource() == fourButton) {
			
			if(isOperatorClicked) {
				
				displayLabel.setText("4");
				isOperatorClicked = false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
		}
		else if(e.getSource() == fiveButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked = false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"5");
			}		
		}
		else if(e.getSource() == sixButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked = false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"6");
			}		
		}
		else if(e.getSource() == oneButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked = false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"1");
			}		
		}
		else if(e.getSource() == twoButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked = false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"2");
			}		
		}
		else if(e.getSource() == threeButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked = false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"3");
			}		
		}
		else if(e.getSource() == dotButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText(".");
				isOperatorClicked = false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+".");
			}	
		}
		else if(e.getSource() == zeroButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked = false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"0");
			}		
		}
		else if(e.getSource() == equalButton) {
			
			newValue = displayLabel.getText();
			oldValueF = Float.parseFloat(oldValue);
			newValueF = Float.parseFloat(newValue);
			
			switch (operator) {
			
			case '+' :
				result = oldValueF + newValueF;
				displayLabel.setText(result+"");
				break;
				
			case '-' :
				result = oldValueF - newValueF;
				displayLabel.setText(result+"");
				break;
				
			case 'x' :
				result = oldValueF * newValueF;
				displayLabel.setText(result+"");
				break;
				
			case '/' :
				result = oldValueF / newValueF;
				displayLabel.setText(result+"");
				break;
			}
			
		}
		else if(e.getSource() == divButton) {
			
			isOperatorClicked = true;
			operator = '/';
			oldValue = displayLabel.getText();
			
		}
		else if(e.getSource() == mulButton) {
			
			isOperatorClicked = true;
			operator = 'x';
			oldValue = displayLabel.getText();
			
		}
		else if(e.getSource() == minusButton) {
			
			isOperatorClicked = true;
			operator = '-';
			oldValue = displayLabel.getText();
			
		}
		else if(e.getSource() == plusButton) {
			
			isOperatorClicked = true;
			operator = '+';
			oldValue = displayLabel.getText();
			
		}
		else if(e.getSource() == clearButton) {
			displayLabel.setText("");
		}
		else if(e.getSource() == delButton) {
		    String currentText = displayLabel.getText();       // Get current text from display
		    if (!currentText.isEmpty()) {                      // Check if it's not empty
		        displayLabel.setText(currentText.substring(0, currentText.length() - 1));      // Set display to:   Remove last character
		        
		        /*substring(0, currentText.length() - 1) takes a part of the string from the beginning up to (but not including) the last character.

				Example:
				If currentText = "123", then substring(0, 2) gives "12".
				The last character "3" is removed.*/
		    }
		}
		
	}

}	