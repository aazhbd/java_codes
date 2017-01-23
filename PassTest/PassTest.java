import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PassTest extends JFrame
{
	JTextField passfield, namefield;
	JLabel Lname, Lpass;
	JButton check;
	JTextArea jta;
	Container c;
	
	public PassTest()
	{
		super("Login Information");
		c=getContentPane();
		FlowLayout fl=new FlowLayout();
		fl.setAlignment(fl.CENTER);
		c.setLayout(fl);
		passfield=new JTextField(15);
		namefield=new JTextField(15);
		Lname=new JLabel("Enter your user name: ");
		Lpass=new JLabel("Enter your user password: ");
		check=new JButton("Check");
		
		check.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String ns, ps;
				ns=namefield.getText();
				ns.trim();
				ps=passfield.getText();
				ps.trim();
				//This lines should be changed and rewrite to excute
				//file stream classes.
				StoreInfos si=new StoreInfos();
				si.StoreName();
				si.StorePass();
				
				if(ns.equals(si.StoreName()) && ps.equals(si.StorePass()))
				{
					JOptionPane.showMessageDialog(null, "Valid name and pass");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid name and pass");
				}
			}
		});
		
		c.add(Lname);
		c.add(namefield);
		c.add(Lpass);
		c.add(passfield);
		c.add(check);
		
		show();
		setSize(220, 175);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[])
	{
		PassTest pt=new PassTest();
	}
}