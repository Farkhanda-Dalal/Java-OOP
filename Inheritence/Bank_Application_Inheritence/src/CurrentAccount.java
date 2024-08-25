
public class CurrentAccount extends Account{
	
	String firm;

	public CurrentAccount(int accNO, double accBal, String accType, String firm) {
		super(accNO, accBal, accType);
		this.firm = firm;
	}

	public String getFirm() {
		return firm;
	}

	public void setFirm(String firm) {
		this.firm = firm;
	}
	
	

}
