
public class Main {

	public static void main(String[] args) {
		
		Instrument i1=null;
		
		Instrument i[]=new Instrument[10];
		
		i[0]=new Piano();
		i[1]=new Flute();
		i[2]=new Guitar();
		i[3]=new Piano();
		i[4]=new Flute();
		i[5]=new Guitar();
		i[6]=new Piano();
		i[7]=new Flute();
		i[8]=new Guitar();
		i[9]=new Piano();

		display(i);
	}
	
	public static void display(Instrument i[])
	{
		for(Instrument i1:i)
		{
			if(i1 instanceof Piano)
			{
				i1.play();
			}
			
			if(i1 instanceof Flute)
			{
				i1.play();
			}
			
			if(i1 instanceof Guitar)
			{
				i1.play();
			}
		}
	}

}
