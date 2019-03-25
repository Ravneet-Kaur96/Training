
public class Example {

	public static void main(String[] args) {
		int studentCountSchool1=400;
		int studentCountSchool2=589;
		int studentCountSchool3=900;
		int studentCountSchool4=890;
		int studentCountSchool5=450;
		
		int [] studentCountSchool={400,589,900,890,450};
		System.out.println(""+studentCountSchool3);
		System.out.println(""+studentCountSchool);
		System.out.println("");
		int studentCount=0;
		for(int student:studentCountSchool){
			studentCount=studentCount+student;
		}
		System.out.println("Total Number of Students:"+studentCount);
	}
}