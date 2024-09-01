
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile mobj=new Mobile();
		
		Person p1thread=new Person(mobj, "Ganesh");
		Person p2thread=new Person(mobj, "Mahesh");
		
		p1thread.start();
		p2thread.start();

	}

}
