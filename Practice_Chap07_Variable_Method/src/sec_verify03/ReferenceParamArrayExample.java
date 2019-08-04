package sec_verify03;

public class ReferenceParamArrayExample {

	public static void main(String[] args) {
		
		int[] arr = {3, 2, 1, 6, 5, 4};
		
		System.out.println("정렬 전 배열 값입니다.");
		ReferenceParamArray.printArr(arr);
		
		System.out.println();		
		System.out.println("정렬 후 배열 값입니다.");
		ReferenceParamArray.sortArr(arr);
		
		System.out.println();
		
		System.out.println("배열의 합입니다.");
		System.out.println("sum = " + ReferenceParamArray.Arrsum(arr));
		
	}

}


