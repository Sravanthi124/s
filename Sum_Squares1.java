import java.util.Scanner;

public class Sum_Squares1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n>0)
		{
			int a=n%10;
			sum=sum+(a*a);
			n=n/10;
		}
		System.out.println(sum);
	}

}
