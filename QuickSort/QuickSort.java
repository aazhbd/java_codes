import javax.swing.*;

public class QuickSort{
	public QuickSort(int a[], int n){
		quicksort(a, 0, n-1);
	}
	
	int partition(int A[],int p,int q){
		int x,i,j,temp;
		x=A[p];
		i=p;
		
		for(j=p+1;j<=q;j++){
			if(A[j]<=x){
				i=i+1;
				temp=A[i];
				A[i]=A[j];
				A[j]=temp;
			}
		}
		temp=A[p];
		A[p]=A[i];
		A[i]=temp;
		return i;
	}
	
	void quicksort(int A[],int p,int r){
		int q;
		if(p<r){
			q=partition(A,p,r);
			quicksort(A,p,q-1);
			quicksort(A,q+1,r);
		}
	}
	
	public static void main(String args[]){
		int a[], n, i;
		n=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of data to be sorted:"));
		a=new int[n+1];

		for(i=0; i<n; i++){
			a[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter data:"));
		}
		new QuickSort(a, n);
		for(i=0; i<n; i++){
			System.out.println("Data no "+i+" is "+a[i]);
		}
	}
}