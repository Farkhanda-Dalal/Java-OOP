
public class EmployeeMain {

	public static void main(String[] args) {
		
		Manager mobj=new Manager(1, "Farkhanda", 100000, 9);
		System.out.println("-----------------MANAGER DATA---------------------");
		display(mobj);
		Developer dobj=new Developer(2, "FHHG", 46576, 2000);
		System.out.println("-----------------DEVELOPER DATA---------------------");
		display(dobj);
	}

	public static void display(Employee emp)
	{
		System.out.println("Employee no   :     "+emp.getEmpId());
		System.out.println("Employee name :     "+emp.getEmpName());
		System.out.println("Employee sal  :     "+emp.getEmpSal());
		
		if(emp instanceof Manager)
		{
			Manager mobj=(Manager)emp;
			System.out.println("Manager Hours :     "+mobj.getHrs());
		}
		if(emp instanceof Developer)
		{
			Developer dobj=(Developer)emp;
			System.out.println("Developer Bonus:    "+dobj.getBonus());
		}
	}
}
