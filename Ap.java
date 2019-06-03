import java.util.Scanner;

public class Ap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A=sc.nextInt();
		int D=sc.nextInt();
		int sum=(N / 2) * (2 * A + (N - 1) * D) ;
		System.out.println(sum);
	}

}
