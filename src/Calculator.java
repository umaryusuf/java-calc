
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Calculator extends JFrame implements ActionListener {
	private JPanel mainPanel, firstPanel, secondPanel;
	private JTextArea output;
	private JButton addBtn, subtractBtn, devideBtn, timesBtn, equalBtn, dotBtn, percentBtn, clearBtn;
	private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btn00, offBtn;
	
	public Calculator() {

		mainPanel = new JPanel();
		firstPanel = new JPanel();
		secondPanel = new JPanel();
		
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.setBorder(new EmptyBorder(10, 0, 0, 0));
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
		dotBtn = new JButton(".");
		
		percentBtn = new JButton("%");
		offBtn = new JButton("off");
		btn00 = new JButton("00");
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
		this.setSize(300, 350);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}