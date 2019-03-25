package packthree;

public class WrapperClass {

	public static void main(String[] args) {
		int a=10;
		Integer aref=new Integer(a);// Boxing-> For dynamic memory management


		// UnBoxing
		int y=aref.intValue();

		// AutoBoxing
		int b=18;
		Integer bref=b;
		// AutoUnBoxing
		int c=bref;
	}

}