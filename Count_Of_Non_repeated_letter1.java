import java.util.Scanner;

public class Count_Of_Non_repeated_letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{	
			count=0;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(a[i]);
				break;
			}
		}
	}

}
