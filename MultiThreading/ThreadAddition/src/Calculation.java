import java.util.Scanner;

public class Calculation extends Thread{
	
	public void run()
	{
		addData();
	}
	
	public void addData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any 2 numbers:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int add=n1+n2;
		System.out.println("Addition="+add);
	}

}
