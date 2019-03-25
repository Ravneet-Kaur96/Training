package pack;
// Final method cannot be inherited
final class CA{
	// Final method cannot be overridded
	final void show(){
		
	}
}
/*class CB extends CA{
	
}*/

public class FinalDemo {

	public static void main(String[] args) {
		
  final int x=100;
  //x=200; Update operation not allowed
  final int y; // Blank Final variable
  y=90;
	}

}