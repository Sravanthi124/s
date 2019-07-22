import java.util.Scanner;

public class Is_String_Numeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		String st=sc.nextLine();
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			if(!(st.charAt(i)>='0'&&st.charAt(i)<='9'))
			{
				count++;
				System.out.print("no");
				break;
			}
		}
		if(count==0)
			System.out.print("yes");
	}

}
