import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=sc.nextLine();
		int[] m1=new int[256];
		int[] m2=new int[256];
		for(int i=0;i<str.length();i++)
		{
			char c1=str.charAt(i);
			char c2=str1.charAt(i);
			if(m1[c1]!=m2[c2])
			{
				System.out.println("False");
				break;
			}
			m1[c1]=i+1;
			m2[c2]=i+1;
		}
		System.out.println("True");
	}
}
