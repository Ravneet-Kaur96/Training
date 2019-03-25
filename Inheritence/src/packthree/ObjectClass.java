package packthree;
// Object is BuiltIn class in java and parent to all other classes
class AB{
	void fun(){

	}

	public String  toString(){
		String str="Be Exceptional";
		return str;
	}
}

public class ObjectClass {

	public static void main(String[] args) {
		AB cRef = new AB();
		System.out.println("cRef class is: "+cRef.getClass());
		System.out.println("cRef class is: "+cRef.getClass().getName());
		System.out.println("cRef class is: "+cRef.getClass().getSimpleName());

		System.out.println("cRef HashCode is: "+cRef.hashCode());
		System.out.println("cRef.toString() is: "+cRef.toString());
		System.out.println("cRef is: "+cRef);

	}

}