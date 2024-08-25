
public class EmployeeMain {

	public static void main(String[] args) {
		
		Manager mobj=new Manager(10, "Ganesh", 50000, 9);
		Developer dobj=new Developer(20, "Ramesh", 100000, 5000);
		
		System.out.println("Manager Id      :    "+mobj.getEmpId());
		System.out.println("Manager Name    :    "+mobj.getEmpName());
		System.out.println("Manager Salary  :    "+mobj.getEmpSal());
		System.out.println("No of Hours     :    "+mobj.getHrs());
		System.out.println("-------------------------------------------------");
		System.out.println("Developer Id    :    "+dobj.getEmpId());
		System.out.println("Developer Name  :    "+dobj.getEmpName());
		System.out.println("Developer Salary:    "+dobj.getEmpId());
		System.out.println("Developer Bonus :    "+dobj.getBonus());
		System.out.println("--------------------------------------------------");
		

	}

}
