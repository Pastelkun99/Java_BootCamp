package sec_verify01;

public class DirectoryExample {

	public static void main(String[] args) {
		
		String data = "D:/������/photo/2016/travel/food.jpg";
		
		System.out.println("���� �̸� : " + data.substring(25, 29));
		System.out.println("Ȯ���� : " + data.substring(30));
		System.out.println("���� �̸� : " + data.substring(0, 24));
	}
}
