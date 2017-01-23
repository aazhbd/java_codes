import java.io.*;

public class LineRect{
	public static void main(String args[]){
		int len, l1, l2, i, j;
		String sl1, sl2;
		
		len=args.length;
		System.out.println(len);
		
		sl1=args[0];
		sl2=args[1];
		
		l1=Integer.parseInt(sl1);
		l2=Integer.parseInt(sl2);
		
		for(i=0; i<l1; i++){
			System.out.print(".");
		}
		
		System.out.println("");
		
		for(i=0; i<l2; i++){
			System.out.print(".");
			for(j=0; j<l1-1; j++){
				System.out.print(" ");
			}
			System.out.println(".");
		}
		for(i=0; i<l1; i++){
			System.out.print(".");
		}
	}
}