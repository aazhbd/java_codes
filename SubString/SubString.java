import javax.swing.*;

public class SubString{
	public static void main(String args[]){
		String a, b;
		int lena, i, j=0, k=0, lenb;
		
		a=JOptionPane.showInputDialog("Enter");
		b=JOptionPane.showInputDialog("Enter");
		lena=a.length();
		lenb=b.length();
		
		for(i=0; i<lena; i++){
			if(a.charAt(i)==b.charAt(0)){
				k=i;
				for(j=0; j<lenb; j++){
					if(a.charAt(k)==b.charAt(j)){
						break;
					}
					k++;
				}	
			}
		}
		if(i==lena-1) JOptionPane.showMessageDialog(null, "Not Found");
		else JOptionPane.showMessageDialog(null, "Found "+b+" in "+a+" in index: "+k);
	}
}