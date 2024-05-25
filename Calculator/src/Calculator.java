import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	
	Boolean isOperatorClicked=false;
	String oldValue;
	String op;
	
	JFrame jf;
	JLabel displayLabel;
	
	JButton sevenButton,eightButton,nineButton;
	JButton fourButton,fiveButton,sixButton;
	JButton oneButton,twoButton,threeButton,dotButton,zeroButton;
	JButton additionButton,minusButton,multiplicationButton,divisionButton,equalButton,clearButton;
	
	
	public Calculator() {
		
		jf=new JFrame("calculator");
		jf.setLayout(null);
		jf.setSize(385, 610);
		jf.setLocation(200, 100);
		
		displayLabel=new JLabel();
		displayLabel.setBounds(10, 10, 350, 60);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.WHITE);
		displayLabel.setFont(new Font("Calibri", Font.BOLD, 40));
		jf.add(displayLabel);
		
		//-----------BUTTONS--------------
		sevenButton=new JButton("7");
		sevenButton.setBounds(10, 100, 80, 90);
		sevenButton.setFont(new Font("Calibri", Font.BOLD, 30));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(100, 100, 80, 90);
		eightButton.setFont(new Font("Calibri", Font.BOLD, 30));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(190, 100, 80, 90);
		nineButton.setFont(new Font("Calibri", Font.BOLD, 30));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		additionButton=new JButton("+");
		additionButton.setBounds(280, 100, 80, 90);
		additionButton.setFont(new Font("Calibri", Font.BOLD, 30));
		additionButton.addActionListener(this);
		jf.add(additionButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(10, 200, 80, 90);
		fourButton.setFont(new Font("Calibri", Font.BOLD, 30));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(100, 200, 80, 90);
		fiveButton.setFont(new Font("Calibri", Font.BOLD, 30));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(190, 200, 80, 90);
		sixButton.setFont(new Font("Calibri", Font.BOLD, 30));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		minusButton=new JButton("-");
		minusButton.setBounds(280, 200, 80, 90);
		minusButton.setFont(new Font("Calibri", Font.BOLD, 30));
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(10, 300, 80, 90);
		oneButton.setFont(new Font("Calibri", Font.BOLD, 30));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(100, 300, 80, 90);
		twoButton.setFont(new Font("Calibri", Font.BOLD, 30));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(190, 300, 80, 90);
		threeButton.setFont(new Font("Calibri", Font.BOLD, 30));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		multiplicationButton=new JButton("*");
		multiplicationButton.setBounds(280, 300, 80, 90);
		multiplicationButton.setFont(new Font("Calibri", Font.BOLD, 30));
		multiplicationButton.addActionListener(this);
		jf.add(multiplicationButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(10, 400, 80, 90);
		dotButton.setFont(new Font("Calibri", Font.BOLD, 30));
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(100, 400, 80, 90);
		zeroButton.setFont(new Font("Calibri", Font.BOLD, 30));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(190, 400, 80, 90);
		equalButton.setFont(new Font("Calibri", Font.BOLD, 30));
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		divisionButton=new JButton("/");
		divisionButton.setBounds(280, 400, 80, 90);
		divisionButton.setFont(new Font("Calibri", Font.BOLD, 30));
		divisionButton.addActionListener(this);
		jf.add(divisionButton);
		
		clearButton=new JButton("Clear");
		clearButton.setBounds(10, 500, 350, 60);
		clearButton.setFont(new Font("Calibri", Font.BOLD, 30));
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}
	
	
	public static void main(String[] args) {
		new Calculator();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == nineButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"9");
			}
			
		}else if(e.getSource() == eightButton) {

			if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"8");
			}
			
		}else if(e.getSource() == sevenButton) {

			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"7");
			}
			
		}else if(e.getSource() == sixButton) {

			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"6");
			}
			
		}else if(e.getSource() == fiveButton) {

			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"5");
			}
			
		}else if(e.getSource() == fourButton) {

			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"4");
			}
			
		}else if(e.getSource() == threeButton) {

			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"3");
			}
			
		}else if(e.getSource() == twoButton) {

			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"2");
			}
			
		}else if(e.getSource() == oneButton) {

			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"1");
			}
			
		}else if(e.getSource() == zeroButton) {

			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+"0");
			}
			
		}else if(e.getSource() == dotButton) {

			if(isOperatorClicked) {
				displayLabel.setText(".");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+".");
			}
			
		}else if(e.getSource() == additionButton) {
			
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			op=e.getActionCommand();
			
		}else if(e.getSource() == minusButton) {
			
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			op=e.getActionCommand();
			
		}else if(e.getSource() == multiplicationButton) {
			
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			op=e.getActionCommand();
			
		}else if(e.getSource() == divisionButton) {
			
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			op=e.getActionCommand();
			
		}else if(e.getSource() == equalButton) {
			
			String newValue=displayLabel.getText();
			float result;
			
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
			if(op.equals("+")) {
				result=oldValueF+newValueF;
				displayLabel.setText(result+"");
			}else if(op.equals("-")) {
				result=oldValueF-newValueF;
				displayLabel.setText(result+"");
			}else if(op.equals("*")) {
				result=oldValueF*newValueF;
				displayLabel.setText(result+"");
			}else if(op.equals("/")) {
				if(newValueF == 0) {
					displayLabel.setText("Cannot divid by zero");
				}else {
				result=oldValueF/newValueF;
				displayLabel.setText(result+"");
				}
			}
			
			
			
			
			
		}else if(e.getSource() == clearButton) {
			displayLabel.setText("");
		}
		
		
	}

}
