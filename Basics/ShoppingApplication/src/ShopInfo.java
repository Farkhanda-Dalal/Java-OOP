import java.util.Scanner;

public class ShopInfo {

	Scanner sc=new Scanner (System.in);
	
	public void create()
	{
		ShopInfo sinfo=new ShopInfo();
		Address addr=sinfo.addr();
		Product prod=sinfo.prod();
		
		sinfo.addr();
		sinfo.prod();
		sinfo.cust(addr, prod);
	
	}
	public Address addr()
	{
		
		System.out.println("Enter name of City:");
		String city=sc.next();
		
		System.out.println("Enter name of State:");
		String state=sc.next();
		
		System.out.println("Enter Pincode:");
		int pincode=sc.nextInt();
		
		Address addr=new Address(city, state, pincode);
		
		return addr;
	}
	
	public Product prod()
	{
		
		System.out.println("Enter Product Id:");
		int prodId=sc.nextInt();
		
		System.out.println("Enter name of Product:");
		String prodName=sc.next();
		
		System.out.println("Enter Product Price:");
		double prodPrice=sc.nextDouble();
		
		System.out.println("Enter Product Quantity:");
		double prodQty=sc.nextDouble();
		
		Product prod=new Product(prodId, prodName, prodPrice, prodQty);
		
		return prod;
	}
	
	public Customer cust(Address addr,Product prod)
	{
		System.out.println("Enter Customer Id:");
		int custId=sc.nextInt();
		
		System.out.println("Enter Customer Name:");
		String custName=sc.next();
		
		System.out.println("Enter Mobile Number:");
		String mobNo=sc.next();
		
		Customer cust=new Customer(custId, custName, mobNo, addr, prod);
		
		return cust;
	}
	public void display( Customer cust)
	{
		System.out.println("--------------COSTUMER-------------");
		System.out.println("Customer Id      :       "+cust.getCustId());
		System.out.println("Customer Name    :       "+cust.getCustName());
		System.out.println("Mobile Number    :       "+cust.getMobNo());
		System.out.println("--------------ADDRESS---------------");
		System.out.println("City             :       "+cust.getAddr().getCity());
		System.out.println("State            :       "+cust.getAddr().getState());
		System.out.println("Pincode          :       "+cust.getAddr().getPincode());
		System.out.println("--------------PRODUCT---------------");
		System.out.println("Product Id       :       "+cust.getProd().getProdId());
		System.out.println("Product Name     :       "+cust.getProd().getProdName());
		System.out.println("Product Price    :       "+cust.getProd().getProdPrice());
		System.out.println("Product Quantity :       "+cust.getProd().getProdQty());
		
	}
}
