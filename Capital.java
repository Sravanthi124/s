import java.util.Scanner;

public class Capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			char ch=a[i].charAt(0);
			char t=Character.toUpperCase(ch);
			a[i]=a[i].replace(ch,t);
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%s ",a[i]);
		}
	}

}
