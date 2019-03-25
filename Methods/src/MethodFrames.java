public class MethodFrames {

	/*static void addNumbers(int x, int y){
		int z = x + y;
		System.out.println("add numbers Sum is: "+z);
	}
	
	// main method represents main thread
	public static void main(String[] args) {
		
		int a = 30;
		int b = 20;
		int c = a+b;
		System.out.println("Sum is: "+c);
		
		MethodFrames.addNumbers(60, 60);
				
		System.out.println("This is Last Statement");

	}*/

	
	static int addNumbers(int x, int y){
		int	sum=x+y;
		System.out.println("Sum of two numbers is:"+sum);
		return sum;
		}

		public static void main(String[] args) {
			MethodFrames.addNumbers(25,66);

		}
}