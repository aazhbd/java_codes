import java.awt.*;
import javax.swing.*;
import java.io.*;

public class Test extends JFrame{
	public JTextArea jta;
	
	public Test()
	{
		jta = new JTextArea(20, 20);
		
		File font = new File("Boishkhi.ttf");
		
		try{
			FileInputStream ins = new FileInputStream(font);
			
			Font bfont = Font.createFont(Font.TRUETYPE_FONT, ins);
			
			bfont = bfont.deriveFont(Font.PLAIN, 12);
			
			jta.setFont(bfont);
		}
		catch(IOException ioe){
			System.out.println("Error");
		}
		catch(FontFormatException ffe){
			System.out.println("Error");
		}
		
		getContentPane().add(jta);
		
		setSize(500, 200);
		
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new Test();
	}
}