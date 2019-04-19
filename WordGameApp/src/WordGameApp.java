import java.util.Scanner;

class Player{
	String word;
	String name;
	public Player(String name) {
		this.name = name;
	}
	public void getWordFromUser(String word) {
		this.word = word;
	}
	public void checkSuccess() {
		int lastwordl = this.word.length()-1;
		char lastchar = this.word.charAt(lastwordl);//2번문자
		char firstchar = this.word.charAt(0);//1번문자
		if(firstchar != lastchar) {
			System.out.println(name+" 이 졌습니다.");
			return;
		}
	}
}

public class WordGameApp {
	static String First_word;
	public WordGameApp() {
		First_word = "아버지";
	}
	public void run() {
		System.out.println("단어를 입력하세요.");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int persons = scan.nextInt();
		Player[]person = new Player[persons];
		int playernum = 1;
		
		for(int i = 1;i<=person.length;i++) {
			System.out.println(i+" 사용자 이름을 입력하시오.");
			String name = scan.nextLine();
			person[i] = new Player(name);
		}
		
		System.out.println("시작하는 단어는 "+ First_word + " 입니다.");
		
		while(true) {
			if(playernum>persons) {
				playernum = 1;
			}
			
			
		}
		
		
	}
	
}