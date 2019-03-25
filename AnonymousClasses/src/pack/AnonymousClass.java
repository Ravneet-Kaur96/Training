package pack;

interface Inf{
 void show();
 void hello();
		
	
}
// Anonymous class in java
// they don't have constructors 
// They can have only single object
// Object of class is created automatically
// We can have block
public class AnonymousClass {

	public static void main(String[] args) {
	
		Inf iref=new Inf(){
			{
				System.out.println("Hi!!.....Block here");
			}
			
			public void show(){
				System.out.println("This is show");
			}
			public void hello(){
				System.out.println("This is hello");
			}
			
		};

		
		iref.show();
		iref.hello();
	}

}