import java.util.Scanner;

public class Practices {
	String a;
	String b;
	public Practices(String title) {
		a = title;
		b = "���ڹ̻�";
		
	}
	public Practices(String title,String author) {
		a = title;
		b = author;
	}

	public static void main(String[] args) {
		Practices littlePrince = new Practices("�����", "�������丮");
		Practices loveStory = new Practices("������");
		
		System.out.println(littlePrince.a+" "+littlePrince.b);
		System.out.println(loveStory.a+" "+loveStory.b);
		
	}

}
