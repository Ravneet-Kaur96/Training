public class StringBuiltIn {

	public static void main(String[] args) {
		String s1="Welcome to the world";
		System.out.println(""+s1);
		// convert string to uppercase
		String s2=s1.toUpperCase();
		System.out.println(""+s2);
		String friends="Jim,Jennie,Jack,Joe";
		// substring method(part of string from bigger string)
		String s3=friends.substring(1);
		System.out.println(""+s3);
		String s4=friends.substring(2,8);
		System.out.println(""+s4);
		//length method
		int len=friends.length();
		System.out.println("Length of String is:"+len);
		// creating array of strings
		char [] chr=friends.toCharArray();
		for(char chrr:chr){
			System.out.print(" "+chrr);
		}
		System.out.println("");
      // contains method
		String p1="friends5@example.com";
		if(p1.contains("@")&& p1.contains(".")){
			System.out.println("This is valid email");
		}else{
			System.out.println("plz enter a valid email");
		}
		System.out.println("");
		// split method
		String [] a1=friends.split("n");
		for(String inm:a1){
			System.out.println(""+inm);
		}
     System.out.println("");
     // index of 
     int i=friends.indexOf("Jack");
     System.out.println(""+i);
     System.out.println("");
     // last index of
     int j=friends.lastIndexOf("Jack");
     System.out.println(""+j);
	}

}