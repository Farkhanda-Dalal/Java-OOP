
public class Thread1 {

		public static void main(String[] args) {
			for(int i=1;i<=5;i++) {
				System.out.println("Hello main :"+i);
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}System.out.println("Thank you...");
		}

}
