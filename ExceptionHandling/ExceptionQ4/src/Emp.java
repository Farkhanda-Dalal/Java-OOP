
public class Emp {
	
	private int empId;
	private String empName;
	private String designation;
	private double basic;
	private double hra;
	
	public Emp(int empId, String empName, String designation, double basic) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.basic = basic;
		
		if(basic<500)
		{
			try {
				throw new LowSalException();
			} catch (LowSalException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
	}

	public void printDET()
	{
		System.out.println("Employee Id         :       "+empId);
		System.out.println("Employee Name       :       "+empName);
		System.out.println("Employee Designation:       "+designation);
		System.out.println("Employee Basic      :       "+basic);
		System.out.println("Employee HRA        :       "+hra);
	}
	
	public void calculateHRA()
	{
		if(designation.equalsIgnoreCase("Manager"))
		{
			hra=0.10*basic;
		}
		else if(designation.equalsIgnoreCase("Officer"))
		{
			hra=0.12*basic;
		}
		else if(designation.equalsIgnoreCase("Clerk"))
		{
			hra=0.5*basic;
		}
	}

	
}
