package pack;

public class Exceptions {

	public static void main(String[] args) {
		System.out.println("Main Started");
	int a=12,b=0,c;
	//c=a/b;
	int [] arr={10,20,30,40};
	try{
		c=a/b;
		System.out.println("Value of c is:"+c);
	     System.out.println("arr[30] is:"+arr[30]);
	}
	catch(Exception eref){
		System.out.println(" Some Exception:"+eref);
	}
	finally{
		System.out.println("Hi!!....This is important");
	}
	}

}