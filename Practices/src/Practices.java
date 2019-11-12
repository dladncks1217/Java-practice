import java.util.Scanner;
public class Practices {
   String title, author;
   public Practices(String title, String author){
      this.title=title;
      this.author=author;
   }
   
   public static void main(String [] args) {
      Practices [] booklist = new Practices[2];
      Scanner scanner = new Scanner(System.in);
      for (int i=0;i<2;i++) {
         System.out.println("제목:");
         String title = scanner.nextLine();
         System.out.println(title);
         System.out.println("저자:");
         String author = scanner.nextLine();
         System.out.println(author);
         booklist[i] = new Practices(title,author);
      }
      for (int i=0;i<2;i++) {
         System.out.print("("+booklist[i].title+","+booklist[i].author+")");
      }
      scanner.close();
      
      
   }

}