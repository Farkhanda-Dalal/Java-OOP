import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int ch;
		
		Dev d=new Dev(20, 0);
		
		do
		{
			User u=new User();
			int ucoins=u.insert();
			
			d.dispense(ucoins);	
			
			System.out.println("Press 1 to continue:");
			ch=sc.nextInt();
		}
		while( ch==1);
	}

}
