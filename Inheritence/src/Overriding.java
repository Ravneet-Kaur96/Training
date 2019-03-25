class parent{
	void show(){
		System.out.println("Hi");
	}
		static void done(){
			System.out.println("Hello World");
		}
	}
class child extends parent{
	// Overriding
	void show(){
		System.out.println("Hi I am child");
	}
	//Hiding
		static void done(){
			System.out.println("Welcome to this beautiful World");
		}
	}
	


public class Overriding {

	public static void main(String[] args) {
		 
   child ch=new child();
   ch.show();
   ch.done();
	}

}