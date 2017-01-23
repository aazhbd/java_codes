import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawRect extends JFrame{
	int x1, x2, y1, y2;
	
	public DrawRect(){
		setSize(400, 400);
		setVisible(true);
	}
	
	public static void main(String args[]){
		int len, ix1, ix2, iy1, iy2, i;
		String sx1, sx2, sy1, sy2;
		len=args.length;
		if(len==0){
			sx1=JOptionPane.showInputDialog("Enter X1: ");
			sy1=JOptionPane.showInputDialog("Enter Y1: ");
			sx2=JOptionPane.showInputDialog("Enter X2: ");
			sy2=JOptionPane.showInputDialog("Enter Y1: ");
		}
		else{
			sx1=args[0];
			sy1=args[1];
			sx2=args[2];
			sy2=args[3];
		}
		
		ix1=Integer.parseInt(sx1);
		iy1=Integer.parseInt(sy1);
		ix2=Integer.parseInt(sx2);
		iy2=Integer.parseInt(sy2);
		
		DrawRect d=new DrawRect();
		
		d.x1=ix1;
		d.y1=iy1;
		d.x2=ix2;
		d.y2=iy2;
	}
	
	public void paint(Graphics g){
		g.setColor(Color.CYAN);
		g.fillRect(x1, y1, x2, y2);
	}
}