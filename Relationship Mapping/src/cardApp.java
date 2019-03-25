
public class cardApp {

	public static void main(String[] args) {

customer c1=new customer();
card p1=new card();
System.out.println(""+c1);
System.out.println(""+p1);

c1.setDataForCustomer("Riya","riya23@gmail.com",'F',"9863628362");
p1.setDataForCard("card","credit card","2656254652",123);

c1.cref=p1;
c1.showDataForCustomer();
// cArr is card reference variable 
// It will point to Card reference variable array in heap with all reference variables of card null
card [] cArr=new card[5];
cArr[0]=new card();
cArr[1]=new card();
cArr[0].setDataForCard("card","Debit card","7271466536",122);
cArr[0].showDataForCard();
	}

}