package packtwo;

import  packone.One;

class CB extends One{
	void fun(){
		showPro();
	}
}

public class MyApp {

	public static void main(String[] args) {
		CB cref=new CB();
		cref.fun();
		cref.showPub();
		//cref.showPvt(); This is error
		// same  goes for default 

	}

}