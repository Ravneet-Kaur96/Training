package packrtp;

/*abstract class Cabs{
	
	abstract void bookCab(String source, String destination);
}*/
interface Cab{
	
	void bookCab(String Source, String Destination);
}

class MiniCab implements Cab{ 
	MiniCab(){
		System.out.println("MiniCab object constructed");
	}
	public void bookCab(String Source,String Destination){
		System.out.println("Cab Booked from: "+Source+" to "+Destination+" Arriving Soon!!");
	}
}
class MicroCab implements Cab{ 
	MicroCab(){
		System.out.println("MicroCab object constructed");
	}
	public void bookCab(String Source,String Destination){
		System.out.println("Cab Booked from: "+Source+" to "+Destination+" Arriving Soon!!");
	}
}



public class RTP {

	public static void main(String[] args) {
		
        Cab cref;
        cref=new MiniCab();// Polymorphic Statement
        cref.bookCab("MBD","Waves");
        System.out.println("*********************************************");
       // System.out.println("");
        cref=new MicroCab();
        cref.bookCab("Silver Arc","Model Town");
	}

}