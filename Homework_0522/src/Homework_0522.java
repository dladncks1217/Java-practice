import java.util.Scanner;
class ArrayList{
	Scanner scan = new Scanner(System.in);
	private double sum = 0;
	private double average;
	char []scores = new char[6];
	double []numscores = new double[6];
	public ArrayList(char score1,char score2,char score3,char score4,char score5, char score6) {
		this.scores[0] = score1;
		this.scores[1] = score2;
		this.scores[2] = score3;
		this.scores[3] = score4;
		this.scores[4] = score5;
		this.scores[5] = score6;
		
	}
	public void scorecheck() {
		for(int i = 0;i<6;i++) {
			switch(scores[i]) {
			case 'A':numscores[i] = 4.0;break;			
			case 'B':numscores[i] = 3.0;break;
			case 'C':numscores[i] = 2.0;break;
			case 'D':numscores[i] = 1.0;break;
			case 'F':numscores[i] = 0.0;break;
			}
		}
	}
	public double printAverage() {
		for(int i = 0;i<6;i++) {
			sum+=numscores[i];
		}
		average = sum/6;
		return average;
	}
}
public class Homework_0522 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char []scores = new char[6];
		System.out.println("6개의 학점을 빈 칸으로 분리입력(A/B/C/D/F)>>");
		for(int i = 0;i<6;i++) {
			scores[i] = scan.next().charAt(0);
		}
		ArrayList arr = new ArrayList(scores[0],scores[1],scores[2],scores[3],scores[4],scores[5]);	
		arr.scorecheck();
		System.out.println(arr.printAverage());
	}
}