import java.util.Scanner; //��ĳ�� ����
public class Homework0410 { 
		public Homework0410() {};  //������
		private static String[]kor = {"���","�Ʊ�","��","�̷�","���"};  //�ѱۻ���
		private static String[]eng = {"love","baby","money","future","hope"};  //�������
		public static String kor2Eng(String word) { //kor2Eng�޼���. ���ڴ� string���·ι���
			
			for(int i = 0;i<kor.length;i++) {  //�������� ���� ���ڰ� �ѱۻ����迭 �˻�
				if(word.equals(kor[i])) {		//���� ���������
					return kor[i]+" �� "+eng[i];  //����
				}
				if(i==4) {  //�ѱ� ������ �ȳ�������� �ݺ���Ż��
					break;
				}
			}
			for(int j = 0;j<eng.length;j++) {  //�������� ��������迭 �˻�
				if(word.equals(eng[j])) {  //���� ���������
					return eng[j]+" �� "+kor[j];  //����
				}
				
				if(j==4) {  
					return word+"�� ���� ������ �����ϴ�.";  //�ѱ� ���� �� ������ �ȳ�������� ������ ����
				}
			}
			return null; //��Ʈ���� ����
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  //��ĳ�� ����
		Homework0410 dic = new Homework0410();  //���۷��� ���� ���� �� ��ü����

		while(true) {  //���ѷ���
			String word = scan.nextLine();  //��� ���� �ޱ�����
			if(word.equals("�׸�")) { //�׸��̶�� �ܾ ���������
				return;
			}
			System.out.println(dic.kor2Eng(word));  //���
			
		}
	}

}
