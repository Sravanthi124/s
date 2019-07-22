import java.util.Arrays;
import java.util.Scanner;

public class Max_ele_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n+k];
		int[] b=new int[k];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<k;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<k;i++)
		{
			a[n+i]=b[i];
			Arrays.sort(a);
			System.out.print(a[a.length-1]+" ");
		}
	}

}
