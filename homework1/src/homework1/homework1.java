package homework1;
import java.util.Scanner;
public class homework1 {
	
	public static void main(String[] args) {
		int[] won = new int [9];
        int[] unit ={50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        Scanner scanner = new Scanner(System.in);
        System.out.println("금액을 입력하세요.");
        won[8] = scanner.nextInt();
        
        for(int i = 0; i < 9; i++)
        {
            if(i == 8)
            {
                System.out.println(unit[i]+"원 짜리 : "+won[i]+"개"); 
            }
            else
            {		
                won [i] = won [8] / unit[i];
                won [8] = won [8] % unit[i];
                if(won[i]==0||won[8]==0) {
                	continue;
                }
                System.out.println(unit[i]+"원 짜리 : "+won[i]+"개");
               
            }
        }

	}
}

