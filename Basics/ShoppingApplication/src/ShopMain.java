
public class ShopMain {

	public static void main(String[] args) {
		
		ShopInfo sinfo=new ShopInfo();
		Address addr=sinfo.addr();
		Product prod=sinfo.prod();
		Customer cust=sinfo.cust(addr, prod);
		
		sinfo.display(cust);

	}

}
