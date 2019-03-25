
public class cart {
String name_of_product;
float total_amount;
int no_of_products;
	
	void setDataForCart(String nm,float tm,int np){
		nm=name_of_product;
		tm=total_amount;
		np=no_of_products;
		
	}
	void showDataForCart(){
		System.out.println("Name is:"+name_of_product);
		System.out.println("Total Amount is:"+total_amount);
		System.out.println("Number of products is:"+no_of_products);
	}
	
}
