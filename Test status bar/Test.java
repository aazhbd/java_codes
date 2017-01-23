import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
import java.net.*;

public class Test extends Applet{
	private Button b;
	public Test(){
		b=new Button("Click me");
//		final URL url= URL.setURLStreamHandlerFactory("E:\\English\\Aerosmith\\Pink.mp3");
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				getAppletContext().showStatus("This is a label");
//				getAppletContext().getAudioClip(url);
			}
		});
		add(b);
	}
	
	public void status(){
		getAppletContext().showStatus("This is a label");
	}
	
	public static void main(String args[]){
		Test t=new Test();
		System.out.println("Hello");
		t.status();
		System.out.println("Hello");
	}
}