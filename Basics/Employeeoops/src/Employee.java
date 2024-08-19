
public class Employee {

	private int empNo;
	private String empName;
	private String empDes;
	private double empSal;
	
	public Employee(int empNo, String empName, String empDes, double empSal) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empDes = empDes;
		this.empSal = empSal;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDes() {
		return empDes;
	}

	public void setEmpDes(String empDes) {
		this.empDes = empDes;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	
	
}
