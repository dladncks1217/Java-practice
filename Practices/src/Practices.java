import java.util.Scanner;

public class Practices {
	String a;
	String b;
	void show() {
		System.out.println(a+" "+b);
	}
	
	public Practices() {
		this("", "");
		System.out.println("������ ȣ���");
	}
	public Practices(String title) {
		this(title,"���ڹ̻�");
	}
	public Practices(String title, String author) {
		this.a = title;
		this.b = author;
	}
	public static void main(String[] args) {
		Practices littlePrince = new Practices("�����","�������丮");
		Practices loveStory = new Practices("������");
		Practices emptyBook = new Practices();
		
		loveStory.show();
		
	}

}
