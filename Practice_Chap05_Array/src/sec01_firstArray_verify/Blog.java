package sec01_firstArray_verify;

public class Blog {

	public static void main(String[] args) {
		
		String[][] cabinet = new String[2][2];
		
		cabinet[0][0] = "������";
		cabinet[0][1] = "�ո�ð�";
		
		cabinet[1][0] = "����Ĩ";
		cabinet[1][1] = "�ݶ�";
		
		System.out.println("ù ��° ������ ù ��° ĭ���̿� �� �� : " + cabinet[0][0]);
		System.out.println("ù ��° ������ �� ��° ĭ���̿� �� �� : " + cabinet[0][1]);
		
		System.out.println("�� ��° ������ ù ��° ĭ���̿� �� �� : " + cabinet[1][0]);
		System.out.println("�� ��° ������ �� ��° ĭ���̿� �� �� : " + cabinet[1][1]);
		
	}
}
