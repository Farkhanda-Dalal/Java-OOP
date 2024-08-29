import java.util.Scanner;

public class BookInfo {

	Scanner sc=new Scanner(System.in);
	
	public Books[] create()
	{
		System.out.println("How many books do you want:");
		int n=sc.nextInt();
		
		Books bobj[]=new Books[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name and price of books:");
			String book_name=sc.next();
			double book_price=sc.nextDouble();
			bobj[i]=new Books(book_name, book_price);
		}
		return bobj;
	}
	
	public void display(Books bobj[])
	{
		for(int i=0;i<bobj.length;i++)
		{
			System.out.println("Book Name :  "+bobj[i].getBook_title());
			System.out.println("Book Price:  "+bobj[i].getBook_price());
		}
	}
	
}
