import java.io.*;
import javax.swing.*;

class Queue{
	int r, f, size;
	int qu[];
	
	Queue(int n){
		size=n;
		qu=new int[size];
		r=0;
		f=0;
	}

	public void insert(int c){
		if(f==1 && r==size || f==r+1){
			System.out.println("--OverFlow--");
		}
		else if(f==0){
			f=1;
			r=1;
		}
		else if(r==size){
			r=1;
		}
		else r++;
		qu[r]=c;
	}

	public int del(){
		if(f==0){
			System.out.println("--UnderFlow--");
			return 1;
		}
		int c;
		c=qu[f];
		qu[f]='0';
		if(f==r){
			f=0;
			r=0;
		}
		else if(f==size) f=1;
		else f++;
		return c;
	}
}


public class TQueue{
	public static void main(String args[]){
		Queue q=new Queue(7);
		int i, j;
		for(i=0; i<5; i++){
			j=Integer.parseInt(JOptionPane.showInputDialog("enter number:"));
			q.insert(j);
		}
		
		for(i=0; i<5; i++){
			System.out.println(""+q.del());
		}
	}
}