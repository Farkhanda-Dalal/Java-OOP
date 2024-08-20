import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int ch;
		
		System.out.println("Enter any 2 no:");
		Number n=new Number(sc.nextInt(), sc.nextInt());
		
		do
		{
			System.out.println("1-Add\n2-Sub\n3-Multi\n4-Div");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				n.add();
				break;
			case 2:
				n.sub();
				break;
			case 3:
				n.multi();
				break;
			case 4:
				n.div();
				break;
			}
			
			System.out.println("Press 1 to continue:");
			ch=sc.nextInt();
		}
		while(ch==1);

	}

}
