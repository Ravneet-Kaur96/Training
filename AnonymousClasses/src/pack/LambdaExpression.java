package pack;
// Single Method Interface: Functional Interface

interface Shape{
	//void draw();
	//void sketch(int x);
	int Operation(int x,int y);
}
 


public class LambdaExpression {

	public static void main(String[] args) {
		
// Lambda Expression is just another syntax for functional interface
		/*Shape sref =() ->{
			System.out.println("Drawing is an Art");
		};
		
		sref.draw();*/

// Method with Inputs
		/*Shape srf=(int x) ->{
			System.out.println("Value of x is:"+x);
			
			
			
		};
		
		srf.sketch(2);*/
 // Method 	with Acknowledgement	
		Shape add =(int a, int b)-> {
			int sum=0;
			sum=a+b;
			return sum;
		};
		System.out.println("Sum is:"+add.Operation(10,20));	
	}

}