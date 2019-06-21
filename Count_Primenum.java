import java.util.Scanner;

public class Count_Primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int r=sc.nextInt();
		int c1=1;
		int c2=0;
		for(int j=i;j<=r;j++)
		{
			c1=0;
			for(int k=1;k<=j;k++)
			{
				if(j%k==0)
					c1++;
			}
			if(c1==2)
				c2++;
		}
		System.out.println(c2);
	}

}
