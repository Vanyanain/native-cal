package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator implements ActionListener {
	double input,result;
	String cal;
	JFrame frame;
	JLabel label = new JLabel();
	JTextField textView = new JTextField();
	JButton symClr = new JButton("CLR");
	JButton symDel = new JButton("DEL");
	JButton symMul = new JButton("x");
	JButton symDiv = new JButton("/");
	
	JButton numSeven = new JButton("7");
	JButton numEight = new JButton("8");
	JButton numNine = new JButton("9");
	JButton symMinus = new JButton("-");
	
	JButton numFour = new JButton("4");
	JButton numFive = new JButton("5");
	JButton numSix = new JButton("6");
	JButton symPlus = new JButton("+");
	
	JButton numOne = new JButton("1");
	JButton numTwo = new JButton("2");
	JButton numThree = new JButton("3");
	JButton symEqual = new JButton("=");
	
	JButton numZero =new JButton("0");
	JButton symDot = new JButton(".");
	
			
	
	
	
	Calculator(){
		CreateInterface();
		InterfaceComponents();
		AddInterfaceEventListener();
		
	}
	public void CreateInterface() {
		JWindow window = new JWindow();
		frame = new JFrame();
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\USER\\eclipse-workspace-jan 24\\calculator\\resource\\icon\\calculator.png");
		JLabel spashText = new JLabel("",new ImageIcon("C:\\Users\\USER\\eclipse-workspace-jan 24\\calculator\\resource\\icon\\calculator.png"),SwingConstants.CENTER);
		window.getContentPane().add(spashText);
		window.setBounds(475,150,500,500);
		window.setVisible(true);
		try {
			Thread.sleep(5000);
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		window.setVisible(false);
		frame.setTitle("Java Calculator");
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setSize(305,400);
		frame.setIconImage(icon);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void InterfaceComponents() {
		//output row
		label.setBounds(240,0,40,40);
		frame.add(label);
		
		textView.setBounds(10,40,270,60);
		textView.setEditable(false);
		textView.setHorizontalAlignment(SwingConstants.RIGHT);	
		frame.add(textView);
		//first row
		symClr.setBounds(10,110,60,40);
		frame.add(symClr);
		symDel.setBounds(80,110,60,40);
		frame.add(symDel);
		symMul.setBounds(150,110,60,40);
		frame.add(symMul);
		symDiv.setBounds(220,110,60,40);
		frame.add(symDiv);
		//second row
		numSeven.setBounds(10,160,60,40);
		frame.add(numSeven);
		numEight.setBounds(80,160,60,40);
		frame.add(numEight);
		numNine.setBounds(150,160,60,40);
		frame.add(numNine);
		symMinus.setBounds(220,160,60,40);
		frame.add(symMinus);
		//third row
		numFour.setBounds(10,210,60,40);
		frame.add(numFour);
		numFive.setBounds(80,210,60,40);
		frame.add(numFive);
		numSix.setBounds(150,210,60,40);
		frame.add(numSix);
		symPlus.setBounds(220,210,60,40);
		frame.add(symPlus);
		//fourth row
		numOne.setBounds(10,260,60,40);
		frame.add(numOne);
		numTwo.setBounds(80,260,60,40);
		frame.add(numTwo);
		numThree.setBounds(150,260,60,40);
		frame.add(numThree);
		symEqual.setBounds(220,260,60,90);
		frame.add(symEqual);
		//fifth row
		numZero.setBounds(10,310,130,40);
		frame.add(numZero);
		symDot.setBounds(150,310,60,40);
		frame.add(symDot);
		
	}
	public void AddInterfaceEventListener() {
		symClr.addActionListener(this);
		symDel.addActionListener(this);
		symMul.addActionListener(this);
		symDiv.addActionListener(this);
		
		numSeven.addActionListener(this);
		numEight.addActionListener(this);
		numNine.addActionListener(this);
		symMinus.addActionListener(this);
		
		numFour.addActionListener(this);
		numFive.addActionListener(this);
		numSix.addActionListener(this);
		symPlus.addActionListener(this);
		
		numOne.addActionListener(this);
		numTwo.addActionListener(this);
		numThree.addActionListener(this);
		symEqual.addActionListener(this);
		
		numZero.addActionListener(this);
		symDot.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object event  = e.getSource();
		
		//input values
		if(event == numOne) {
			textView.setText(textView.getText()+"1");
			
		}else if(event == numTwo) {
			textView.setText(textView.getText()+"2");
		}else if(event == numThree) {
			textView.setText(textView.getText()+"3");
		}else if(event == numFour) {
			textView.setText(textView.getText()+"4");
		}else if(event == numFive) {
			textView.setText(textView.getText()+"5");
		}else if(event == numSix) {
			textView.setText(textView.getText()+"6");
		}else if(event == numSeven) {
			textView.setText(textView.getText()+"7");
		}else if(event == numEight) {
			textView.setText(textView.getText()+"8");
		}else if(event == numNine) {
			textView.setText(textView.getText()+"9");
		}else if(event == numZero) {
			if(textView.getText().equals("0")) {
				return;
			}else {
				textView.setText(textView.getText()+"0");	
			}
			
		}else if(event == symDot) {
			if(textView.getText().contains(".")) {
				return;
			}else {
			textView.setText(textView.getText()+".");
		}}
		else if(event == symClr) {
			label.setText("");
			textView.setText("");
		}else if(event == symDel) {
			int length = textView.getText().length();
			int number = length-1;
			if(length>0) {
				StringBuilder numString = new StringBuilder(textView.getText());
				numString.deleteCharAt(number);
				textView.setText(numString.toString());
			}
			if(textView.getText().endsWith("")) {
				label.setText("");
			}
		}else if(event == symMul) {
			String presentNumber = textView.getText();
			input = Double.parseDouble(textView.getText());
			textView.setText("");
			label.setText(presentNumber + " * ");
			cal = "*";
		}
		else if(event == symDiv) {
			String presentNumber = textView.getText();
			input = Double.parseDouble(textView.getText());
			textView.setText("");
			label.setText(presentNumber + " / ");
			cal = "/";
		}else if(event == symMinus) {
			String presentNumber = textView.getText();
			input = Double.parseDouble(textView.getText());
			textView.setText("");
			label.setText(presentNumber + " - ");
			cal = "-";
		}else if(event == symPlus) {
			String presentNumber = textView.getText();
			input = Double.parseDouble(textView.getText());
			textView.setText("");
			label.setText(presentNumber + " + ");
			cal = "+";
		}else if(event == symEqual) {
			switch(cal) {
			case"*":
			result = input * (Double.parseDouble(textView.getText()));
			if(Double.toString(result).endsWith(".0")) {
				textView.setText(Double.toString(result).replace(".0",""));
			}else {
				textView.setText(Double.toString(result));
			}
			label.setText("");
			break;
			case"/":
			result = input / (Double.parseDouble(textView.getText()));
			if(Double.toString(result).endsWith(".0")) {
				textView.setText(Double.toString(result).replace(".0",""));
			}else {
				textView.setText(Double.toString(result));
			}
			label.setText("");
			break;
			case"-":
			result = input - (Double.parseDouble(textView.getText()));
			if(Double.toString(result).endsWith(".0")) {
				textView.setText(Double.toString(result).replace(".0",""));
			}else {
				textView.setText(Double.toString(result));
			}
			label.setText("");
			break;
			case"+":
			result = input + (Double.parseDouble(textView.getText()));
			if(Double.toString(result).endsWith(".0")) {
				textView.setText(Double.toString(result).replace(".0",""));
			}else {
				textView.setText(Double.toString(result));
			}
			label.setText("");
           break;
			}
		}
	}
	public static void main(String[] args) {
		new Calculator(); 
	
	}

}

