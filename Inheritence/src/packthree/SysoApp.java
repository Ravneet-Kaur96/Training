package packthree;
class  sSystem{
	static PPrintStream out=new PPrintStream();
}
class PPrintStream{
	void pprintln(String message){
		System.out.println(message);
	}
}
public class SysoApp {

	public static void main(String[] args) {
		sSystem.out.pprintln("Hello");

	}

}