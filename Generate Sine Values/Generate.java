import java.io.*;
import javax.swing.*;

public class Generate{
	private String s;
	private double x, y;
	
	public Generate(){
		for(x=0; x<=360; x++){
			y=function(x);
			s=x+" "+y+"\n";
			try{
				RandomAccessFile F=new RandomAccessFile("Data.txt", "rw");
				F.seek(F.length());
				F.writeBytes(s);
			}
			catch(IOException ex){
				System.out.println("Can't write "+ex);
			}
		}
	}

	
	public double function(double x){
		return Math.sin(x);
	}
	public static void main(String args[]){
		new Generate();
	}
}