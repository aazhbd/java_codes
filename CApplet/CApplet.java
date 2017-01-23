import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;

public class CApplet extends JApplet
{
	private JTextArea t1, t2;
	private JPanel p, pb;
	private JButton b1, b2, b3;
	private Container c;
	
	public void init()
	{
		c=getContentPane();
		c.setLayout(new FlowLayout());
		p=new JPanel();
		pb=new JPanel();
		c.add(p, BorderLayout.NORTH);
		c.add(pb, BorderLayout.SOUTH);
		t1=new JTextArea(10, 20);
		t2=new JTextArea(10, 20);
		
		b1=new JButton("Copy Selected");
		b2=new JButton("Copy All");
		b3=new JButton("About");
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String s=t1.getSelectedText();
				t2.setText(s);
			}
		});
		
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String s=t1.getText();
				t2.setText(s);
			}
		});
		
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "This is a program created by Zakir");
			}
		});
		
		p.add(new JScrollPane(t1));
		pb.add(b1);
		pb.add(b2);
		pb.add(b3);
		p.add(new JScrollPane(t2));
	}
}