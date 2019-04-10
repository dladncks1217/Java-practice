import java.util.Scanner;

public class Practices {
	String a;
	String b;
	void show() {
		System.out.println(a+" "+b);
	}
	
	public Practices() {
		this("", "");
		System.out.println("생성자 호출됨");
	}
	public Practices(String title) {
		this(title,"작자미상");
	}
	public Practices(String title, String author) {
		this.a = title;
		this.b = author;
	}
	public static void main(String[] args) {
		Practices littlePrince = new Practices("어린왕자","생택쥐페리");
		Practices loveStory = new Practices("춘향전");
		Practices emptyBook = new Practices();
		
		loveStory.show();
		
	}

}
