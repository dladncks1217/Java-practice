import java.util.Scanner;
class Book {
	String title;
	String author;
	
}
public class Practices {


	public static void main(String[] args) {
		Book book = new Book();
		Scanner scan = new Scanner(System.in);
		System.out.print(">>");
		book.title = scan.nextLine();
		book.author = scan.nextLine();
		System.out.println("책 제목은 "+book.title+" 작가이름은 "+book.author);
		
	}

}
