import java.util.Scanner;
public class Practices {
	public static void main(String[] args) {
		String [][]a = new String [1000][1000];
		String []b = new String[10000000];
		int count = 0;
		int num1 = 1, num2 = 1;
		int answer;
		
		for(int i = 0;i<1000;i++) {
			num2 = 1;
			for(int j = 0;j<1000;j++) {
				a[i][j] = num1+"/"+num2;
				num2++;
			}
			num1++;
		}
		
		for(int x = 0;x<1000;x++) {
			for(int y = 0; y<1000;y++ ) {
				b[count] = a[x][y];
				count++;
			}
		}
		Scanner scan = new Scanner(System.in);
		answer = scan.nextInt();
		System.out.println(b[answer+1]);
	
		
	}
}
