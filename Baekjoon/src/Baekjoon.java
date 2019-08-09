import java.util.Scanner;
public class Baekjoon {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int result = 0;
		if(a%b==0) {
			System.out.println("00");
			return;
		}
		else {
			result = a-(a%b);
		}
		
		result = result%1000;
		result = result%100;
		
		while(true) {
			result = result-b;
			if(result<10&&result>0) {
				System.out.println("0"+result);
				return;
			}
			else {
				System.out.println(result);
				return;
			}
		}
	}
	

}
