import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class GrammerTest extends Frame{
	private TextField in, ou;
	private Button b;
	private Label l;
	private Panel p;
	String s, so;
	int i=0, j=0, k=0, len;
	
	public GrammerTest(){
		super("Enter Sentence to Check Grammer");
		p=new Panel();
		p.setBackground(Color.GRAY);
		p.setLayout(new FlowLayout());
		l=new Label("Enter Sentence to Check Grammer");
		in=new TextField(20);
		ou=new TextField(20);
		b=new Button("Check 'n Correct");
		
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				s=in.getText();
				len=s.length();
				
				for(i=0; i<len; i++){
					if(s.charAt(i)==' '){
						if(s.charAt(i+1)=='a' || s.charAt(i+1)=='e' || s.charAt(i+1)=='i' || s.charAt(i+1)=='o' || s.charAt(i+1)=='a' || s.charAt(i+1)=='u'){
							if(s.charAt(i-1)=='a') so=s.replace("a", "an");
						}
					}
				}
				
				ou.setText(so);
			}
		});
		
		add(p);
		p.add(l);
		p.add(in);
		p.add(b);
		p.add(ou);
		setSize(700, 70);
		setVisible(true);
	}
	
	public static void main(String args[]){
		new GrammerTest();
	}
}