import java.util.Scanner;

public class EmployeeInfo {
	
	Scanner sc=new  Scanner (System.in);

	public Employee[] create()
	{
		
		System.out.println("How many employees do you want in array:");
		int n=sc.nextInt();
		Employee earr[]=new Employee[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter employee number:");
			int empNo=sc.nextInt();
			
			System.out.println("Enter employee name:");
			String empName=sc.next();
			
			System.out.println("Enter employee Designation:");
			String empDes=sc.next();
			
			System.out.println("Enter employee salary:");
			double empSal=sc.nextDouble();
			
			earr[i]=new Employee(empNo, empName, empDes, empSal);
			
		}
		return earr;
		
	}
	
	public void display(Employee earr[]) {
		for (int i=0;i<earr.length;i++)
		{
			System.out.println("Employee number        :     "+earr[i].getEmpNo());
			System.out.println("Employee name          :     "+earr[i].getEmpName());
			System.out.println("Employee Designation   :     "+earr[i].getEmpDes());
			System.out.println("Employee Salary        :     "+earr[i].getEmpSal());
			
		}
	}
	
	public void search(Employee earr[])
	{
		boolean b=false;
		System.out.println("Enter employee number you want to search:");
		int search=sc.nextInt();
		for (int i=0;i<earr.length;i++)
		{
			if(earr[i].getEmpNo()==search)//3
			{
				System.out.println("Account Found");
				System.out.println("Employee number        :     "+earr[i].getEmpNo());
				System.out.println("Employee name          :     "+earr[i].getEmpName());
				System.out.println("Employee Designation   :     "+earr[i].getEmpDes());
				System.out.println("Employee Salary        :     "+earr[i].getEmpSal());
				break;
			}
		}
		
		for (int i=0;i<earr.length;i++)
		{
			if(earr[i].getEmpNo()!=search)
			{
				do
				{
					System.out.println("Element not found");
				}
				while(earr[i].getEmpNo()==search);
				break;
			}
		}
		
		
		
		
	}
	
	
}
