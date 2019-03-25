
public class product {
String name;
int product_id;
int price;
int quantity;


void setDataForProduct(String name,int product_id,int price,int quantity){
	this.name=name;
	this.product_id=product_id;
	this.price=price;
	this.quantity=quantity;
	//c=price*quantity;
}

void setDataForProducts(String name,int product_id,int price,int quantity,int c){
	this.name=name;
	this.product_id=product_id;
	this.price=price;
	this.quantity=quantity;
	c=price*quantity;
}
void showDataForProduct(){
	System.out.println("============Product Details===================");
	System.out.println("Name of product\t :"+name);
	System.out.println("Product id of product\t :"+product_id);
	System.out.println("Price of product\t :"+price);
	System.out.println("Quantity of product\t :"+quantity);
	System.out.println("================================================");
}
}
