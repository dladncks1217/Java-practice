import java.util.Scanner;
class Person{
	String name;
	String id;
	public Person(String name) {
		this.name = name;
	}
}
class Student extends Person{
	String grade;
	String departnemt;
	public Student (String name) {
		super(name);
	}
}
public class Practices {
	public static void main(String[] args) {
		Person p = new Student("¿Ã¿ÁπÆ");
		Student s = (Student)p;
		System.out.println(s.name);
		s,grade = "A";
		
		
		
		
	}
}
