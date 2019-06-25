import java.util.Scanner;

public class Holiday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		switch(st)
		{
		case "Saturday":System.out.println("yes");
						break;
		case "Sunday":System.out.println("yes");
						break;
		default:System.out.println("no");
		
		}
	}

}
