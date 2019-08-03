package sec01_verify;

import java.util.Scanner;

public class Exercise05_03_If {

	public static void main(String[] args) {

		int basic;
		double price;
		double tax;
		double total;

		System.out.print("전기 사용량을 입력하세요(kw) : ");
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		scanner.close();

		// 기본요금 + (사용량 * kw당 요금) + 세금
		// 세금 = (기본요금 + kw당 요금) * 0.09

		// =================기본요금에 대한 계산==============================

		if (amount > 500) {
			basic = 9330;
		} else if (amount >= 401 && amount <= 500) {
			basic = 5130;
		} else if (amount >= 301 && amount <= 400) {
			basic = 2710;
		} else if (amount >= 201 && amount <= 300) {
			basic = 1130;
		} else if (amount >= 101 && amount <= 200) {
			basic = 660;
		} else {
			basic = 370;
		}

		// =====================사용량에 따른 계산=============================

		if (amount < 100) {
			price = amount * 52.0;
		}

		else if (amount <= 200) {
			price = (100 * 52.0);
			price += (amount - 100) * 88.5;
		}

		else if (amount <= 300) {
			price = (100 * 52.0) + (100 * 88.5);
			price += (amount - 200) * 127.8;
		}

		else if (amount <= 400) {
			price = (100 * 52.0) + (100 * 88.5) + (100 * 127.8);
			price += (amount - 300) * 184.3;
		}

		else if (amount <= 500) {
			price = (100 * 52.0) + (100 * 88.5) + (100 * 127.8) + (100 * 184.3);
			price += (amount - 400) * 274.3;
		}

		else {
			price = (100 * 52.0) + (100 * 88.5) + (100 * 127.8) + (100 * 184.3) + (100 * 274.3);
			price += (amount - 500) * 494.0;
		}

		// ===================================================================

		tax = (basic + price) * 0.09;
		total = basic + price + tax;

		System.out.println("이번 달 요금은 " + Math.round(total * 10) / 10 + "원 입니다.");
		System.out.println("total : " + Math.round(total * 10) / 10);

	}

}
