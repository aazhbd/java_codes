import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculate extends Applet{
	private TextField t1, t2;
	private Button b;
	private Panel p;
	
	public Calculate(){
		setBackground(Color.cyan);
	}
	
	public void init(){
		p=new Panel();
		add(p);
		p.setLayout(new FlowLayout());
		
		t1=new TextField(10);
		t2=new TextField(10);
		b=new Button(" Convert ");
		
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String s;
				int n;
				s=JOptionPane.showInputDialog("Enter 1 to convert from inch to cm or \n Enter 2 to to convert from cm to inch");
				n=Integer.parseInt(s);
				switch(n)
				{
					case 1:
					String ins=t1.getText();
					float in=Float.parseFloat(ins);
					float out=(in*2);
					t2.setText(""+out);
					break;
					
					case 2:
					String ins2=t1.getText();
					float in2=Float.parseFloat(ins2);
					float out2=(in2*3);
					t2.setText(""+out2);
					break;
					
					default:
					JOptionPane.showMessageDialog(null, "Please Enter correct input");
					break;
				}
			}
		});
		
		p.add(t1);
		p.add(b);
		p.add(t2);
	}
	public void paint(Graphics g){
		g.drawString("Enter input in first Text field then click Convert", 50, 60);
	}
}
