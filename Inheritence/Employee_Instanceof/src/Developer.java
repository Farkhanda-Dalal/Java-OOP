
public class Developer extends Employee{
	
	float bonus;

	public Developer(int empId, String empName, double empSal, float bonus) {
		super(empId, empName, empSal);
		this.bonus = bonus;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

}
