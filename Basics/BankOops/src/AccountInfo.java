import java.util.Scanner;

public class AccountInfo 
{

	Scanner sc=new Scanner (System.in);
	
	int i;
	int n;
	
	public Account[] create()
	{
		System.out.println("How many accounts do you want to create:");
		n=sc.nextInt();
		Account[] acc=new Account[n];
		
		for(int i=0;i<acc.length;i++)
		{
			System.out.println("Enter Account Number:");
			int accNo=sc.nextInt();
			System.out.println("Enter IFSC Number:");
			int ifsc=sc.nextInt();
			System.out.println("Enter Account Type:");
			String accType=sc.next();
			System.out.println("Enter Account Balance:");
			double accBal=sc.nextDouble();
			
			acc[i]=new Account(accNo, ifsc, accType, accBal);
		}
		
		//search
		System.out.println("Enter Account number you want to search:");
		int search=sc.nextInt();
		
		boolean b=false;
		for(i=0;i<acc.length;i++)
		{
			if(acc[i].getAccNo()==search)
			{
				b=true;
			}
		}
		
		if(b==true)
		{
			System.out.println("Account found.");
		}
		else
		{
			System.out.println("Account not found.");
		}
		
		//sort
		

	  //deposit:
	        System.out.println("Enter account in which you want to deposit:");
	        int accNo=sc.nextInt();
	  		System.out.println("Enter amount you want to deposit:");
	  		double deposit=sc.nextDouble();
	  		
	  		
	  		for(i=0;i<acc.length;i++)
	  		{
	  			if(acc[i].getAccNo()==accNo)
	  			{
	  				double result=deposit+acc[i].getAccBal();
	  				System.out.println("amount"+result);
	  				acc[i].setAccBal(result);
	  			}
	  		}
	    
	  	//withdraw:
	  		System.out.println("Enter account in which you want to withdraw from:");
	        int accNo1=sc.nextInt();
	  		System.out.println("Enter amount you want to Withdraw:");
	  		double withdraw=sc.nextDouble();
	  		
	  		
	  		for(i=0;i<acc.length;i++)
	  		{
	  			if((acc[i].getAccBal()>1000)&&(acc[i].getAccNo()==accNo1))
	  			{
	  				double result1=acc[i].getAccBal()-withdraw;
	  				System.out.println("amount"+result1);
	  				acc[i].setAccBal(result1);
	  			}
	  		}
	  		
	  	//delete:
	  		
	  		
		//display:
		
		
		
		return acc;
		
		
	}
	
	
	
}
