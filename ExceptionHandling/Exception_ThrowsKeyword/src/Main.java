import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Welcome to job portal.");
		System.out.println("Enter your name,address,age,perct:");
		String name=sc.next();
		String addr=sc.next();
		int age=sc.nextInt();
		float perct=sc.nextFloat();
		
		try {
			display(age,perct);
			System.out.println("Welcome to job portal.Create your job profile");
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidPerctException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thank you");
	}
	
	public static void display(int age,float perct) throws InvalidAgeException,InvalidPerctException
	{
		try
		{
			if(age<18)
			{
				throw new InvalidAgeException();
			}
			if(perct<60)
			{
				throw new InvalidPerctException();
			}
			else
			{
				System.out.println("You are applicable for job");
			}
		}
		catch(InvalidAgeException|InvalidPerctException e)
		{
			throw e;
		}
		
	}

}
