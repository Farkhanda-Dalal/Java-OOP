import java.util.Scanner;

public class AppEngine {

	static int i;
	
	public static void introduce(Course course)
	{
		Scanner sc=new Scanner(System.in);
		
		Course c[]=new Course[3];
		for(i=0;i<c.length;i++)
		{
			System.out.println("-----------------------------------------------------");
			System.out.println("Enter course id,name,duration,fee:");			course.id=sc.nextInt();
		    course.name=sc.next();			course.duration=sc.nextFloat();			course.fees=sc.nextFloat();
			
//	        int  id=sc.nextInt();
//			String name=sc.next();
//			float duration=sc.nextFloat();
//			float fee=sc.nextFloat();
			
			//c[i]=new Course(id, name, duration, fee);
			c[i]=new Course(course.id, course.name, course.duration, course.fees);
			
		}
		
		for(i=0;i<c.length;i++)
		{
			System.out.println("-----------------------------------------------------");
			System.out.println("Course id      :      "+c[i].id);
			System.out.println("Course name    :      "+c[i].name);
			System.out.println("Course duration:      "+c[i].duration);
			System.out.println("Course fee     :      "+c[i].fees);
			System.out.println("-----------------------------------------------------");
		}
		
	}
	
	public static void register(Student student)
	{
		
	}

}
