import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class Homework_0529 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\\\Users\\\\dlaxo\\\\eclipse-workspace\\\\Homework_0529\\\\test.txt");
			InputStreamReader isr = new InputStreamReader(fis, "MS949");
			int c;
			System.out.println("Encoding set:" +isr.getEncoding());//���ڵ����(��� �ƴҰ�츦 ���Ѵ�) �� encoding set �� ���ڵ������ ���Ѱ��̴�.
			while ((c = isr.read())!=-1) {
				System.out.print((char)c);
			}
			isr.close();
			fis.close();
			
		}catch(IOException e) {
			System.out.println("IO Error");
		}
	}
}
