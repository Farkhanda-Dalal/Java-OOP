import java.util.Scanner;

public class AccountOopsInfo {

	Scanner sc=new Scanner (System.in);
	
	int i;
	
	public AccountOops[] create()
	{
		System.out.println("How many accounts do you want:");
		int n=sc.nextInt();
		AccountOops arr[]=new AccountOops[n];
		
		for(i=0;i<arr.length;i++)
		{
			System.out.println("Enter account number,account name,account type,account balance:");
			int accNo=sc.nextInt();
			String accName=sc.next();
			String accType=sc.next();
			double accBal=sc.nextDouble();
			
			AccountOops accobj	=new AccountOops(accNo, accName, accType, accBal);
			arr[i]=accobj;
		}
		
		return arr;

	}
	
	public void display(AccountOops accobj[])
	{
		for(int i=0;i<accobj.length;i++)
		{
			System.out.println("Account Number   :   "+accobj[i].getAccNo());
			System.out.println("Account Name     :   "+accobj[i].getAccName());
			System.out.println("Account Type     :   "+accobj[i].getAccType());
			System.out.println("Account Number   :   "+accobj[i].getAccBal());
		}
	}
}
