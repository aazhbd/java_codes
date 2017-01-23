import java.util.*;
import javax.swing.*;

public class RedLink{
	LinkedList l[];
	int a[], n;
	String s;
	
	public RedLink(){
		int i, j, max, d, k;
		n=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of data to be sorted:"));
		
		a=new int[n+1];
		for(i=0; i<n; i++){
			a[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter data no: "+i+" :"));
		}
		
		for(i=0; i<n; i++){
			System.out.print("\t"+a[i]);
		}
		
		l=new LinkedList[10];
		for(i=0; i<10; i++){
			l[i]=new LinkedList();
		}
		
		max=maxi(a);
		
		for(i=0; i<max; i++){
			for(j=0; j<n; j++){
				d=Place(a[j], i+1);
				l[d].addLast(""+a[j]);
			}
			k=0;
			for(j=0; j<10; j++){
				while(l[j].isEmpty()!=true){
					a[k]=Integer.parseInt(""+l[j].removeFirst());
					k++;
				}
			}
		}
		System.out.println("\n\n");
		for(i=0; i<n; i++){
			System.out.print("\t"+a[i]);
		}
		System.out.println("\n\n");
	}
	
	public int Place(int a, int p){
		p--;
		while(p!=0){
			a/=10;
			p--;
		}
		return a%10;
	}
	
	public int maxi(int a[]){
		int m=a[0], i;
		for(i=1; i<n; i++)
			if(a[i]>m) m=a[i];
		return m;
	}
	
	public static void main(String args[]){
		new RedLink();
	}
}