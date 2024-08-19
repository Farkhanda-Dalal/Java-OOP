
public class Account {

	private int accNo;
	private int ifsc;
	private String accType;
	private double accBal;
	
	public Account(int accNo, int ifsc, String accType, double accBal) {
		super();
		this.accNo = accNo;
		this.ifsc = ifsc;
		this.accType = accType;
		this.accBal = accBal;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public int getIfsc() {
		return ifsc;
	}

	public void setIfsc(int ifsc) {
		this.ifsc = ifsc;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public double getAccBal() {
		return accBal;
	}

	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	
	
	
	
}
