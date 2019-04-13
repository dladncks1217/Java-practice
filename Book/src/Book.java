import java.util.Scanner;
public class Book {
	String name;
	String author;
	public Book(String name,String author) {
		this.name = name;
		this.author = author;
	}
	public void results() {
		System.out.println("이 책의 이름은 "+this.name+" 이고 저자는 "+this.author+" 입니다 ");
		return;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Book[]book;
		book = new Book[2];
		String author;
		String name;
		for(int i = 0;i<book.length;i++) {
			System.out.println("책 이름 입력 >>");
			name = scanner.nextLine();
			System.out.println("저자이름입력>>");
			author = scanner.nextLine();
			book[i] = new Book(name,author);
		}
		for(int i = 0; i<book.length;i++) {
			book[i].results();
		}

	}

}
