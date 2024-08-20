
public class CalcAverage {

	public static double avgFirstN(int N)
	{
		int sum=0,i;
		double avg=0;

		try {
			if(N<0)
			{
			throw new IllegalArgumentException();	
			}
			for(i=1;i<N;i++)
			{
				sum=i+sum;
			}
			avg=sum/N;
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			throw e;
			
		}
		
		return avg;
	}

}
