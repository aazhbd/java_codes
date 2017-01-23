import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class PassAccept extends JFrame
{
	private JTextField EntPass, EntName;
	private JLabel LPass, LName;
	private JButton check;
	private Container c;
	
	public PassAccept()
	{
		super("Store Information");
		c=getContentPane();
		c.setLayout(new FlowLayout());
		
		EntPass=new JTextField(15);
		EntName=new JTextField(15);
		LName=new JLabel("Enter your name: ");
		LPass=new JLabel("Enter your password: ");
		check=new JButton("Check");
		
		check.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String InfName=EntName.getText();
				String InfPass=EntPass.getText();
				try{
					RandomAccessFile NameFile=new RandomAccessFile("Name.txt", "rw");
					NameFile.seek(NameFile.length());
					NameFile.writeBytes(InfName+" : ");
					RandomAccessFile PassFile=new RandomAccessFile("Pass.txt", "rw");
					PassFile.seek(PassFile.length());
					PassFile.writeBytes(InfPass+" : ");
				}
				catch(IOException ex)
				{
					JOptionPane.showMessageDialog(null, "Can't write");
				}
			}
		});
		
		c.add(LName);
		c.add(EntName);
		c.add(LPass);
		c.add(EntPass);
		c.add(check);
		
		show();
		setSize(220, 175);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[])
	{
		PassAccept pa=new PassAccept();
	}
}