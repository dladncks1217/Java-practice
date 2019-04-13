import java.util.Scanner;

public class Practices {
	
	static void hello(int []array) {
		for(int i = 0;i<array.length;i++) {
			array[i]++;
		}
	}
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		hello(a);
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
