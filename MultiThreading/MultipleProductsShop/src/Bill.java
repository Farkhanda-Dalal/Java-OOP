
public class Bill {

	private double total;
	private double cgst;
	private double sgst;
	private double finalprice;
	
	public Bill(double total, double cgst, double sgst, double finalprice) {
		super();
		this.total = total;
		this.cgst = cgst;
		this.sgst = sgst;
		this.finalprice = finalprice;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getCgst() {
		return cgst;
	}

	public void setCgst(double cgst) {
		this.cgst = cgst;
	}

	public double getSgst() {
		return sgst;
	}

	public void setSgst(double sgst) {
		this.sgst = sgst;
	}

	public double getFinalprice() {
		return finalprice;
	}

	public void setFinalprice(double finalprice) {
		this.finalprice = finalprice;
	}
	
	
}
