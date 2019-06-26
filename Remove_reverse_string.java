import java.util.Scanner;

public class Remove_reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String st=sc.nextLine();
		String st1=st.replaceAll("[aeiouAEIOU]","");
		String st2="";
		for(int i=0;i<st1.length();i++)
		{
			st2=st1.charAt(i)+st2;
		}
		System.out.println(st2);
	}

}
