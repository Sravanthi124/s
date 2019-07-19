import java.util.Scanner;

public class Encodede {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] ch=str.toCharArray();
		for(int i=0;i<st.length();i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(st.charAt(i)==ch[j])
				{
					if(j==23)
						System.out.print("A");
					else if(j==24)
						System.out.print("B");
					else if(j==25)
						System.out.print("C");
					else
						System.out.print(ch[j+3]);
				}
					
			}
		}
	}

}
