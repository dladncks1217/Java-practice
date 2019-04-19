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
		char lastchar = this.word.charAt(lastwordl);//2������
		char firstchar = this.word.charAt(0);//1������
		if(firstchar != lastchar) {
			System.out.println(name+" �� �����ϴ�.");
			return;
		}
	}
}

public class WordGameApp {
	static String First_word;
	public WordGameApp() {
		First_word = "�ƹ���";
	}
	public void run() {
		System.out.println("�ܾ �Է��ϼ���.");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int persons = scan.nextInt();
		Player[]person = new Player[persons];
		int playernum = 1;
		
		for(int i = 1;i<=person.length;i++) {
			System.out.println(i+" ����� �̸��� �Է��Ͻÿ�.");
			String name = scan.nextLine();
			person[i] = new Player(name);
		}
		
		System.out.println("�����ϴ� �ܾ�� "+ First_word + " �Դϴ�.");
		
		while(true) {
			if(playernum>persons) {
				playernum = 1;
			}
			
			
		}
		
		
	}
	
}