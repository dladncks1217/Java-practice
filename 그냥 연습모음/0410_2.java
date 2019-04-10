import java.util.Scanner;
public class Practices {
	int radius;
	String name;
	public Practices() {
		radius = 1;
		name = "없음";
	}
	public Practices(int a,String b) {
		radius = a;
		name = b;
	}
	public double getArea() {
		return radius*radius*3.14;
	}

	public static void main(String[] args) {
		Practices circle = new Practices(10,"임우찬객체");
		System.out.println("일단 인자값 들어간거 반지름은 "+circle.radius+" 이름은 "+circle.name+" 넓이는 "+circle.getArea());
		Practices circle2 = new Practices();
		System.out.println("인자값 안들어간애 반지름은 "+circle2.radius+" 이름은 "+circle2.name+" 넓이는 "+circle2.getArea());
		
	}

}
