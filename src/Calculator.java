import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
	private JPanel panel;
	private JTextArea output;
	private JButton addBtn, subtractBtn, devideBtn, timesBtn;
	
	public Calculator() {
		panel = new JPanel();
		
		
		output = new JTextArea(3, 22);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
