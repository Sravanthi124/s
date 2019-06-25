import java.util.Scanner;

public class Difference_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		String st1=sc.nextLine();
		int count=0;
		if(st.length()!=st1.length())
		{
			System.out.println("no");
		}
		else
		{
			for(int i=0;i<st.length();i++)
			{
				if(st.charAt(i)!=st1.charAt(i))
				{
					count++;
				}
			}
			if(count==1)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}

}
