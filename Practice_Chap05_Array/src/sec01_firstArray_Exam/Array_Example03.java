package sec01_firstArray_Exam;

import java.util.Arrays;

public class Array_Example03 {

	public static void main(String[] args) {

		int[] iArr1 = new int[10]; // �迭�� ����. 0���� �ڵ��ʱ�ȭ �˴ϴ�.
		int[] iArr2 = new int[10];
		int[] iArr3 = new int[] { 100, 95, 80, 70, 60 }; // ����� ���ÿ� �ʱ�ȭ
		int[] iArr4 = new int[] { 100, 95, 80, 70, 60 }; // ����� ���ÿ� �ʱ�ȭ

		char[] chArr = new char[] { 'a', 'b', 'c', 'd' }; // ����� ���ÿ� �ʱ�ȭ

		// int arr[] = new int[50];
		// �迭 �ʱ�ȭ�� Ȯ��
		System.out.println("�迭 iArr1�� �ʱ�ȭ ��:");

		for (int i = 0; i < iArr1.length; i++) {
			System.out.println(iArr1[i]);
		}

		System.out.println(); // �ٹٲ�

		// �迭��.length�� �迭�� ���̸� ���մϴ�. �ſ� ���� ���̴� ��ũ���Դϴ�. (C������ �������� ����)
		for (int i = 0; i < iArr2.length; i++) {
			iArr1[i] = i + 1; // 1 ~ 10�� ���ڸ� ������� �迭�� �ִ´�.
		}

		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int) (Math.random() * 10) + 1; // 1 ~ 10�� ���� �迭�� ����
		}

		// �迭�� ����� ������ ����Ѵ�.
		for (int i = 0; i < iArr1.length; i++) {
			if (i == 9) {
				System.out.print(iArr1[i]);
			} else {
				System.out.print(iArr1[i] + ".");
			}
		}

		System.out.println();

		// int[]Ÿ�Կ��� toString()ȣ��� String���·� ��ȯ (APIã�ƺ���)
		System.out.println(Arrays.toString(iArr2));  // [�迭��,�迭��...]���·� ���
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(iArr4));

		// print()�޼��� �ȿ��� ������ ������ ���� �⺻������ ��ü�̸�@16������ ���ɴϴ�.
		// �׸��� ����������(���۷�������)�ڿ��� .toString()�� �����Ǿ� �ֽ��ϴ�.
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3.toString());
		System.out.println(iArr3);
		System.out.println(chArr.toString());

		// charŸ�Ը� toString()�� ȣ���ؾ� �ּҰ� ������
		// toString()�� ȣ������ �ƴ��ϸ� �׳� ������ ���
		System.out.println(chArr.toString());
		System.out.println(chArr);

	}

}
