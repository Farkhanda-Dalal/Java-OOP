import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		int ch,ch1;
		
		AccountInfo ainfo=new AccountInfo();
		Account[] acc=ainfo.create();
		AccountMain mobj=new AccountMain();
		mobj.display(acc);;
		
		
	}

	public void display(Account[] acc)
	{
		
		for(int i=0;i<=acc.length;i++)
		{
			System.out.println("Account Number     :     "+acc[i].getAccNo());
			System.out.println("IFSC Code          :     "+acc[i].getIfsc());
			System.out.println("Account Type       :     "+acc[i].getAccType());
			System.out.println("Account Balance    :     "+acc[i].getAccBal());
		}
	}
}
