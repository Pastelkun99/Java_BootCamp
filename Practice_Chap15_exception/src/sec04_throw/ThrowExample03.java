package sec04_throw;

public class ThrowExample03 {

	public static void main(String[] args) {
		
		String file1 = createFile("test.txt");
		String file2 = createFile("");
		
		System.out.println(file1 + "������ ���������� �����Ǿ����ϴ�.");
		System.out.println(file2 + "������ ���������� �����Ǿ����ϴ�.");
	}
	
	public static String createFile(String filename) {
		
		try {
			if(filename == null || filename.equals("")) {
				throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
			}
		}
		catch (Exception e) {
			//filename�� �������� ���, �����̸��� �������.txt�� �Ѵ�.
			filename = "�������.txt";
		}
		return filename;
	}
}
