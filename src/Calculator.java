
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
	private JPanel panel;
	private JTextArea output;
	private JButton addBtn, subtractBtn, devideBtn, timesBtn;
	
	public Calculator() {
		panel = new JPanel();
		
		output = new JTextArea(3, 22);
		
		addBtn = new JButton("+");
		subtractBtn = new JButton("-");
		devideBtn = new JButton("x");
		timesBtn = new JButton("/");
		
		addBtn.addActionListener(this);
		subtractBtn.addActionListener(this);
		devideBtn.addActionListener(this);
		timesBtn.addActionListener(this);
		
		panel.add(output);
		
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