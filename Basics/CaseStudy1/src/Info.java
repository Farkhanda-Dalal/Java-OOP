
public class Info {
	
	public static void display(Student student)
	{
		System.out.println("Student Id    :    "+student.getId());
		System.out.println("Student Name  :    "+student.getName());
		System.out.println("Student DOB   :    "+student.getDob());
		
	}
	
	public static void display(Student[] stud)
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("Student Id    :   "+stud[i].getId());
			System.out.println("Student Name  :   "+stud[i].getName());
			System.out.println("Student DOB   :   "+stud[i].getDob());
			System.out.println("----------------------------------------------------------------");
		}
	}
	
	public static void display(Course course)
	{
		System.out.println("-------------------------Course Details-------------------------");
		System.out.println("Course Id      :      "+course.getId());
		System.out.println("Course Name    :      "+course.getName());
		System.out.println("Course Duration:      "+course.getDuration());
		System.out.println("Course Fees    :      "+course.getFees());
		System.out.println("--------------------------------------------------------------------");
	}

	
}
