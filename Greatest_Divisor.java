import java.util.Scanner;

public class Greatest_Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=0;
		for(int i=2;i<=a;i++)
		{
			if(a%i==0&&b%i==0)
			{
				c=i;
			}
		}
		System.out.println(c);
	}

}
