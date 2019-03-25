public class MultiDimensionalArray {

	public static void main(String[] args) {
		// 2-d Array
		int [] [] a1={
				         {20,45,30},//0
				         {12,24},  //1
				         {23,34,66},//2
				         {67,78,66,4,2}//3
		             };
		for(int i=0;i<a1.length;i++){
			System.out.println("a1 [i] is:"+a1[i]+"and a1[i] length is:"+a1[i].length);
		}
		//Read Operation on 2-d array
		System.out.println(""+a1[1][0]);
       //Update Operation on 2-d array
		a1[2][1]=14;
		for(int i=0;i<a1.length;i++){
			for(int j=0;j<a1[i].length;j++){
				
			
			System.out.print(" "+a1[i][j]);
		}
			System.out.println("");
	}
		// Arrays of Arrays of Arrays
		int [][][] a2= {
				       { 
				           {10,20,30},	
				           {34,12},
				           {12,56,89}
		               },
				{
				          { 60,80,130},	
	                         {94,62},
	                       {112,86,89}
				},
		               {
		            	   {34,78,89},
		               {56,89},
		               {54,77,90}
		               }          
				         };
		System.out.println("a2 is: "+a2+" and a2 length is: "+a2.length);
		System.out.println("a2[0][1] is: "+a2[0][1]+" and a2[0][1] length is: "+a2[0][1].length);
		System.out.println(a2[0][0][1]); 
		                 
		for(int p=0;p<a2.length;p++){
			for(int q=0;q<a2[p].length;q++){
				for(int k=0;k<a2[p][q].length;k++){
					System.out.print(" " +a2[p][q][k]);
				}
				System.out.println(" ");
			}
			//System.out.println("");
		}
		System.out.println("");
   // Using For Enhanced loop for three dimensional array
		for(int [][] sno:a2){
			for(int [] temp:sno){
				for(int num:temp){
					System.out.print(" "+num);
				}
				System.out.println("");
			}
		}
  

}
}