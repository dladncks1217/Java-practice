import java.util.Scanner;

public class Practices {
		public Practices() {};
		public int getSum(int i, int j) {
			return i+j;
		}
		public int getSum(int i,int j,int k) {
			return i+j+k;
		}
	
	public static void main(String[] args) {
		Practices a = new Practices();
		System.out.println(a.getSum(1,2));
		System.out.println(a.getSum(1,2,3));
	}
}