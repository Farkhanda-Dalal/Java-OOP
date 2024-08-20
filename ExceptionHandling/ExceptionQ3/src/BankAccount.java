
public class BankAccount {
	
	private int accNO;
	private String custName;
	private String accType;
	private float balance;
	
	public BankAccount(int accNO, String custName, String accType, float balance) {
		super();
		this.accNO = accNO;
		this.custName = custName;
		this.accType = accType;
		this.balance = balance;
	}
	
	public void deposit(float amt)
	{
		if(balance<0)
		{
			try {
				throw new NegativeAmount();
			} catch (NegativeAmount e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
		else
		{
			this.balance=balance+amt;
			System.out.println(amt+" deposited.");
		}
	}
	
	public void withdraw(float amt)
	{
		if(accType.equalsIgnoreCase("Savings")&&(balance>1000))
		{
			this.balance=balance-amt;
			System.out.println(amt+" withdrawn.");
		}
		else if(accType.equalsIgnoreCase("Current")&&(balance>5000))
		{
			this.balance=balance-amt;
			System.out.println(amt+" withdrawn.");
		}
		else
		{
			try {
				throw new InsufficientFunds();
			} catch (InsufficientFunds e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
	}
	
	public void getBalance()
	{
		if(accType.equalsIgnoreCase("Savings")&&(balance<1000))
		{
			try {
				throw new LowBalanceException();
			} catch (LowBalanceException e) {
				// TODO Auto-generated catch block
				System.out.println(e+"Current Balance is "+balance);
			}
		}
		else if(accType.equalsIgnoreCase("Current")&&(balance<5000))
		{
			try {
				throw new LowBalanceException();
			} catch (LowBalanceException e) {
				// TODO Auto-generated catch block
				System.out.println(e+"Current Balance is "+balance);
			}
		}
		else if(balance<0)
		{
			try {
				throw new NegativeAmount();
			} catch (NegativeAmount e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("Current balance="+balance);
		}
		
	}
}
