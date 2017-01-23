import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloJava3 extends JComponent implements MouseMotionListener, ActionListener{
	int messageX = 125, messageY = 95;
	String theMessage;
	JButton theButton;
	int colorIndex;
	static Color[] someColors = { Color.black, Color.red,
								Color.green, Color.blue, Color.YELLOW };
	
	public HelloJava3(String message){
		theMessage = message;
		theButton = new JButton("Change Color");
		setLayout(new FlowLayout( ));
		add(theButton);
		theButton.addActionListener(this);
		addMouseMotionListener(this);
	}
	
	public void paintComponent(Graphics g){
		g.drawString(theMessage, messageX, messageY);
	}
	
	public void mouseDragged(MouseEvent e) {
		messageX = e.getX( );
		messageY = e.getY( );
		repaint( );
	}
	
	public void mouseMoved(MouseEvent e){
	}
	
	public void actionPerformed(ActionEvent e){
		if (e.getSource( ) == theButton)
		changeColor();
	}
	
	synchronized private void changeColor(){
		if (++colorIndex == someColors.length)
		colorIndex = 0;
		setForeground(currentColor( ));
		repaint();
	}
	
	synchronized private Color currentColor(){
		return someColors[colorIndex];
	}
	
	public static void main(String[] args){
		JFrame f = new JFrame("HelloJava3");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		f.setSize(300, 300);
		f.getContentPane( ).add(new HelloJava3("Hello, Java!"));
		f.setVisible(true);
	}
}
