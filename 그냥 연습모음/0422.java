import java.util.Scanner;

public class Practices {
	int a,b,c;
	public Practices(int a,int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void show() {
		System.out.println((a+b+c)/3);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int a,b,c;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		Practices average = new Practices(a,b,c);
		average.show();
	}
}