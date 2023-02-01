package hashmaplinkedhashmapandtreehashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

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
	System.out.println("-----------------");
	LinkedHashMap lhm = new LinkedHashMap();
	lhm.put(11,s1);
	lhm.put(13,s2);
	lhm.put(12,s3);
	System.out.println(lhm);
	System.out.println("----------");
	TreeMap tr = new TreeMap();
	tr.put(11,s1);
	tr.put(13,s2);
	tr.put(12,s3);
	System.out.println(tr);
	System.out.println("----------");
}
}
