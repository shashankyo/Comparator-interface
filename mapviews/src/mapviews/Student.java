package mapviews;

public class Student {
	String name;
	int age;
	long phone;
	String address;
	String gender;
	float percentage;
	int sem;
public Student(String name, int age, long phone, String address, String gender, float percentage, int sem) {
	super();
	this.name = name;
	this.age = age;
	this.phone = phone;
	this.address = address;
	this.gender = gender;
	this.percentage = percentage;
	this.sem = sem;
}
@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", phone=" + phone + ", address=" + address + ", gender=" + gender
			+ ", percentage=" + percentage + ", sem=" + sem + "]";
}
}
