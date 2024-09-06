
public class Customer {

	private String custId;
	private int custName;
	private String mobNo;
	private Address addr;
	private Product prod[];
	private Bill bobj[];
	
	public Customer(String custId, int custName, String mobNo, Address addr, Product[] prod, Bill[] bobj) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.mobNo = mobNo;
		this.addr = addr;
		this.prod = prod;
		this.bobj = bobj;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public int getCustName() {
		return custName;
	}

	public void setCustName(int custName) {
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

	public Product[] getProd() {
		return prod;
	}

	public void setProd(Product[] prod) {
		this.prod = prod;
	}

	public Bill[] getBobj() {
		return bobj;
	}

	public void setBobj(Bill[] bobj) {
		this.bobj = bobj;
	}
	
	
	
}