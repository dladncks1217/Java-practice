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
		circle1 = circle2; // 객체 치환을 함으로써, 원래 circle1이 가리키던 객체는 아무도 가리키지 않게 되고, 접근할 수 없는 상태 "가비지(garbage)"상태가 되었다.
		System.out.println("circle1.r="+circle1.r);
		System.out.println("circle2.r="+circle2.r);
		System.out.println("s.r="+s.r);
		
	}

}
