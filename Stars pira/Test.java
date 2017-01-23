public class Test{
	public static void main(String args[]){
		int i, j, k, l;
		
		for(i=1; i<=10; i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print("$");
			}
			for(k=i; k<=10; k++)
			{
				System.out.print("*");
			}
			for(l=10; l>=i; l--)
			{
				System.out.print("#");
			}
			System.out.println("");
		}
	}
}