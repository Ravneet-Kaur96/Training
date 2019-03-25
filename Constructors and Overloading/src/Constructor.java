class Point{
	int a,b;
	void setPoint(int a,int b){
		this.a=a;
		this.b=b;
	}
	void showPoint(){
		System.out.println("Points are  "+a+":"+b);
	}
	// Default Constructor
	Point(){
		a=9;
		b=8;
	}
	// Parameterised Constructor
	Point(int a,int b){
		this.a=a;
		this.b=b;
	}
}
public class Constructor {

	public static void main(String[] args) {
		Point  obj=new Point();
		obj.setPoint(10,20);
       obj.showPoint();
       Point obj1=new Point();
       obj1.showPoint();
       Point obj2=new Point(12,78);
       obj2.showPoint();

	}

}