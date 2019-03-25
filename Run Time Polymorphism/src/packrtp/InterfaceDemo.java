package packrtp;
class CA{
	void fun(){
		System.out.println("Training is fun");
	}
}
interface iref{
	int a=2; // public static final
	void show(); // public void abstract
	void hello(); // public void abstract
}
interface iref1{
	int b=4; // public static final
	void show();  // public void abstract
	void world();  // public void abstract
}
interface iref2 extends iref,iref1{ // Multiple Inheritance
	
}
 class CB extends CA implements iref2{
	 public void show(){
			System.out.println("This is show");
		}

		public void hello(){
			System.out.println("This is hello");
		}

		public void world(){
			System.out.println("This is world");
		}
 }

public class InterfaceDemo {

	public static void main(String[] args) {
		// Reference of Parent points to Object of child
		CA app= new CB();
		//app.show();
		//app.hello();
		app.fun();
		/*iref2 i=new CB();
		i.show();*/
		// Reference of Interface points to Object of child which implements it
		iref1 irf=new CB();
		irf.show();
		
		
     
	}

}
