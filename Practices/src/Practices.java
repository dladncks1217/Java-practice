import java.util.Scanner;

class calculate{
	
	public calculate() {
		
	}
}

public class Practices {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		String[] number = str.split(",");
		System.out.println(number[0]);
		
	}
}