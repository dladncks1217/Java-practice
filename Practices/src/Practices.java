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
		Person per = new Student("ȫ�浿");
		
		Student stu = (Student)per;
		stu.name = "�谡��";
		stu.check = "Ȯ�ο�";
		}
}
