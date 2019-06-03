import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class TextFileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File srcFile = new File("C:\\Users\\dlaxo\\eclipse-workspace\\파일읽기\\test.txt");
		File dstFile = new File("C:\\Users\\dlaxo\\eclipse-workspace\\파일읽기\\test_result.txt");
		
		FileReader fr = null;
		FileWriter fw = null;
		
		int c;
		try {
			fr = new FileReader(srcFile);
			fw = new FileWriter(dstFile);
			
			while((c = fr.read())!=-1) {
				System.out.println((char)c);
				fw.write((char) c);
			}
			fr.close();
			fw.close();
		}catch(IOException e) {
			System.out.println("File 복사 에러");
		}
	
	}

}
