package sec_verify08;

import java.util.Arrays;

public class DeepCloneDriveExample {

	public static void main(String[] args) {

		Drive original = new Drive("C����̺�", 500, new String[] {"������ ����", "�ý��� ����"}, new Folder("�߽òٸ��Ѱ�", 15));
		Drive cloned = original.getDrive();
		
		System.out.println("[���� ����̺��� �ʵ� ��]");
		System.out.println("�̸� : " + original.name);
		System.out.println("ũ�� : " + original.size);
		System.out.println("���� ��� : " + Arrays.toString(original.driverList));
		System.out.println("�� ���� �� : " + original.folder.name);
		System.out.println("ũ�� : " + original.folder.size);
		
		System.out.println();
		System.out.println("[������ ����̺��� �ʵ� ��]");
		System.out.println("�̸� : " + cloned.name);
		System.out.println("ũ�� : " + cloned.size);
		System.out.println("���� ��� : " + Arrays.toString(cloned.driverList));
		System.out.println("�� ���� �� : " + cloned.folder.name);
		System.out.println("ũ�� : " + cloned.folder.size);
	}

}
