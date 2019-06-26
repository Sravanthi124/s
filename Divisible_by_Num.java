import java.util.Scanner;

public class Divisible_by_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
		{
			if(a%b==0)
			{
				System.out.println(a);
			}
			else
				System.out.println(a*b);
		}
		else
		{
			if(b%a==0)
				System.out.println(b);
			else
				System.out.println(a*b);
		}
	}

}
