import java.util.Scanner; //스캐너 정의
public class Homework0410 { 
		public Homework0410() {};  //생성자
		private static String[]kor = {"사랑","아기","돈","미래","희망"};  //한글사전
		private static String[]eng = {"love","baby","money","future","hope"};  //영어사전
		public static String kor2Eng(String word) { //kor2Eng메서드. 인자는 string형태로받음
			
			for(int i = 0;i<kor.length;i++) {  //포문으로 받은 인자값 한글사전배열 검색
				if(word.equals(kor[i])) {		//값이 나왔을경우
					return kor[i]+" 는 "+eng[i];  //리턴
				}
				if(i==4) {  //한글 끝까지 안나왔을경우 반복문탈출
					break;
				}
			}
			for(int j = 0;j<eng.length;j++) {  //포문으로 영어사전배열 검색
				if(word.equals(eng[j])) {  //값이 나왔을경우
					return eng[j]+" 는 "+kor[j];  //리턴
				}
				
				if(j==4) {  
					return word+"는 저의 사전에 없습니다.";  //한글 영어 다 끝까지 안나왔을경우 내보낼 문구
				}
			}
			return null; //스트링형 리턴
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  //스캐너 정의
		Homework0410 dic = new Homework0410();  //레퍼런스 변수 정의 후 객체생성

		while(true) {  //무한루프
			String word = scan.nextLine();  //계속 값을 받기위함
			if(word.equals("그만")) { //그만이라는 단어가 나왔을경우
				return;
			}
			System.out.println(dic.kor2Eng(word));  //출력
			
		}
	}

}
