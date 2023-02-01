package mapviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class Program {
	public static void main(String[] args) {
		Student s1 = new Student("Aniket",22,9876543210L,"Blr","Male",98.5f,7);
		Student s2 = new Student("Chowdary",24,8876543210L,"Mysore","Male",88.5f,6);
		Student s3 = new Student("Sukesh",20,7876543210L,"Mlr","Male",48.5f,5);
		HashMap hm = new HashMap();
		hm.put(11,s1);
		hm.put(13,s2);
		hm.put(12, s3);
		System.out.println(hm);
		//Key is executed using the keySet method
		Set k1 = hm.keySet();
		Iterator itr = k1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("----------");
		//only values are displayed using values()
		Collection c = hm.values();
		Iterator itr1 = c.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("------------");
		//entrySet() - both the key and values got executed
		Set k2 = hm.entrySet();
		Iterator itr2 = k2.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
}
}