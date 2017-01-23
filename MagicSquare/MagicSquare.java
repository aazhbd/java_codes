import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class MagicSquare extends JFrame{
	public int a[][];
	public int t, n, x, y, i, j, k, l, m, o;
	public String s;
	public JButton b;
	public Container c;
	public JTextField t1;
	public JPanel p;
	
	public MagicSquare(){
		super("Zakir's Magic Square");
		
		a=new int[15][15];
		c=getContentPane();
		p=new JPanel();
		t1=new JTextField(10);
		b=new JButton("Draw Magic");
		c.add(p, BorderLayout.SOUTH);
		p.add(new JLabel("Enter an odd number less then 15 (One would be added with even numbers)\n"));
		p.add(t1);
		p.add(b);
		
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				s=t1.getText();
				t=Integer.parseInt(s);
				if(t%2==0) t=t+1;
				n=t-1;
				y=n;
				x=y/2;
				j=t*t;
				a[x][y]=1;
				for(i=2; i<=j; i++){
					x=x-1;
					y=y+1;
					if(x>-1 && y>n) y=0;
					if(x<0 && y<=n) x=n;
					if(x<0 && y>n){
						x=x+1;
						y=y-2;
					}
					if(a[x][y]!=0){
						y=y-2;
						x=x+1;
					}
					a[x][y]=i;
				}
				
/*				System.out.println("The MagicSquare is:\n\n\n\n");
				for(k=0; k<t; k++){
					for(l=0; l<t; l++){
						System.out.print(""+a[k][l]+"\t");
					}
					System.out.print("\n\n\n");
				}*/
				repaint();
				b.setEnabled(false);
				t1.setEditable(false);
			}
		});
	}
	
	public void paint(Graphics g){
		g.setColor(Color.BLUE);
		m=50;
		o=75;
		for(k=0; k<t; k++){
			for(l=0; l<t; l++){
				m=m+40;
				g.drawString(""+a[k][l], m, o);
//				g.drawLine(75, m, o+75, m);
//				g.drawLine(m, 50, m, o+25);
			}
			o=o+40;
			m=50;
		}
	}
	
	public static void main(String args[]){
		MagicSquare mc=new MagicSquare();
		mc.setSize(800, 700);
		mc.setVisible(true);
	}
}