import java.util.Scanner;
public class Book {
	String name;
	String author;
	public Book(String name,String author) {
		this.name = name;
		this.author = author;
	}
	public void results() {
		System.out.println("�� å�� �̸��� "+this.name+" �̰� ���ڴ� "+this.author+" �Դϴ� ");
		return;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Book[]book;
		book = new Book[2];
		String author;
		String name;
		for(int i = 0;i<book.length;i++) {
			System.out.println("å �̸� �Է� >>");
			name = scanner.nextLine();
			System.out.println("�����̸��Է�>>");
			author = scanner.nextLine();
			book[i] = new Book(name,author);
		}
		for(int i = 0; i<book.length;i++) {
			book[i].results();
		}

	}

}
