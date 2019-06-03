import java.util.Scanner;

public class Basic4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] b=new int[a];
		for(int i=0;i<a;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<a-1;i++)
		{
			if(b[i]>b[i+1])
			{
				System.out.println(i);
				break;
			}
		}
	}

}
