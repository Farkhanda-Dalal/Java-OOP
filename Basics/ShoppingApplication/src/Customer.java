
public class Customer {

	private int custId;
	private String custName;
	private String mobNo;
	private Address addr;
	private Product prod;
	
	public Customer(int custId, String custName, String mobNo, Address addr, Product prod)
	{
		super();
		this.custId = custId;
		this.custName = custName;
		this.mobNo = mobNo;
		this.addr = addr;
		this.prod = prod;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}
	
	
}
