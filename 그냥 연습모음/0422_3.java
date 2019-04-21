import java.util.Scanner;

public class Practices {
	private double x,y;
	private int radius;
	
	public Practices(double x,double y,int radius) {
		this.x =x;
		this.y = y;
		this.radius = radius;
		
	}
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Practices[] Array = new Practices[3];
		
		double a,b;
		int r;
		
		for(int i = 0;i<Array.length;i++) {
		
		a = scan.nextDouble();
		b = scan.nextDouble();
		r = scan.nextInt();
		Array[i] = new Practices(a,b,r);
		
		}
		for(int j = 0;j<Array.length;j++) {
			Array[j].show();
		}
		
		
	}
}