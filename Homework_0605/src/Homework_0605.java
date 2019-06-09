import java.io.*;

public class Homework_0605 {
	public static void main(String[] args) {
		BufferedInputStream str = null;
		BufferedOutputStream dst = null;
		File src = new File("a.jpg");
		File dest = new File("b.jpg");
		try {
			str = new BufferedInputStream(new FileInputStream(src)); // ���� �Է� ��Ʈ���� ����
			dst = new BufferedOutputStream(new FileOutputStream(dest)); // ���� ��� ��Ʈ���� ����
			
			long tenPercent = src.length() / 10; // ������ 10% ũ��
			long progress = 0; // ���� ũ�� 10% �� ������ ���� ���� ����Ʈ ��
			
			System.out.println("a.jpg�� b.jpg�� �����մϴ�. \n10%���� *�� ����մϴ�.");
			byte[] buf = new byte[1024]; // �� �� �д� ����
			int numRead = 0; // ���� ����Ʈ �� 
			while (true) {
				numRead = str.read(buf, 0, buf.length);
				if(numRead == -1) { // ���� ���� ������
					if(progress > 0) { // �������� �о����� 10%�� �������� �ʾ� *�� ��µ��� ���� ���
						System.out.print("*");
					}
					break; // ���� ���� ������
				}
				if (numRead > 0)
					dst.write(buf, 0, numRead);
				
				progress += numRead; // ���� ũ�� 10% �� ������ ���� ���� ����Ʈ ��
				if (progress >= tenPercent) { // 10% ��ŭ �о��ٸ�
					System.out.print("*");
					progress = 0; // * ����ϰ� progress�� 0���� ����
				}
			}
           	str.close();
           	dst.close();
		} catch (IOException e) {
			System.out.println("����� ������ �߻��߽��ϴ�.");
		}
	}
}