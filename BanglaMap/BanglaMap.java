import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BanglaMap extends JApplet{
	private ImageIcon mapImage;
	private int width, height;
	
	public void init(){
		addMouseListener(new MouseAdapter(){
			public void mouseExited(MouseEvent e){
				showStatus( "Pointer outside applet" );
			}
		});
		
		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseMoved(MouseEvent e){
				showStatus(translateLocation(e.getX(), e.getY()));
			}
		});
		mapImage=new ImageIcon("icons2.gif");
//		width = mapImage.getIconWidth();
//		height = mapImage.getIconHeight();
//		setSize(width, height);
	}
	
	public void paint(Graphics g){
		mapImage.paintIcon( this, g, 0, 0 );
	}
	
	public String translateLocation( int x, int y ){
		int icWidth = width/4;
		int icheight=height/4;
		
		if(x>=0 && x<=icWidth && y>=0 && y<=icheight)
			return "Rajshahi";
		else if(x>icWidth && x<=icWidth*2 && y>icheight && y<=icheight*2)
			return "Sylhet";
		else if(x>icWidth*2 && x<=icWidth*3 && y>icheight*2 && y<=icheight*3)
			return "Dhaka";
		else if(x>icWidth*3 && x<=icWidth*4 && y>icheight*3 && y<=icheight*4)
			return "Khulna";
		return "";
	}
}