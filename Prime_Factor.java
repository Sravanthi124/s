import java.util.Scanner;

public class Prime_Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<=n;i++)
		{	
			count=0;
			if(n%i==0)
			{
				for(int j=2;j<=i;j++)
				{
					if(i%j==0)
						count++;
				}
			}
			if(count==1)
				System.out.println(i);
		}
	}

}
