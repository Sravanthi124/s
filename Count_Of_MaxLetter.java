import java.util.Scanner;

public class Count_Of_MaxLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int maxcount=0;
		int count=0;
		char ch='a';
		for(int i=0;i<st.length();i++)
		{	
			count=0;
			for(int j=i+1;j<st.length();j++)
			{
				if(st.charAt(i)==st.charAt(j))
				{
					count++;
				}
			}
			if(count>maxcount)
			{
				maxcount=count;
				ch=st.charAt(i);
			}
		}
		System.out.println(ch);
		
	}

}
