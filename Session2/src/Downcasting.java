public class Downcasting {

	public static void main(String[] args) {
		byte a=12;
		a=(byte)128;
		System.out.println("value of a is:"+a);
        int b=10;
        b=(byte)12223;
        System.out.println("value of b is:"+b);
        float pi=3.14159f;
        pi=(int)12366467;
        System.out.println("result is:"+pi);
	}

}