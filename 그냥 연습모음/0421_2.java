import java.util.Scanner;

public class Practices {
	String str;
	int year,inch;
	public Practices(String str, int year, int inch) {
		this.str = str;
		this.year = year;
		this.inch = inch;
	}
	public void show() {
		System.out.println(str+" 에서 만든 "+year+" 년형 "+inch+" TV");
	}
	
	public static void main(String[] args) {
		Practices TV = new Practices("LG",2017,32);
		TV.show();
		
	}
}