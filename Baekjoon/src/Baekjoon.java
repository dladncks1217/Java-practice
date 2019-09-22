import java.util.Scanner;
import java.util.Arrays;
public class Baekjoon {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int []arr = new int[a];
		int []arr2 = new int[a];
		for(int i = 0; i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		for(int i = 0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				continue;
			}else {
				arr2[i]=arr[i];
			}
		}
		for(int i = 0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}
}