import java.util.Scanner;
import java.util.StringTokenizer;

public class Practices {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c,max,min,cen;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		max = Math.max(a,b);
		max = Math.max(max, c);
		min = Math.min(a, b);
		min = Math.min(min, c);
		if(a<max&&a>min||max==a||min==a) {
			System.out.println(a);
		}
		else if(b<max&&b>min||max==b||min==b) {
			System.out.println(b);
		}
		else if(c<max&&c>min||max==c||min==c) {
			System.out.println(c);
		}
	
		
	}
}