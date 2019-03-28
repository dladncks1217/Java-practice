import java.util.Scanner;
public class Homework2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95,88,76,62,55};
		while(true) {
			System.out.print("과목이름>>");
			String str = scanner.nextLine();
			int i = 0;
			for(;i<course.length;i++) {
				if(str.equals(course[i])) {
					System.out.println(course[i]+"의 점수는"+score[i]);
					break;
				}
			
			}
			if(str.equals("그만")) {
				return;
			}
			if(i==5) {
				System.out.println("없는 과목입니다.");
			}
			
		}
		
	}

}
