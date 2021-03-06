package sec_verify03_1;

import java.util.Scanner;

public class GoodsExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("몇 개의 상품을 입력 받으시겠습니까? >> ");

		Goods[] arr = new Goods[scan.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 상품 이름 : ");
			String name = scan.next();

			System.out.print(i + 1 + "번째 상품 가격 : ");
			int price = scan.nextInt();

			System.out.print(i + 1 + "번째 상품 재고 : ");
			int stock = scan.nextInt();

			System.out.print(i + 1 + "번째 팔린 상품 수량 : ");
			int sold = scan.nextInt();
			arr[i] = new Goods(name, price, stock, sold);
		}

		System.out.println("입력하신 상품의 이름, 가격, 재고, 팔린 수량의 현황입니다.");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		scan.close();
	}
}