
public class card {


	String name;
	String type;
	String card_Number;
	int cvv;
	
	void setDataForCard(String nm,String typ,String card_num,int cv){
		name=nm;
		type=typ;
		card_Number=card_num;
		cvv=cv;
		
	}
	void showDataForCard(){
		System.out.println("**********Card Data*********");
		System.out.println("Name:\t "+name);
		System.out.println("type:\t "+type);
		System.out.println("card_Number:"+card_Number);
		System.out.println("cvv:\t "+cvv);
		System.out.println("****************************");
		

}
}
