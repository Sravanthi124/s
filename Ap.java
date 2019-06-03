import java.util.Scanner;

public class Ap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float N=sc.nextFloat();
		float A=sc.nextFloat();
		float D=sc.nextFloat();
		float sum=(float)(N / 2) * (2 * A + (N - 1) * D) ;
		System.out.println(sum);
	}

}

