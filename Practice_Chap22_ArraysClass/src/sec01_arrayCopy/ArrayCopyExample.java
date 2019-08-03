package sec01_arrayCopy;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {

		char[] arr1 = {'J', 'A', 'V', 'A'};
		long start;
		long end;
		
		//��� 1
		//arr1�� ������ �迭�� �����Ǿ� ����
		start = System.nanoTime();
		System.out.println();
		
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		end = System.nanoTime();
		//���� ���� toString()�� �������̵� �Ǿ� �ִ�.
		
		System.out.println("arr[2] = " + Arrays.toString(arr2));
		System.out.println(end - start);
		
		
		
		
		//��� 2
		//copyOfRange(�����迭, �����ε���, ���ε���);
		start = System.nanoTime();
		
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		end = System.nanoTime();
		System.out.println("arr[3] = " + Arrays.toString(arr3));
		System.out.println(end - start);
		
		
		
		
		//��� 3
		char[] arr4 = new char[arr1.length];
		start = System.nanoTime();
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		end = System.nanoTime();
		System.out.println("arr[4] = " + Arrays.toString(arr4));
		System.out.println(end - start);
		
		
		
		
		//�ݺ����� �̿��� ���
		start = System.nanoTime();
		System.out.println(end - start);
		//���� for�� �̿�
		start = System.nanoTime();
		for(char j : arr4) {
			System.out.println("arr4[" + j + "]= " + j);
		}
		end = System.nanoTime();
		System.out.println(end - start);
	}

}