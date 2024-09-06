import java.util.Scanner;

public class ShopInfo {

	Scanner sc=new Scanner (System.in);
	
	public Customer create()
	{
		System.out.println("---------------ADDRESS------------------");
		System.out.println("Enter city:");
		String city=sc.next();
		System.out.println("Enter State:");
		String state=sc.next();
		System.out.println("Enter pincode:");
		int pincode=sc.nextInt();
		
		Address addr=new Address(city, state, pincode);
		
		System.out.println("----------------PRODUCT----------------------");
		
		System.out.println("How many products do you want:");
	    int n=sc.nextInt();
		
		Product prod[]=new Product[n];
		
		for(int i=0;i<prod.length;i++)
		{
			System.out.println("Enter Product Id:");
			int prodId=sc.nextInt();
			System.out.println("Enter Product Name:");
			String prodName=sc.next();
			System.out.println("Enter Product Price:");
			double prodPrice=sc.nextDouble();
			System.out.println("Enter Product Quantity:");
			int prodQty=sc.nextInt();
			
			prod[i]=new Product(prodId, prodName, prodPrice, prodQty);
		}
		
		//("------------------BILL---------------");
		
		Bill bobj[]=new Bill[n];
		
		for(int i=0;i<prod.length;i++)
		{
			double total=prod[i].getProdQty()*prod[i].getProdPrice();
			double cgst=0.06*total;
			double sgst=0.06*total;
			double finalprice=sgst+cgst+total;
			bobj[i]=new Bill(total, cgst, sgst, finalprice);
		}
	
		System.out.println("--------------------Customer------------------");
		System.out.println("Enter Customer Id:");
		int custId=sc.nextInt();
		System.out.println("Enter Customer Name:");
		String custName=sc.next();
		System.out.println("Enter Customer Mobile Number:");
		String mobNo=sc.next();
		
		Customer cust=new Customer(custName, custId, mobNo, addr, prod, bobj);
		
		return cust;
		
	}
	
	public void display(Customer cust)
	{
		System.out.println("----------------ADDRESS-----------------------");
		System.out.println("City            :     "+cust.getAddr().getCity() );
		System.out.println("State           :     "+cust.getAddr().getState() );
		System.out.println("Pincode         :     "+cust.getAddr().getPincode());
		
		System.out.println("----------------CUSTOMER-----------------------");
		System.out.println("Customer Name   :     "+cust.getCustName());
		System.out.println("Customer Id     :     "+cust.getCustId());
		System.out.println("Customer MobNo  :     "+cust.getMobNo());
		
		System.out.println("----------------PRODUCT-----------------------");
		Product prod[]=cust.getProd();
		Bill bobj[]=cust.getBobj();
		
		for(int i=0;i<prod.length;i++)
		{
			System.out.println("Product  Id      :"+prod[i].getProdId());
			System.out.println("Product  Name    :"+prod[i].getProdName());
			System.out.println("Product  Price   :"+prod[i].getProdPrice());
			System.out.println("Product  Quantity:"+prod[i].getProdQty());
			
			System.out.println("------------------BILL---------------");
			System.out.println("Total            :"+bobj[i].getTotal());
			System.out.println("CGST             :"+bobj[i].getCgst());
			System.out.println("SGST             :"+bobj[i].getSgst());
			System.out.println("Final            :"+bobj[i].getFinalprice());
		}
		
	}
	
	
	
	
}
