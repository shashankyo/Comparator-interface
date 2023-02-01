package usingthecomparatorinterface;

import java.util.ArrayList;
import java.util.Collections;

public class Program {
public static void main(String[] args) {
	Student s1 = new Student("Aniket",19,24);
	Student s2 = new Student("Roshan", 17, 26);
	Student s3 = new Student("Rashmi",20,22);
	ArrayList <Student> al1 = new ArrayList <Student>();
	al1.add(s1);
	al1.add(s2);
	al1.add(s3);
	System.out.println(al1);
	HelpingSortingClass hsc = new HelpingSortingClass();
	Collections.sort(al1,hsc);
	System.out.println(al1);
}
}
