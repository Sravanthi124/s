import java.util.Arrays;
import java.util.Scanner;

public class Basic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=0;
		Arrays.sort(a);
		System.out.println(a[k-1]);
		}

}
