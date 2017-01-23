import javax.swing.*;
import java.awt.*;
import java.io.*;

public class TextViewer extends JFrame {
	private JTextField tf;
	private JScrollPane sp;
	private String Content, file;
	private Container c;
	
	public String FileCreator(String add){
		String s="", t;
		try{
			RandomAccessFile f=new RandomAccessFile(add, "rw");
			while((t=f.readLine())!=null){
				s+="\n\r"+t;
			}
		}
		catch(IOException e){
			JOptionPane.showMessageDialog(null, "can't read");
		}
		return s;
	}
	
	public TextViewer(){
		tf=new JTextField();
		sp=new JScrollPane(tf);
		c=getContentPane();
		
		file=JOptionPane.showInputDialog("Enter the file address:");
		Content=FileCreator(file);
		tf.setText(Content);
		
		c.add(sp);
		setSize(500, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		TextViewer tv=new TextViewer();
	}
}
