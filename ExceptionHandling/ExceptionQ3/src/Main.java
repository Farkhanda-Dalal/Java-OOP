import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int ch;
		float amt;
		
		System.out.println("Enter accNo,custName,accType,balance:");
		BankAccount b=new BankAccount(sc.nextInt(), sc.next(), sc.next(), sc.nextFloat());
				
		do
		{
			System.out.println("\n1-Deposit\n2-Withdraw\n3-Balance");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("\nEnter amount you want to deposit:");
				amt=sc.nextFloat();
				b.deposit(amt);
				break;
			case 2:
				System.out.println("\nEnter amount you want to withdraw:");
				amt=sc.nextFloat();
				b.withdraw(amt);
				break;
			case 3:
				b.getBalance();
				break;
			}
			
			System.out.println("\nEnter yes to continue:");
		}
		while(sc.next().equalsIgnoreCase("yes"));
	}
	
}
