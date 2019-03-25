class cab{
	String name;
	String type;
	String registeration_number;
	String Driver_name;
	char Driver_gender;
	
}

public class OOPS {

	public static void main(String[] args) {
		// creating a object
		cab uref=new cab();
		cab uref2=new cab();
		System.out.println(""+uref);
		System.out.println(""+uref2);
		// Reference copy
		cab uref1=uref;
		// Write data in object
		uref.name="Swift";
		uref.type="micro";
		uref.registeration_number="PB 10 TF 2568";
		uref.Driver_name="Rahul Mehra";
		uref.Driver_gender='M';
		uref2.name="i10";
		uref2.type="micro";
		uref2.registeration_number="PB 10 KL 0007";
		uref2.Driver_name="Steve";
		uref2.Driver_gender='M';
		// Update data in object
		uref1.type="Mini";
		// Read data from Object
		System.out.println("Name of cab is:"+uref.name);
		System.out.println("Type of cab is:"+uref.type);
		System.out.println("Registeration Number of cab is:"+uref.registeration_number);
		System.out.println("Driver of cab is:"+uref.Driver_name);
		System.out.println("Gender:"+uref.Driver_gender);
        System.out.println("");
        System.out.println("Name of cab is:"+uref2.name);
		System.out.println("Type of cab is:"+uref2.type);
		System.out.println("Registeration Number of cab is:"+uref2.registeration_number);
		System.out.println("Driver of cab is:"+uref2.Driver_name);
		System.out.println("Gender:"+uref2.Driver_gender);

	}

}