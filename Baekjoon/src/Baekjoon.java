import java.util.Scanner;
public class Baekjoon {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		char[]arrayc = new char[num*2+1];
		int []array = new int[num*2+1];
		
		for(int i = 0;i<num;i+=2) {
			array[i] = scan.nextInt();
			arrayc[i] = scan.next().charAt(0);
			array[i+1] = scan.nextInt();
		}
		for(int i = 0;i<num;i+=2) {
			System.out.println(array[i]+array[i+1]);
		}
	}
}