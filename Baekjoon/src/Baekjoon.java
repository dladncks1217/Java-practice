import java.util.Scanner;
import java.util.Arrays;

public class Baekjoon {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for(int i = 1;i<=a;i++) {
			String b = scan.next().trim(" ");
			System.out.println(i+"."+" "+b);
		}
	}
}
