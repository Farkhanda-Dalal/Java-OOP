
public class Main {

	public static void main(String[] args) {
		
		/*value of a and b is given through command line argument.
		 * To give command line argument follow these steps:
		 * 1.Right click and go to Run As
		 * 2.Choose Run Configurations from Run As
		 * 3.Set path for file and pass value of a and b in argument section
		 * 4.Run program
		 */
		
		int a=Integer.parseInt(args[0]); 
		int b=Integer.parseInt(args[1]);
		/*parseInt or parseFloat is used to convert String into int or float.Array of String
		 * is passed in Main method's arguement.So when we use arg[] for passing command
		 * line arguement we have to convert that String array to int or float to pass numbers
		 */
		
		System.out.println("Addition      ="+(a+b));
		System.out.println("Subtraction   ="+(a-b));
		System.out.println("Multiplication="+(a*b));
		System.out.println("Division      ="+(a/b));
	}

}
