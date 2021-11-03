import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Calculator extends JFrame implements ActionListener {
	private JPanel mainPanel, firstPanel, secondPanel;
	private JTextArea output;
	private JButton addBtn, subtractBtn, devideBtn, timesBtn, equalBtn, dotBtn, percentBtn, clearBtn;
	private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btn00, offBtn;
	
	String operation;
	String answer;
	double first, result;
	double second;
	
	public Calculator() {

		mainPanel = new JPanel();
		firstPanel = new JPanel();
		secondPanel = new JPanel();
		
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.setBorder(new EmptyBorder(5, 0, 0, 0));
		firstPanel.setLayout(new FlowLayout());
		secondPanel.setLayout(new GridLayout(5, 4));
		output = new JTextArea(1, 10);
		output.setEditable(false);
		output.setFont(new Font("Serif", Font.PLAIN, 35));
		
		addBtn = new JButton("+");
		subtractBtn = new JButton("-");
		devideBtn = new JButton("/");
		timesBtn = new JButton("x");
		equalBtn = new JButton("=");
		percentBtn = new JButton("%");
		offBtn = new JButton("Off");
		clearBtn = new JButton("C");
		offBtn.setPreferredSize(new Dimension(60, 60));
		
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btn7 = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		btn0 = new JButton("0");
		btn00 = new JButton("00");
		dotBtn = new JButton(".");

		addBtn.addActionListener(this);
		subtractBtn.addActionListener(this);
		devideBtn.addActionListener(this);
		timesBtn.addActionListener(this);
		equalBtn.addActionListener(this);
		dotBtn.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btn0.addActionListener(this);
		btn00.addActionListener(this);
		dotBtn.addActionListener(this);
		clearBtn.addActionListener(this);
		offBtn.addActionListener(this);
		percentBtn.addActionListener(this);
		
		firstPanel.add(output);
		secondPanel.add(offBtn);
		secondPanel.add(clearBtn);
		secondPanel.add(percentBtn);
		secondPanel.add(timesBtn);
		secondPanel.add(btn1);
		secondPanel.add(btn2);
		secondPanel.add(btn3);
		secondPanel.add(devideBtn);
		secondPanel.add(btn4);
		secondPanel.add(btn5);
		secondPanel.add(btn6);
		secondPanel.add(addBtn);
		secondPanel.add(btn7);
		secondPanel.add(btn8);
		secondPanel.add(btn9);
		secondPanel.add(subtractBtn);
		secondPanel.add(btn0);
		secondPanel.add(dotBtn);
		secondPanel.add(btn00);
		secondPanel.add(equalBtn);
		mainPanel.add(firstPanel);
        mainPanel.add(secondPanel);
		
		this.add(mainPanel);
		this.setTitle("Calculator");
		this.setSize(300, 355);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btn1) {
			String num = output.getText() + btn1.getText();
			output.setText(num);
		}
		
		if(e.getSource() == btn2) {
			String num = output.getText() + btn2.getText();
			output.setText(num);
		}
		
		if(e.getSource() == btn3) {
			String num = output.getText() + btn3.getText();
			output.setText(num);
		}
		
		if(e.getSource() == btn4) {
			String num = output.getText() + btn4.getText();
			output.setText(num);
		}
		
		if(e.getSource() == btn5) {
			String num = output.getText() + btn5.getText();
			output.setText(num);
		}
		
		if(e.getSource() == btn6) {
			String num = output.getText() + btn6.getText();
			output.setText(num);
		}
		
		if(e.getSource() == btn7) {
			String num = output.getText() + btn7.getText();
			output.setText(num);
		}
		
		if(e.getSource() == btn8) {
			String num = output.getText() + btn8.getText();
			output.setText(num);
		}
		
		if(e.getSource() == btn9) {
			String num = output.getText() + btn9.getText();
			output.setText(num);
		}
		
		if(e.getSource() == btn00) {
			String num = output.getText() + btn00.getText();
			output.setText(num);
		}
		
		if(e.getSource() == dotBtn) {
			String num = output.getText() + dotBtn.getText();
			output.setText(num);
		}
		
		if(e.getSource() == percentBtn) {
			first = Double.parseDouble(output.getText());
			output.setText(null);
			operation = "%";
		}
		
		if(e.getSource() == addBtn) {
			first = Double.parseDouble(output.getText());
			output.setText(null);
			operation = "+";
		}
		
		if(e.getSource() == subtractBtn) {
			first = Double.parseDouble(output.getText());
			output.setText(null);
			operation = "-";
		}
		
		if(e.getSource() == timesBtn) {
			first = Double.parseDouble(output.getText());
			output.setText(null);
			operation = "*";
		}
		
		if(e.getSource() == devideBtn) {
			first = Double.parseDouble(output.getText());
			output.setText(null);
			operation = "/";
		}
		
		if(e.getSource() == equalBtn) {
			second = Double.parseDouble(output.getText());
			
			if(operation == "+") {
				result = first + second;
				answer = String.format("%.2f", result);
				output.setText(answer);
			} else if(operation == "-") {
				result = first - second;
				answer = String.format("%.2f", result);
				output.setText(answer);
			} else if(operation == "*") {
				result = first * second;
				answer = String.format("%.2f", result);
				output.setText(answer);
			} else if(operation == "/") {
				result = first / second;
				answer = String.format("%.2f", result);
				output.setText(answer);
			} else if(operation == "%") {
				result = first % second;
				answer = String.format("%.2f", result);
				output.setText(answer);
			}
			
		}
		
		if(e.getSource() == clearBtn) {
			output.setText(null);
		}
		
		if(e.getSource() == offBtn) {
			System.exit(1);
		}
	}
}