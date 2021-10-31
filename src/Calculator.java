
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculator extends JFrame implements ActionListener 
{
    JPanel panel,
	JButton add,subtract,multiply,divide;
    JTextArea output;
    JLabel result,enter1,enter2;
    
    Calculator()
    {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        output = new JTextArea(13, 20);
        
        
    }
    
        
	public static void main(String args[])
	{
	    Calculator ob = new Calculator();
	    ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ob.setTitle("Calculator");
	    ob.setVisible(true);
	    ob.setSize(350,500);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
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
}