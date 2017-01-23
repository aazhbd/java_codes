import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RadioTest extends JFrame{
	private JRadioButton r, s, t;
	private ButtonGroup bg;
	private JTextField text;
	private Container c;
	
	public RadioTest()
	{
		c = getContentPane();
		r = new JRadioButton("1", true);
		s = new JRadioButton("2", false);
		t = new JRadioButton("3", false);
		text = new JTextField(25);
		bg = new ButtonGroup();
		
		c.setLayout(new FlowLayout());
		
		r.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e)
			{
				text.setText("1 is selected");
			}
		});
		
		s.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e)
			{
				text.setText("2 is selected");
			}
		});
		
		t.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e)
			{
				text.setText("2 is selected");
			}
		});
		
		c.add(r);
		c.add(s);
		c.add(t);
		c.add(text);
		
		bg.add(r);
		bg.add(s);
		bg.add(t);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new RadioTest();
	}
}