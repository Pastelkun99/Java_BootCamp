package sec_verify01;

public class DirectoryExample {

	public static void main(String[] args) {
		
		String data = "D:/내폴더/photo/2016/travel/food.jpg";
		
		System.out.println("파일 이름 : " + data.substring(25, 29));
		System.out.println("확장자 : " + data.substring(30));
		System.out.println("폴더 이름 : " + data.substring(0, 24));
	}
}
