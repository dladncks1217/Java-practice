import java.util.Scanner;
public class Practices {
	int radius;
	String name;
	public Practices() {
		radius = 1;
		name = "����";
	}
	public Practices(int a,String b) {
		radius = a;
		name = b;
	}
	public double getArea() {
		return radius*radius*3.14;
	}

	public static void main(String[] args) {
		Practices circle = new Practices(10,"�ӿ�����ü");
		System.out.println("�ϴ� ���ڰ� ���� �������� "+circle.radius+" �̸��� "+circle.name+" ���̴� "+circle.getArea());
		Practices circle2 = new Practices();
		System.out.println("���ڰ� �ȵ��� �������� "+circle2.radius+" �̸��� "+circle2.name+" ���̴� "+circle2.getArea());
		
	}

}
