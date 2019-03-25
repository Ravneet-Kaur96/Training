public class Operators {

	public static void main(String[] args) {
		//Arithmatic Operator
		int num1=10;
		int num2=20;
		System.out.println("Result of Addition operation:"+(num1+num2));
		++num2;
		System.out.println("New Result of Addition operation:"+(num1+num2));
        // Assignment Operator
		num2*=5;
		System.out.println("New Result after assignment operation  is:"+(num1+num2));
		//Bitwise Operation
		System.out.println("Result of Bitwise And operation:"+(num1&num2));
		System.out.println("Result of Bitwise Or operation:"+(num1|num2));
		System.out.println("Result of Bitwise Exclusive or /XOR operation:"+(num1^num2));
		//Conditional Operator
		System.out.println("Result of conditional operation:"+(num2>=num1));
		int num3=-15;
		System.out.println("New Result is:"+(num3<num1));
		System.out.println("value is :"+(num3>num2));
		//Logical operator
		System.out.println("Is num2 greatest:"+((num2>num1)&&(num2>num3)));
		// Logical or operator
		System.out.println("is num1 smallest:"+((num1<num3)||(num1<num2)));
	
       // Shift Operator
		// Shift Right Operator
	int x=8;
	int y=x>>3;
		System.out.println("Result after shift right operation:"+y);
	// Negative Even Number
	int z=-12;
	int p=z>>2;
	System.out.println("Value of p is :"+p);
	// Shift left operator
	int a=4;
	int b=a<<2;
	System.out.println("Result after Shift left operation :"+b);
	// Negative Odd Number
	int d=-13;
	int r=d<<2;
	System.out.println("value of r is:"+r);
	}
		
}	