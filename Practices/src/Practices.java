import java.util.Scanner;

class Circulate{
	int a;
	int b;
	
	public Circulate(int a,int b) {
		this.a = a;
		this.b = b;
	}
	public void boo() {
		System.out.println((a+b)*(a-b));
		
		}
}


public class Practices {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a>=1000||b>=1000) {
			return;
		}
		Circulate c = new Circulate(a,b);
		c.boo();
	}
}