import java.util.Scanner;

public class Practices {
	int radius;
	public Practices(int radius){
		this.radius = radius;
	}
	static void increase(Practices m) {
		m.radius++;
	}
	
	public static void main(String[] args) {
		Practices a = new Practices(10);
		
		increase(a);
		System.out.println("radius는 "+a.radius+" 입니다.");
	}
}
