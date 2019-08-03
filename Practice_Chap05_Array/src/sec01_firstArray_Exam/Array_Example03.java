package sec01_firstArray_Exam;

import java.util.Arrays;

public class Array_Example03 {

	public static void main(String[] args) {

		int[] iArr1 = new int[10]; // 배열의 선언. 0으로 자동초기화 됩니다.
		int[] iArr2 = new int[10];
		int[] iArr3 = new int[] { 100, 95, 80, 70, 60 }; // 선언과 동시에 초기화
		int[] iArr4 = new int[] { 100, 95, 80, 70, 60 }; // 선언과 동시에 초기화

		char[] chArr = new char[] { 'a', 'b', 'c', 'd' }; // 선언과 동시에 초기화

		// int arr[] = new int[50];
		// 배열 초기화값 확인
		System.out.println("배열 iArr1의 초기화 값:");

		for (int i = 0; i < iArr1.length; i++) {
			System.out.println(iArr1[i]);
		}

		System.out.println(); // 줄바꿈

		// 배열명.length는 배열의 길이를 뜻합니다. 매우 자주 쓰이는 테크닉입니다. (C에서는 존재하지 않음)
		for (int i = 0; i < iArr2.length; i++) {
			iArr1[i] = i + 1; // 1 ~ 10의 숫자를 순서대로 배열에 넣는다.
		}

		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int) (Math.random() * 10) + 1; // 1 ~ 10의 값을 배열에 저장
		}

		// 배열에 저장된 값들을 출력한다.
		for (int i = 0; i < iArr1.length; i++) {
			if (i == 9) {
				System.out.print(iArr1[i]);
			} else {
				System.out.print(iArr1[i] + ".");
			}
		}

		System.out.println();

		// int[]타입에서 toString()호출시 String형태로 반환 (API찾아보기)
		System.out.println(Arrays.toString(iArr2));  // [배열값,배열값...]형태로 출력
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(iArr4));

		// print()메서드 안에서 참조형 변수가 오면 기본적으로 객체이름@16진수가 나옵니다.
		// 그리고 참조형변수(레퍼런스변수)뒤에는 .toString()이 생략되어 있습니다.
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3.toString());
		System.out.println(iArr3);
		System.out.println(chArr.toString());

		// char타입만 toString()을 호출해야 주소가 나오고
		// toString()을 호출하지 아니하면 그냥 값들이 출력
		System.out.println(chArr.toString());
		System.out.println(chArr);

	}

}
