import java.util.Scanner;

public class Practices {

	int r;
	public Practices(int r) {
		this.r = r;
	}
	public void set(int r) {
		this.r = r;
		
	}
	
	public static void main(String[] args) {
		Practices circle1 = new Practices(1);
		Practices circle2 = new Practices(2);
		Practices s;
		
		s = circle2;
		circle1 = circle2; // ��ü ġȯ�� �����ν�, ���� circle1�� ����Ű�� ��ü�� �ƹ��� ����Ű�� �ʰ� �ǰ�, ������ �� ���� ���� "������(garbage)"���°� �Ǿ���.
		System.out.println("circle1.r="+circle1.r);
		System.out.println("circle2.r="+circle2.r);
		System.out.println("s.r="+s.r);
		
	}

}
