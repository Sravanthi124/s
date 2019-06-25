import java.util.Scanner;

public class Right_shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int[] a1=new int[a];
		for(int i=0;i<a;i++)
		{
			a1[i]=sc.nextInt();
		}
		for(int j=0;j<b;j++)
		{	
			int i;
			int temp=a1[a-1];
			for(i=a-1;i>0;i--)
			{
				a1[i]=a1[i-1];
			}
			a1[i]=temp;
		}
		for(int i=0;i<a;i++)
		{
			System.out.print(a1[i]+" ");
		}
		
	}

}
