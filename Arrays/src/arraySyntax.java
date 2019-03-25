
public class arraySyntax {

	public static void main(String[] args) {
		int [] a1={10,20,30,40};
		// a1 is reference variable
		//Read Operation
		for(int elm:a1){
			System.out.println(""+a1);
		}
		System.out.println("");
		//Write or Update Operation on Array
		a1[1]=12;
		for(int elme:a1){
			System.out.println(""+elme);
		}
        System.out.println("");
        //while Specifying size of array....We can't Enter it's elements 
        int a2[]=new int[5];
        for(int elment:a2){
        	System.out.print(""+elment);
        }
        System.out.println("");
        //Update operation 
        a2[2]=10;
        for(int elment1:a2){
        	System.out.println(""+elment1);
        }
        System.out.println("");
        //Syntax
        int[] a3,a4;
        a3=new int[4];
        a4=new int[5];
        for(int el2:a4){
        	System.out.println(""+el2);
        }
        // Error in Syntax:a6 will not be an array
        int a5 [],a6;
        a5=new int[4];
        // 
        
	}
}