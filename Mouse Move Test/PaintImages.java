import java.awt.*;
import java.applet.Applet;
import javax.swing.*;
import java.awt.event.*;

public class PaintImages extends Applet{
	ImageIcon i;
	
	public void init(){
		i=new ImageIcon("bd.gif");
		addMouseListener(new MouseAdapter(){
			public void mouseExited(MouseEvent e)
			{
				showStatus( "Pointer outside applet" );
			}
		});
		
		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseMoved(MouseEvent e)
			{
				showStatus(""+e.getX());
			}
		});
	}
	
	public void paint(Graphics g){
		i.paintIcon(this, g, 0, 0);
	}
}