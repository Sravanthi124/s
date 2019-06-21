import java.util.Scanner;

public class Swap_Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		String st1="";
		for(int i=0;i<st.length();i++)
		{
			if(i%2!=0)
			{
				st1=st1+st.charAt(i-1);
			}
			else
			{
				st1=st1+st.charAt(i+1);
			}
		}
		System.out.println(st1);
	}

}
