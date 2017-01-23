import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;

public class DataSave extends JFrame{
	private JLabel namel, agel, addl, phonel, maill;
	private JTextField namet, aget, phonet, mailt;
	private JTextArea addt;
	private JButton Save;
	private Container c;
	
	public DataSave(){
		super("Enter Informations");
		c=getContentPane();
		FlowLayout lay=new FlowLayout();
		lay.setAlignment(FlowLayout.CENTER);
		c.setLayout(lay);

		namel=new JLabel("Enter Name: ");
		agel=new JLabel("Enter Age: ");
		addl=new JLabel("Enter Address: ");
		phonel=new JLabel("Enter Phone No.: ");
		maill=new JLabel("Enter eMail: ");
		
		namet=new JTextField(20);
		aget=new JTextField(20);
		addt=new JTextArea(5, 20);
		phonet=new JTextField(20);
		mailt=new JTextField(20);
		
		Save=new JButton("Save");
		
		Save.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String name=namet.getText();
				String age=aget.getText();
				String add=addt.getText();
				String phone=phonet.getText();
				String mail=mailt.getText();
				
				try{
					RandomAccessFile NameFile=new RandomAccessFile("Name.txt", "rw");
					NameFile.seek(NameFile.length());
					NameFile.writeBytes(name+" : ");
					
					RandomAccessFile AgeFile=new RandomAccessFile("age.txt", "rw");
					AgeFile.seek(AgeFile.length());
					AgeFile.writeBytes(age+" : ");
					
					RandomAccessFile AddFile=new RandomAccessFile("Address.txt", "rw");
					AddFile.seek(AddFile.length());
					AddFile.writeBytes(add+" : ");
					
					RandomAccessFile PhoneFile=new RandomAccessFile("Phone.txt", "rw");
					PhoneFile.seek(PhoneFile.length());
					PhoneFile.writeBytes(phone+" : ");
					
					RandomAccessFile MailFile=new RandomAccessFile("mail.txt", "rw");
					MailFile.seek(MailFile.length());
					MailFile.writeBytes(mail+" : ");
				}
				catch(IOException ex)
				{
					System.out.println("Can't write");
				}
			}
		});
				
		c.add(namel);
		c.add(namet);
		c.add(agel);
		c.add(aget);
		c.add(addl);
		c.add(new JScrollPane(addt));
		c.add(phonel);
		c.add(phonet);
		c.add(maill);
		c.add(mailt);
		c.add(Save);
		
		setSize(250, 400);
		show();
	}
	
	public static void main(String args[]){
		DataSave ds=new DataSave();
	}
}