
public class Manager extends Employee {
	
	private int hrs;

	public Manager(int empId, String empName, double empSal, int hrs) {
		super(empId, empName, empSal);
		this.hrs = hrs;
	}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	
	

}
