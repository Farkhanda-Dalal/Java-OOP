import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);

		System.out.println("Welcome to job portal.");
		System.out.println("Enter your name,address,age:");
		String name=sc.next();
		String addr=sc.next();
		int age=sc.nextInt();

		try {
			if (age<18)
			{
				//throw keyword is used to explicitly call an exception i.e to call a user defined or
				//custom exception
				throw new InvalidAgeExpection();
			}
		} catch (InvalidAgeExpection e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			//	OR		
			//e.printStackTrace();-this gives detail about exception like on which line it has occured
		}

		System.out.println("Welcome to job portal.Create your job profile");

	}

}
