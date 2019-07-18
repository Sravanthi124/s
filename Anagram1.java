import java.util.Arrays;
import java.util.Scanner;

public class Anagram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		int count=0;
		String[] st=new String[n];
		String st1="kabali";
		char[] ch1=st1.toCharArray();
		Arrays.sort(ch1);
		for(int i=0;i<n;i++)
		{
			st[i]=sc.nextLine();
		}
		for(int i=0;i<n;i++)
		{
			String st2=st[i];
			char[] ch=st2.toCharArray();
			Arrays.sort(ch);
			if(Arrays.equals(ch, ch1))
				count++;
		}
		System.out.println(count);
	}

}
