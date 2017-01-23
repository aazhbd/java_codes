import java.io.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class DataSave extends Applet{
	private Label namel, agel, addl, phonel, maill;
	private TextField namet, aget, phonet, mailt;
	private TextArea addt;
	private Button Save;
	private Panel p1, p2, p3, p4, p5, pb;
	
	public void init(){
		runInit();
	}
	
	public void runInit(){
		p1=new Panel();
		p2=new Panel();
		p3=new Panel();
		p4=new Panel();
		p5=new Panel();
		pb=new Panel();
		
		FlowLayout lay=new FlowLayout();
		lay.setAlignment(FlowLayout.CENTER);
		p1.setLayout(lay);
		p2.setLayout(lay);
		p3.setLayout(lay);
		p4.setLayout(lay);
		p5.setLayout(lay);
		pb.setLayout(lay);
		
		namel=new Label("Enter Name: ");
		agel=new Label("Enter Age: ");
		addl=new Label("Enter Address: ");
		phonel=new Label("Enter Phone No.: ");
		maill=new Label("Enter eMail: ");
		
		namet=new TextField(20);
		aget=new TextField(20);
		addt=new TextArea(5, 20);
		phonet=new TextField(20);
		mailt=new TextField(20);
		
		Save=new Button("Save");
		
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
					NameFile.writeBytes(name+" ");
					
					RandomAccessFile AgeFile=new RandomAccessFile("age.txt", "rw");
					AgeFile.seek(AgeFile.length());
					AgeFile.writeBytes(age+" ");
					
					RandomAccessFile AddFile=new RandomAccessFile("Address.txt", "rw");
					AddFile.seek(AddFile.length());
					AddFile.writeBytes(add+" ");
					
					RandomAccessFile PhoneFile=new RandomAccessFile("Phone.txt", "rw");
					PhoneFile.seek(PhoneFile.length());
					PhoneFile.writeBytes(phone+" ");
					
					RandomAccessFile MailFile=new RandomAccessFile("mail.txt", "rw");
					MailFile.seek(MailFile.length());
					MailFile.writeBytes(mail+" ");
				}
				catch(IOException ex)
				{
					System.out.println("Can't write"+ex);
				}
			}
		});
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		add(pb);
		
		p1.add(namel);
		p1.add(namet);
		p2.add(agel);
		p2.add(aget);
		p3.add(addl);
		p3.add(addt);
		p4.add(phonel);
		p4.add(phonet);
		p5.add(maill);
		p5.add(mailt);
		pb.add(Save);
	}
}