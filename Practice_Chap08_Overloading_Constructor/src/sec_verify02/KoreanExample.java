package sec_verify02;

public class KoreanExample {

	public static void main(String[] args) {
		
		Korean kor = new Korean("���ѹα�", "����", 178, 26, "�뱸������");
		System.out.println("ù ��° ���� �������Դϴ�.");
		System.out.print("����\t : " + kor.nation +  "\n");
		System.out.print("�̸�\t : " + kor.name + "\n");
		System.out.print("Ű\t : " + kor.height + "\n");
		System.out.print("����\t : " + kor.age + "\n");
		System.out.print("Ư¡\t : " + kor.character + "\n");
		
		System.out.println("");
		
		Korean kor2 = new Korean("USA", "�����", 172, 29, "��� ����");
		System.out.println("�� ��° ���� �������Դϴ�.");
		System.out.print("����\t : " + kor2.nation +  "\n");
		System.out.print("�̸�\t : " + kor2.name + "\n");
		System.out.print("Ű\t : " + kor2.height + "\n");
		System.out.print("����\t : " + kor2.age + "\n");
		System.out.print("Ư¡\t : " + kor2.character + "\n");

	}

}
