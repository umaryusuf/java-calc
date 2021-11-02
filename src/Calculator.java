
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
	private JPanel panel;
	private JTextArea output;
	private JButton addBtn, subtractBtn, devideBtn, timesBtn, equalBtn, dotBtn;
	private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
	
	public Calculator() {
		panel = new JPanel();
		//panel.setLayout(new GridBagLayout());
		output = new JTextArea(3, 22);
		
		addBtn = new JButton("+");
		subtractBtn = new JButton("-");
		devideBtn = new JButton("x");
		timesBtn = new JButton("/");
		equalBtn = new JButton("=");
		dotBtn = new JButton(".");
		
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
		
		panel.add(output);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(addBtn);
		
		this.add(panel);
		this.setTitle("Calculator");
		this.setSize(300, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Calculator();
	}

	private void addItem(JPanel p, JComponent c, int x, int y, int width, int height, int align)
	{
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx = x;
		gc.gridy = y;
		gc.gridwidth = width;
		gc.gridheight = height;
		gc.weightx = 100.0;
		gc.weighty = 100.0;
		gc.insets = new Insets(5, 5, 5, 5);
		gc.anchor = align;
		gc.fill = GridBagConstraints.NONE;
		p.add(c, gc);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}