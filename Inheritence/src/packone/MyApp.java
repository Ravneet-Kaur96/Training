package packone;

public class MyApp {

	public static void main(String[] args) {

		One ore=new One();
		Two tre=new Two();
		System.out.println("**********");
		ore.showDft();
		ore.showPro();
		ore.showPub();
		System.out.println("***********");
		//ore.showPvt(); *Private is not accessible outside the class or object*
		tre.showDft();
		tre.showPro();
		tre.showPub();

	}

}