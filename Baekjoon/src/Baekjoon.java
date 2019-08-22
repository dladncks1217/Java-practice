import java.util.Arrays;
import java.util.Scanner;
public class Baekjoon {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char [][]board = new char[8][8];
		for(int i = 0;i<8;i++) {
			for(int j = 0;j<8;j++) {
				board[i][j] = scan.next().charAt(0);
			}
		}
		System.out.println(board[7][7]);
	}
}