class Person{
	String name;
	Person(String name){
		this.name = name;
	}
}
class Student extends Person{
	String check;
	Student(String name){
		super(name);
	}
}
public class Practices {
	public static void main(String[] args) {
		Person per = new Student("È«±æµ¿");
		
		Student stu = (Student)per;
		stu.name = "±è°¡³ª";
		stu.check = "È®ÀÎ¿ë";
		}
}
