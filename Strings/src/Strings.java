
public class Strings {

	public static void main(String[] args) {
		// Interned Strings
		String s1="tavleen";
		String s2="tavleen";
		System.out.println(""+s1);
		System.out.println(""+s2);
		// Object Way
		String s3=new String("tavleen");
		String s4=new String("tavleen");
		System.out.println(""+s3);
		System.out.println(""+s4);
		System.out.println("");
		// Reference Comparison with == operator
		if(s1==s2){
			System.out.println("s1 is equal to s2");
		}else{
			System.out.println("s1 is not equal to s2");
		}
		if(s3==s4){
			System.out.println("s3 is equal to s4");
		}else{
			System.out.println("s3 is not equal to s4");
		}
		if(s1==s4){
			System.out.println("s1 is equal to s4");
		}else{
			System.out.println("s1 is not equal to s4");
		}
		System.out.println("");
		// Content Comparison with .equals method
		if(s1.equals(s2)){
			System.out.println("s1 is equal to s2");
		}else{
			System.out.println("s1 is not equal to s2");
		}
		if(s3.equals(s4)){
			System.out.println("s3 is equal to s4");
		}else{
			System.out.println("s3 is not equal to s4");
		}
		if(s1.equals(s4)){
			System.out.println("s1 is equal to s4");
		}else{
			System.out.println("s1 is not equal to s4");
		}
		System.out.println("");
 // Comparison using compareTo method
		if(s1.compareTo(s2)==0){
			System.out.println("s1 is equal to s2");
		}
	}

}