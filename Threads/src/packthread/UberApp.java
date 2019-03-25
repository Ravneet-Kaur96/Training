
package packthread;


class Cab{
	void EnjoyRide(String Cab_Name,String reg_no,String Cab_Type,String Driver_Name){
		System.out.println("*******Cab Booked********");
		System.out.println("Name of cab:"+Cab_Name);
		System.out.println("Registeration Number:"+reg_no);
		System.out.println("Type of cab:"+Cab_Type);
		System.out.println("Driver of cab:"+Driver_Name);
		System.out.println("******Enjoy Ride*********");
	}
}

class Customer1 extends Thread{
	Cab cRef;
	Customer1(Cab c){
		cRef=c;
	}
	public void run(){
		synchronized(cRef){
		cRef.EnjoyRide("Swift","PB 10 FG 4561","Micro","George");
		}
	}

}
class Customer2 extends Thread{
	Cab cRef;
	Customer2(Cab c){
		cRef=c;
	}
	public void run(){
		synchronized(cRef){
		cRef.EnjoyRide("Honda City","PB 10 HJ 2145","Mini","Steve");
		}
	}

}




public class UberApp {

	public static void main(String[] args) {
		Cab cRef=new Cab();
		Customer1 cRef1=new Customer1(cRef);
		//cRef1.start();

		Customer2 cRef2=new Customer2(cRef);
		cRef1.start();
		/*try {
			cRef1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}*/
		cRef2.start();
		/*try {
			cRef2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}*/
	}

}