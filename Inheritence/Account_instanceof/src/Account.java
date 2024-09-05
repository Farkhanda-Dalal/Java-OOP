
public class Account {
	
	int accNO;
	double accBal;
	String accType;
	Customer cust;
	Address addr;
	
	public Account(int accNO, double accBal, String accType, Customer cust, Address addr) {
		super();
		this.accNO = accNO;
		this.accBal = accBal;
		this.accType = accType;
		this.cust = cust;
		this.addr = addr;
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

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	
}
