
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		// works using indexing
		ArrayList<String> list = new ArrayList<String>();
		list.add("Amarjeet"); //0
		list.add("Sandip");//1
		list.add("Manpreet");//2
		list.add("Gurpreet");//3
		list.add("Ravneet");//4

		System.out.println("List is: "+list);

		// works using Hashing technique -> Unordered
		//HashSet<String> set = new HashSet<String>();
		TreeSet<String> set = new TreeSet<String>();

		set.add("Amarjeet");
		set.add("Sandip");
		set.add("Manpreet");
		set.add("Gurpreet");
		set.add("Ravneet");

		System.out.println("set is: "+set);
		System.out.println("set size is: "+set.size());
		if(set.contains("Sandip")){
			System.out.println("Alice is in the set");
		}

		set.remove("Ravneet");
		System.out.println("set now is: "+set);

		HashSet<String> names = new HashSet<String>();
		names.add("Baljeet");
		names.add("Maneet");
		names.add("Samarjeet");

		set.addAll(names);
		System.out.println("set now is: "+set);

		System.out.println("==Iterator==");

		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String name = itr.next();
			System.out.println(name);
		}

		
	}

}