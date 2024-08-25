import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter customer name,mobile no");
		String custName=sc.next();
		String custMob=sc.next();
		
		System.out.println("Enter account no,account balance,account type");
		int accNO=sc.nextInt();
		double accBal=sc.nextDouble();
		String accType=sc.next();
		
		Account acc=new Account(accNO, accBal, accType);
		//or Account acc=null;
		if (accType.equalsIgnoreCase("Current"))
		{
			System.out.println("Enter Name of Firm:");
			String firm=sc.next();
			acc=new CurrentAccount(accNO, accBal, accType, firm);
			//or acc=new CurrentAccount(accNO, accBal, accType, firm);
		}
		if (accType.equalsIgnoreCase("Savings"))
		{
			System.out.println("Enter Rate of Interest:");
			float roi=sc.nextFloat();
			acc=new SavingsAccount(accNO, accBal, accType, roi);
		}
		
		System.out.println("Enter Customer city,state,pincode:");
		String city=sc.next();
		String state=sc.next();
		int pincode=sc.nextInt();
		Address addr=new Address(city, state, pincode);
		
		Customer cust=new Customer(custName, custMob, addr, acc);
		display(cust);
	
	}

	public static void display(Customer cust)
	{
		System.out.println("----------------------------------------------------");
		System.out.println("Customer Name    :   "+cust.getCustName());
		System.out.println("Customer Mob No  :   "+cust.getCustMob());
		System.out.println("----------------------------------------------------");
		Account acc=cust.getAcc();
		System.out.println("Account Number   :   "+cust.getAcc().getAccNO());
		System.out.println("Account Type     :   "+cust.getAcc().getAccType());
		System.out.println("Account Balance  :   "+cust.getAcc().getAccBal());
		if (acc instanceof SavingsAccount)
		{
			SavingsAccount s=(SavingsAccount)acc;//DOWNCASTING
			System.out.println("Interest Rate    :   "+s.getRoi());
			System.out.println("Total Balance    :   "+(acc.getAccBal()*s.getRoi()));
		}
		if (acc instanceof CurrentAccount)
		{
			CurrentAccount c=(CurrentAccount)acc;//DOWNCASTING
			System.out.println("Company Name     :   "+c.getFirm());

		}
		System.out.println("----------------------------------------------------");
		System.out.println("Customer City    :   "+cust.getAddr().getCity());
		System.out.println("Customer State   :   "+cust.getAddr().getState());
		System.out.println("Customer Pincode :   "+cust.getAddr().getPincode());	
	
	}
	
	
	
	
	
}
