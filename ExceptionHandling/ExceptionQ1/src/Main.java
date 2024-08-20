import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int N=sc.nextInt();
		
		double avg=CalcAverage.avgFirstN(N);
	}

}
