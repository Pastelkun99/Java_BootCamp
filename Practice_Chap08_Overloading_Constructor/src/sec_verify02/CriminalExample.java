package sec_verify02;

public class CriminalExample {

	public static void main(String[] args) {

		Criminal kor = new Criminal("���ѹα�", "����", 178, 26, "�뱸������");
		System.out.println("ù ��° ���� �������Դϴ�.");
		System.out.print("����\t : " + kor.nation + "\n");
		System.out.print("�̸�\t : " + kor.name + "\n");
		System.out.print("Ű\t : " + kor.height + "\n");
		System.out.print("����\t : " + kor.age + "\n");
		System.out.print("Ư¡\t : " + kor.character + "\n");

		System.out.println("");

		Criminal usa = new Criminal("USA", "�����", 172, 29, "��� ����");
		System.out.println("�� ��° ���� �������Դϴ�.");
		System.out.print("����\t : " + usa.nation + "\n");
		System.out.print("�̸�\t : " + usa.name + "\n");
		System.out.print("Ű\t : " + usa.height + "\n");
		System.out.print("����\t : " + usa.age + "\n");
		System.out.print("Ư¡\t : " + usa.character + "\n");

	}

}
