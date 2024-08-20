import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter emp id,name,designation and basic salary:");
		Emp e=new Emp(sc.nextInt(),sc.next(), sc.next(), sc.nextDouble());
		
		e.calculateHRA();
		e.printDET();

	}

}
