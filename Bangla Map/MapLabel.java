import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;

public class MapLabel extends JApplet{
	private JLabel l;
	private Container c;
	private Icon bd;
	private int x=-10, y=-10;

	public void init()
	{
		c=getContentPane();
		c.setLayout(new FlowLayout());
		
		bd=new ImageIcon("bd.gif");
		l=new JLabel();
		l.setIcon(bd);
		c.add(l);
		
		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent e)
			{
				x = e.getX();
				y = e.getY();
				JOptionPane.showMessageDialog(null, "x= "+x+"and y= "+y);
				repaint();
			}
		});
	}
}