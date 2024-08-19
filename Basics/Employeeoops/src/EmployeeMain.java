import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
	
		EmployeeInfo einfo=new EmployeeInfo();
		Employee earr[]=einfo.create();
		einfo.display(earr);
		einfo.search(earr);

	}

}
