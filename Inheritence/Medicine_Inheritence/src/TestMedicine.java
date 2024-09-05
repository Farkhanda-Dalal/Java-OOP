import java.util.Random;

public class TestMedicine {

	public static void main(String[] args) {
		
		Medicine m[]=new Medicine[10];
		
		Random obj=new Random();
		
		for(int i=0;i<m.length;i++)
		{
			int number=1+obj.nextInt(3);
			
			switch(number)
			{
			case 1:
				m[i]=new Tablet();
				m[i].displaylable();
				
				break;
			case 2:
				m[i]=new Syrup();
				m[i].displaylable();
				break;
			case 3:
				m[i]=new Ointment();
				m[i].displaylable();
				break;
			}
		}
		
	}

}
