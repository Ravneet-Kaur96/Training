
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;


class Employee{
	int eid;
	String name;

	@Override
	public String toString() {
		return "["+eid+" | "+name+"]";
	}

}

public class ListDemo {

	public static void main(String[] args) {

		int[] arr = new int[10]; 			// Limited Size | Homogeneous (integer primitives)
		Integer [] iArr = new Integer[10];	// Limited Size | Homogeneous (integer Objects)

		Employee eRef1 = new Employee();
		eRef1.eid = 201;
		eRef1.name = "Myra";

		Employee eRef2 = new Employee();
		eRef2.eid = 501;
		eRef2.name = "Samar";

		// Hetrogeneous | (Can Store only/any Object)
		ArrayList list1 = new ArrayList(); 	// Size is not a limitation it can grow and shrink in size

		// Homogeneous | (Can Store only String Object)
		ArrayList<String> list2 = new ArrayList<String>();

		// Homogeneous | (Can Store only Employee Object)
		ArrayList<Employee> list3 = new ArrayList<Employee>();

		// 1. Add data in ArrayList
		//list1.add(0,10); 	//0			// -> list1.add(new Integer(10)); | Autoboxed
		list1.add(10);		//0
		list1.add(2.5);		//1
		list1.add("Rohit");	//2
		list1.add(eRef1);	//3
		list1.add("Neha");//4
		list1.add("Rohit"); 	//5		// Duplicacy is supported

		list2.add("Amarjeet");
		list2.add("Sandip");
		list2.add("Neha");
		list2.add("Rohit");
		list2.add("Richa");
		//list2.add(10); 		// err kyuki asi kehya hai only string as input
		//list2.add(eRef1); 	// err

		list3.add(eRef1);
		list3.add(eRef2);
		//list3.add("Sunny"); 	// err kyuki asi sirf employee as input lai rhe
		//list3.add(10); 		//err

		// 2. Print Ref Variables of Lists
		System.out.println("====list1====");
		System.out.println(list1);

		System.out.println();

		System.out.println("====list2====");
		System.out.println(list2);

		System.out.println();

		System.out.println("====list3====");
		System.out.println(list3);

		// 3. Read a single element from List
		Object oRef = list1.get(2);
		String str = list2.get(1);
		Employee eRef = list3.get(0);

		System.out.println("oRef is: "+oRef);
		System.out.println("str is: "+str);
		System.out.println("eRef is: "+eRef);

		// 4. Size of List
		System.out.println("Size of list1 is: "+list1.size());
		System.out.println("Size of list2 is: "+list2.size());
		System.out.println("Size of list3 is: "+list3.size());

		// 5. Read All Elements
		// 	  Iterating in List
		//	  5.1 For Loop
		System.out.println("****For****");
		for(int i=0;i<list1.size();i++){
			Object o = list1.get(i);
			System.out.println(o);
		}

		System.out.println();

		for(int i=0;i<list2.size();i++){
			String s = list2.get(i);
			System.out.println(s);
		}

		System.out.println();

		for(int i=0;i<list3.size();i++){
			Employee e = list3.get(i);
			System.out.println(e);
		}

		System.out.println("****Enhanced For****");


		//	 5.2 Enhanced For Loop
		for(Object o : list1){
			System.out.println(o);
		}

		System.out.println();

		for(String s : list2){
			System.out.println(s);
		}

		System.out.println();

		for(Employee e : list3){
			System.out.println(e);
		}

		//	5.3 Iterator (eh sirf forward chlda)
		System.out.println("****Iterator****");
		Iterator itr1 = list1.iterator();
		/*System.out.println(itr1.next());
		System.out.println(itr1.next());
		System.out.println(itr1.next());*/

		while(itr1.hasNext()){ //next one by one element dega, jad we'll ask for it by saying next
			Object o = itr1.next();
			System.out.println(o);
		}

		System.out.println();
		Iterator<String> itr2 = list2.iterator();

		while(itr2.hasNext()){
			String s = itr2.next();
			System.out.println(s);

			if(s.equals("John")){
				itr2.remove();
			}	
		}

		System.out.println(list2);

		// 5.4 ListIterator (both direction can move mtlb front to tail or vice versa)
		System.out.println("****ListIterator****");
		ListIterator listItr1 = list1.listIterator();
		while(listItr1.hasNext()){
			Object o = listItr1.next();
			System.out.println(o);
		}
		System.out.println("---");
		while(listItr1.hasPrevious()){
			Object o = listItr1.previous();
			System.out.println(o);
		}

		/* 5.5 Enumeration (1.will work on all datatypes
		2.can pass anythng
		3.can't remove data)
		*/
		System.out.println("****Enumeration****");
		Enumeration enm = Collections.enumeration(list1);
		while(enm.hasMoreElements()){
			Object o = enm.nextElement();
			System.out.println(o);
		}

		// 6. Remove Data from List
		// 6.1 Remove Single
		System.out.println("List1 Before: "+list1+" | "+list1.size());
		list1.remove(0);
		System.out.println("List1 After: "+list1+" | "+list1.size());
		list1.remove(3);
		System.out.println("List1 After: "+list1+" | "+list1.size());
		list1.clear(); // remove all !!
		System.out.println("List1 After: "+list1+" | "+list1.size());

		System.out.println(">>>>>>>>><<<<<<<<<");

		System.out.println(list2);
		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("Maneet");
		list4.add("Sweety");
		list4.add("Harpreet");
		list4.add("Sunpreet");
		System.out.println(list4);

		list2.addAll(list4);

		System.out.println("============");
		System.out.println(list2);
		System.out.println(list4);

		int idx = list2.indexOf("Neha");
		System.out.println("idx is: "+idx);
		idx = list2.lastIndexOf("Rohit");
		System.out.println("idx now is: "+idx);

		if(list2.contains("Sandip")){
			System.out.println("Jack is in the list");
		}

		//String[] strArr = list2.toArray();
		//....

		// THREAD-SAFE | SYNCHRONIZED
		Vector<String> vector = new Vector<String>();
		vector.add("Neha");
		vector.add("Manpreet");
		vector.add("Baljeet");
		vector.add("Gurpreet");

		System.out.println("Vector is: "+vector);
		System.out.println("Vector 0 is: "+vector.get(0));

	}

}