import java.util.Scanner;

public class Practices {
	String a;
	String b;
	public Practices(String title) {
		a = title;
		b = "작자미상";
		
	}
	public Practices(String title,String author) {
		a = title;
		b = author;
	}

	public static void main(String[] args) {
		Practices littlePrince = new Practices("어린왕자", "생택쥐페리");
		Practices loveStory = new Practices("춘향전");
		
		System.out.println(littlePrince.a+" "+littlePrince.b);
		System.out.println(loveStory.a+" "+loveStory.b);
		
	}

}
