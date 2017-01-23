import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEvents extends JFrame implements MouseListener, MouseMotionListener{
	private JLabel statusBar;
	public MouseEvents(){
		super("Zakir's Program to show Mouse Events");
		statusBar = new JLabel();
		getContentPane().add( statusBar, BorderLayout.SOUTH );
		
		addMouseListener( this );
		addMouseMotionListener( this );
		
		setSize(500, 500);
		setVisible(true);
	}
	
	public void mouseClicked(MouseEvent e){
		statusBar.setText( "Clicked at [" + e.getX()+", " + e.getY() + "]");
	}
	
	public void mousePressed( MouseEvent e ){
		statusBar.setText( "Pressed at [" + e.getX()+", " + e.getY() + "]" );
	}
	public void mouseReleased( MouseEvent e ){
		statusBar.setText( "Released at [" + e.getX()+", " + e.getY() + "]" );
	}
	
	public void mouseEntered( MouseEvent e ){
		statusBar.setText( "Mouse in window" );
	}
	
	public void mouseExited( MouseEvent e ){
		statusBar.setText( "Mouse outside window" );
	}
	
	public void mouseDragged( MouseEvent e ){
		statusBar.setText( "Dragged at [" + e.getX()+", " + e.getY() + "]" );
	}
	
	public void mouseMoved( MouseEvent e ){
		statusBar.setText( "Moved at [" + e.getX()+", " + e.getY() + "]" );
	}
	
	public static void main( String args[] ){
		MouseEvents app = new MouseEvents();
		
		app.addWindowListener(new WindowAdapter(){
			public void windowClosing( WindowEvent e ){
				System.exit( 0 );
			}
		});
	}
}