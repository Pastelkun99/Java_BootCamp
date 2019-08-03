package sec01_verify;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		
		System.out.print("화씨온도를 입력하세요. : ");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int fahrenheit = Integer.parseInt(input);
		
		scanner.close();
		
		float celcius = (fahrenheit - 32) / 1.8f; 
	    //°C = (°F − 32) / 1.8
		
		System.out.println("입력한 화씨온도를 섭씨온도로 변환한 값 : " + Math.round(celcius*100.0)/100.0);
		
	}

}
