
public class AccountMain {

	public static void main(String[] args) {
		
		Customer cust=new Customer("Farkhanda", "66347234872");
		Address addr=new Address("Pune", "Maharashtra", 411042);
		SavingsAccount s=new SavingsAccount(101, 686878, "Savings", cust,addr, 6.6f);
		System.out.println("--------------------Saving Account-------------------");
		display(s);
		CurrentAccount c=new CurrentAccount(102, 100000, "Current", cust,addr, "Forbes Marshall");
		System.out.println("-------------------Current Account-------------------");
		display(c);
		
	}

	public static void display(Account acc)
	{
	System.out.println("Account Number   :   "+acc.getAccNO());
	System.out.println("Account Type     :   "+acc.getAccType());		System.out.println("Account Balance  :   "+acc.getAccBal());
	System.out.println("Customer Name    :   "+acc.getCust().getCustName());
	System.out.println("Customer Mob No  :   "+acc.getCust().getCustMob());
	System.out.println("Customer Address :   "+acc.getAddr().getCity());
	System.out.println("Customer Address :   "+acc.getAddr().getState());
	System.out.println("Customer Address :   "+acc.getAddr().pincode);
		
		if (acc instanceof SavingsAccount)
		{
			SavingsAccount s=(SavingsAccount)acc;//DOWNCASTING
			System.out.println("Interest Rate    :   "+s.getRoi());
			System.out.println("Total Balance    :   "+(acc.getAccBal()+s.getRoi()));
		}
		if (acc instanceof CurrentAccount)
		{
			CurrentAccount c=(CurrentAccount)acc;//DOWNCASTING
			System.out.println("Company Name     :   "+c.getFirm());

		}
	}
}
