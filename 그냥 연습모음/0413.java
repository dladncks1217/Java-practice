import java.util.Scanner;

public class Practices {
	int radius;
	public Practices(int radius) {
		this.radius = radius;
	}
	double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Practices []circle;
		circle = new Practices[5];
		
		for(int i=0;i<=circle.length;i++) {
			circle[i] = new Practices(i);
			
		}
		for(int j = 0;j<=circle.length;j++) {
			System.out.println(circle[j].getArea());
		}
		
		
	}
}
