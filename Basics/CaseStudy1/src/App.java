import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
//		scenario1();	
//		scenario2();
//		System.out.println("---------------Display by User-Defined Student Array---------------");
//		scenario3();
		Course course=new Course(1, "Math", 6, 50000);
//		Info.display(course);
		
		AppEngine.introduce(course);
	}
	
	public static void scenario1()
	{
		Student s1=new Student(1, "Farkhanda", "13-07-03");
		Student s2=new Student(2, "Devansh", "30-08-00");
		Student s3=new Student(3, "Aarti", "26-05-99");
		
		System.out.println("----------------Display by Student Object-------------------");
		Info.display(s1);
		System.out.println("-----------------------------------------------------------------");
		Info.display(s2);
		System.out.println("------------------------------------------------------------------");
		Info.display(s3);
		System.out.println("------------------------------------------------------------------");
		
		/*if Info was not a static method then object of Info needs to be created:
		 * Info i=new Info();
		 * i.display(s1);
		 * i.display(s2);
		 * i.display(s3);
		 */
	}
	
	public static void scenario2()
	{
		Student stud[]=new Student[3];
		
		System.out.println("---------------Display by Hardcoded Student Array---------------");
		stud[0]=new Student(1, "Farkhanda", "13-07-03");
		stud[1]=new Student(2, "Devansh", "30-08-00");
		stud[2]=new Student(3, "Aarti", "26-05-99");
		
		Info.display(stud);
	
		
	}
	
	public static void scenario3()
	{
		Student stud[]=new Student[3];
		
		for(int i=0;i<3;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter student id:");
			int id=sc.nextInt();
			System.out.println("Enter student name:");
			String name=sc.next();
			System.out.println("Enter student date of birth:");
			String dob=sc.next();
			
			stud[i]=new Student(id, name, dob);
		}
		
		Info.display(stud);
		
	}

}
