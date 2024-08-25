
public class Customer {
	
	String custName;
	String custMob;
	Address addr;//adding class as variable is called composition
	Account acc;//adding class as variable is called composition
	
	public Customer(String custName, String custMob, Address addr, Account acc) {
		super();
		this.custName = custName;
		this.custMob = custMob;
		this.addr = addr;
		this.acc = acc;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustMob() {
		return custMob;
	}

	public void setCustMob(String custMob) {
		this.custMob = custMob;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	

}
