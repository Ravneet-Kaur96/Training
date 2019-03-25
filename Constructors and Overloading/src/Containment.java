// Outer class
class Outer{
	void show(){
		System.out.println("This is Outer");
	}
	// Inner class-> Nested Class ie. Box within Box ie. Object within the Object
	class Inner{
		void show(){
			System.out.println("This is Inner");
		}
	}
}
public class Containment {

	public static void main(String[] args) {
		Outer oref=new Outer();
		oref.show();
		Outer.Inner iref=oref.new Inner();
		iref.show();

	}

}