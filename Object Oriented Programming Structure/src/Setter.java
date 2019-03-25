class c{
	String name;
	private String type;
	
	void setType(String t){
		type=t;
	}
	String getType(){
		return type;
	}
	
}
public class Setter {

	public static void main(String[] args) {
		c obj=new c();
		obj.setType("Hello");
		System.out.println(""+obj.getType());

	}

}