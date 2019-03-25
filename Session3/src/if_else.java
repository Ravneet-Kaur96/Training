public class if_else {

	public static void main(String[] args) {
		// if else condition
		int num1=20;
		double num2=2045;
		int num3=203;
		if(num1>num2){
			System.out.println("num1 is greater than num2");
		}
		else{
			System.out.println("num2 is greater");
		}
		// Using Logical And
		if((num1==num2)&&(num2==num3)&&(num3==num1)){
			System.out.println("Numbers are equal");
	
		}
		
		
		else if((num1>num2)&&(num1>num3)){
			System.out.println("num1 is greatest");
		}
		else if((num2>num3)&&(num2>num1)){
			System.out.println("num2 is greatest");
		}
		else if((num3>num1)&&(num3>num2)){
			System.out.println("num3 is greatest");
		}
		else{
			System.out.println("Numbers are not distinct");
		}
		
		/*else if(num1 > num2){
			if(num1 > num3){
				System.out.println("num1 is greatest");
			}else{
				System.out.println("num3 is greatest");
			}
		}
		else if(num2 > num3){
				System.out.println("num2 is greatest");
			}
		
		else {
			System.out.println("num3 is greatest");
		}*/
		
		// elseif Ladder
		int day=-9;
		if(day==0){
			System.out.println("Monday");
		}
			else if(day==1){
				System.out.println("Tuesday");
			}else if(day==2){
				System.out.println("Wednesday");
			}else if(day==3){
				System.out.println("Thursday");
			}else if(day==4){
				System.out.println("Friday");
			}else if(day==5){
				System.out.println("Saturday");
			}
			else{
				System.out.println("Wrong input");
			}
		// Switch case
		int days=2;
		switch(days){
		case 0:System.out.println("Monday");
		       break;
		case 1:System.out.println("Tuesday");
		       break;
		case 2:System.out.println("Wednesday");
		        break;
		case 3:System.out.println("Thursday");
		       break;
		case 4:System.out.println("Friday");
		       break;
		case 5:System.out.println("Saturday");
		       break;
		 default:
			 System.out.println("Please Enter a valid input");
		}
		}
		}