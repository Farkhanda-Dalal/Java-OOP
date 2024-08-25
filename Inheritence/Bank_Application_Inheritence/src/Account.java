
public class Account {
	
	int accNO;
	double accBal;
	String accType;
	
	public Account(int accNO, double accBal, String accType) {
		super();
		this.accNO = accNO;
		this.accBal = accBal;
		this.accType = accType;
	}

	public int getAccNO() {
		return accNO;
	}

	public void setAccNO(int accNO) {
		this.accNO = accNO;
	}

	public double getAccBal() {
		return accBal;
	}

	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}
	
	

}
