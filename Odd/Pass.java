import javax.swing.*;

public class Pass{
	int i;
	public void filter(int a[]){
		for(i=0; i<a.length; i++){
			if(a[i]%2==0) System.out.println("Even no "+i);
		}
	}
	
	public static void main(String args[]){
		int i;
		String s;
		int a[]=new int[10];
		Pass p=new Pass();
		for(i=0; i<10; i++){
			s=JOptionPane.showInputDialog("Enter number");
			a[i]=Integer.parseInt(s);
		}
		p.filter(a);
	}
}