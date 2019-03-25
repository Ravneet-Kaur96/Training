
public class customer {

	String name;
	String email;
	char gender;
	String phone_number;
	card cref;
	void setDataForCustomer(String nm,String em,char g,String phone_num){
		name=nm;
		email=em;
		gender=g;
		phone_number=phone_num;

	}
	// Overloading
	void setDataForCustomer(String nm,String em,char g,String phone_num,card c){
		name=nm;
		email=em;
		gender=g;
		phone_number=phone_num;
		cref=c;


	}
	void showDataForCustomer(){
		System.out.println("*********Customer Data***********");
		System.out.println("Name:\t "+name);
		System.out.println("email:\t "+email);
		System.out.println("gender:\t "+gender);
		System.out.println("phone_number:"+phone_number);
		//System.out.println("******************************");
		cref.showDataForCard();
	}
} 