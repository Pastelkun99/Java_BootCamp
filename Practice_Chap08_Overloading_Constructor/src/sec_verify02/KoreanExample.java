package sec_verify02;

public class KoreanExample {

	public static void main(String[] args) {
		
		Korean kor = new Korean("대한민국", "김용범", 178, 26, "대구사투리");
		System.out.println("첫 번째 공개 수배자입니다.");
		System.out.print("국적\t : " + kor.nation +  "\n");
		System.out.print("이름\t : " + kor.name + "\n");
		System.out.print("키\t : " + kor.height + "\n");
		System.out.print("나이\t : " + kor.age + "\n");
		System.out.print("특징\t : " + kor.character + "\n");
		
		System.out.println("");
		
		Korean kor2 = new Korean("USA", "유재웅", 172, 29, "어설픈 영어");
		System.out.println("두 번째 공개 수배자입니다.");
		System.out.print("국적\t : " + kor2.nation +  "\n");
		System.out.print("이름\t : " + kor2.name + "\n");
		System.out.print("키\t : " + kor2.height + "\n");
		System.out.print("나이\t : " + kor2.age + "\n");
		System.out.print("특징\t : " + kor2.character + "\n");

	}

}
