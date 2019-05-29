import java.io.FileReader;
import java.io.IOException;
public class FileReaderTest {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\Users\\dlaxo\\hellocheck.txt");
			int c;
			System.out.println("Encoding set:" +fr.getEncoding());
			while ((c = fr.read())!=-1) {
				System.out.print((char)c);
			}
			fr.close();
		}catch(IOException e) {
			System.out.println("IO Error");
		}
	}
}
