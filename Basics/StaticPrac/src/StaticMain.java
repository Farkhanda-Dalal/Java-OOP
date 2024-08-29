import java.util.Scanner;

public class StaticMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Hello Main");
		StaticPrac.Show();
		
		StaticPrac c1=new StaticPrac();
		c1.studId=101;
		c1.collegeId=1;
		c1.Display();
		
		StaticPrac c2=new StaticPrac();
		c2.studId=102;
		c2.collegeId=2;
		c2.Display();
		c1.Display();

	}

}
