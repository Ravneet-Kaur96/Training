public class customer {

	 
	String name;
	String phone;
	
 
 product[] products;
 void setDataForCustomer(String name ,String phone, product[] products){
	 this.name=name;
	 this.phone=phone;
	 
	 this.products=products;
 }
 void showDataForCustomer(){
	 System.out.println("*******Customer***********");
	 System.out.println("Name of customer\t"+name);
	 System.out.println("Phone Number\t"+phone);
	 //System.out.println("Cart Details\t"+carts);
	 System.out.println("****************************");
	// System.out.println("Product Details\t"+products);
 

 for(product pro:products){
	 pro.showDataForProduct();
 }
 
// carts.showDataForCart();
 }

 int kitneKharchKiye(){
	int total=0;
	for(product pro:products){
	 total=total+(pro.price*pro.quantity);
	 
	 }
	 return total;
 
 }
 
 

}