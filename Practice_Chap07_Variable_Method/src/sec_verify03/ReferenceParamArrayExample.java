package sec_verify03;

public class ReferenceParamArrayExample {

	public static void main(String[] args) {
		
		int[] arr = {3, 2, 1, 6, 5, 4};
		
		System.out.println("���� �� �迭 ���Դϴ�.");
		ReferenceParamArray.printArr(arr);
		
		System.out.println();		
		System.out.println("���� �� �迭 ���Դϴ�.");
		ReferenceParamArray.sortArr(arr);
		
		System.out.println();
		
		System.out.println("�迭�� ���Դϴ�.");
		System.out.println("sum = " + ReferenceParamArray.Arrsum(arr));
		
	}

}


