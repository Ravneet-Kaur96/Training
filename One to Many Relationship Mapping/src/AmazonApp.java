public class AmazonApp {

	public static void main(String[] args) {
		
		product[] pro=new product[3];
		
		for(int i=0;i<pro.length;i++){
			pro[i]=new product();
		}
		pro[0].setDataForProduct("Carpet",120,2500,1);
		pro[1].setDataForProduct("Cup",121,500,2);
		pro[2].setDataForProduct("Top",122,3500,1);
		
		
		
		customer c1=new customer();
		c1.setDataForCustomer("Jack","99999 88888",pro);
		//c2.showDataForCart();
       c1.showDataForCustomer();
       System.out.println("");
       System.out.println(c1.name+" spent "+c1.kitneKharchKiye());
	}

}