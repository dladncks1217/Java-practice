import java.io.*;

public class Homework_0605 {
	public static void main(String[] args) {
		BufferedInputStream str = null;
		BufferedOutputStream dst = null;
		File src = new File("a.jpg");
		File dest = new File("b.jpg");
		try {
			str = new BufferedInputStream(new FileInputStream(src)); // 버퍼 입력 스트림에 연결
			dst = new BufferedOutputStream(new FileOutputStream(dest)); // 버퍼 출력 스트림에 연결
			
			long tenPercent = src.length() / 10; // 파일의 10% 크기
			long progress = 0; // 파일 크기 10% 될 때까지 읽은 누적 바이트 수
			
			System.out.println("a.jpg를 b.jpg로 복사합니다. \n10%마다 *를 출력합니다.");
			byte[] buf = new byte[1024]; // 한 번 읽는 단위
			int numRead = 0; // 읽은 바이트 수 
			while (true) {
				numRead = str.read(buf, 0, buf.length);
				if(numRead == -1) { // 파일 끝에 도달함
					if(progress > 0) { // 지난번에 읽었지만 10%에 도달하지 않아 *가 출력되지 않은 경우
						System.out.print("*");
					}
					break; // 파일 끝에 도달함
				}
				if (numRead > 0)
					dst.write(buf, 0, numRead);
				
				progress += numRead; // 파일 크기 10% 될 때까지 읽은 누적 바이트 수
				if (progress >= tenPercent) { // 10% 만큼 읽었다면
					System.out.print("*");
					progress = 0; // * 출력하고 progress를 0으로 리셋
				}
			}
           	str.close();
           	dst.close();
		} catch (IOException e) {
			System.out.println("입출력 오류가 발생했습니다.");
		}
	}
}