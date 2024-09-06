import java.util.Scanner;

public class SportsMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	    Football fobj=new Football("Football", 11, 90, "Outdoor", "Football", "Goals", "Red,Yellow", "Defender,Winger,Mid-fielder,Goalkeeper");
		Cricket cobj=new Cricket("Cricket", 11, "Outdoor", "Bat,Ball", "Runs", "Catch,Hit,LBW", "Spin,Yorker", "Straight,Helicopter");
		
		System.out.println("Choose sport about which you would like to know:");
		System.out.println("1-Football\n2-Cricket");
		int ch=sc.nextInt();
		System.out.println("Enter your choice:");

		switch(ch)
		{
		case 1:
			display(fobj);
			break;
			
		case 2:
			display(cobj);
			break;
			
		default:
			System.out.println("Please enter a valid choice.");
			break;
		}
	}
	
	public static void display(Sports s)
	{
		System.out.println("Name of Sport         :    "+s.getName());
		System.out.println("No of players per team:    "+s.getPlayerNo());
		System.out.println("Type of game          :    "+s.getType());
		System.out.println("Equipment used        :    "+s.getEquipment());
		System.out.println("Points are scored by  :    "+s.getPoints());
		
		if (s instanceof Football)
		{
			Football fobj=(Football)s;
			System.out.println("Time per game         :    "+fobj.getTime());
			System.out.println("Cards                 :    "+fobj.getCard());
			System.out.println("Playing Position      :    "+fobj.getPosition());
		}
		if (s instanceof Cricket)
		{
			Cricket cobj=(Cricket)s;
			System.out.println("Types of Wickets      :    "+cobj.getWicket());
			System.out.println("Balling styles        :    "+cobj.getBallingstyle());
			System.out.println("Types of Shots        :    "+cobj.getShots());
		}
	}

}
