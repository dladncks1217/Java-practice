import java.util.Scanner;

public class Practices {
	static void prints(char[]pri) {
		for(int i=0;i<pri.length;i++) {
			System.out.print(pri[i]);
		}
		System.out.println("");
	}
	static void replace(char[]rep) {
		for(int i = 0;i<rep.length;i++) {
			if(rep[i]==' ') {
				rep[i]=',';
			}
		}
	}
	
	public static void main(String[] args) {
		
		char[]character = {'T','H','I','S',' ','i','s',' ','m','e'};
		prints(character);
		replace(character);
		prints(character);
		
	}
}
