import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.applet.*;

public class JNotePro extends JApplet{
	private JMenuBar bar;
	private JMenu file, edit, help;
	private JMenuItem copy, paste, save, exit, about;
	private JTextArea t;
	String s;
	
	public JNotePro()
	{
		bar=new JMenuBar();
		setJMenuBar(bar);
		
		file=new JMenu("File");
		edit=new JMenu("Edit");
		help=new JMenu("Help");
		
		copy=new JMenuItem("Copy");
		paste=new JMenuItem("Paste");
		save=new JMenuItem("Save");
		exit=new JMenuItem("Exit");
		about=new JMenuItem("About");
		
		t=new JTextArea();
		
		bar.add(file);
		bar.add(edit);
		bar.add(help);
		
		file.add(save);
		file.add(exit);
		
		edit.add(copy);
		edit.add(paste);
		
		help.add(about);
		
		getContentPane().add(new JScrollPane(t));
		
		exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		
		save.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String text=t.getText();
				try{
					RandomAccessFile NameFile=new RandomAccessFile("Name.txt", "rw");
					NameFile.seek(NameFile.length());
					NameFile.writeBytes(text);
				}
				catch(IOException ex)
				{
					System.out.println("Can't write");
				}
			}
		});
		
		copy.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				s=t.getText()+t.getSelectedText();
			}
		});
		
		paste.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t.setText(s);
			}
		});
		
		about.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "This is a test notepad program, Zakir");
			}
		});
	}
	
	public void init(){
		new JNotePro();
	}
}