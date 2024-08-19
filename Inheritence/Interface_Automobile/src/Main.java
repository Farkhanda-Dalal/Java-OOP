import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);

		Automobile a=null;
		Bike b=null;

		String str=null;
		int ch=0;
		
		do {
			System.out.println("1-Car\n2-Bike");
			System.out.println("Choose Vehicle:");
			ch=sc.nextInt();

			switch(ch)
			{
			case 1:
				
					System.out.println("1-Maruti\n2-Toyota\n3-BMW");
					System.out.println("Choose Car:");
					ch=sc.nextInt();

					switch(ch)
					{
					case 1:
						a=new Maruti();
						display(a);
						//display( "Maruti", a);
						break;

					case 2:
						a=new Toyota();
						//display( "Toyota", a);
						break;

					case 3:
						a=new Bmw();
						display(a);
						//display( "BMW", a);
						break;

					}
					
				break;
			case 2:
				System.out.println("1-HeroHonda\n2-RoyalEnfield\n3-TVS");
				System.out.println("Choose Bike:");
				ch=sc.nextInt();

				switch(ch)
				{
				case 1:
					a=new HeroHonda();
					display(a);
					//display( "HeroHonda", b);
					break;
				case 2:
					b=new RoyalEnfield();
					display(b);
					//display( "RoyalEnfield", b);
					break;
				case 3:
					b=new Tvs();
					display(b);
					//display( "TVS", b);
					break;
				}
				break;
			}
			System.out.println("Type yes to continue:");
			str=sc.next();
		}
		while(str.equalsIgnoreCase("yes"));

		System.out.println("-----------------------------THANK YOU--------------------------------");
	}

	public static void display(Automobile a)
	{
		System.out.println(a);
	}

	//	public static void display(String str,Automobile a)
	//	{
	//		System.out.println(str+" Model   :"+a.getModel());
	//		System.out.println(str+" Colour  :"+a.getColour());
	//		System.out.println(str+" Price   :"+a.getPrice());
	//		
	//		if(a instanceof Bike)
	//		{
	//			Bike b=(Bike)a;
	//			System.out.println(str+" CC      :"+b.getCC());
	//		}
	//  }


}
