package sec_verify09;

public class StringCountExample {

	static int count(String src, String target) {
		
		int index = 0;
		int charleng = 0;
		
		while(index != -1) {
			index = src.indexOf(target);
			if(index != -1) {
				src = src.substring(index + target.length());
				charleng++;
			}
		}
		return charleng;
	}
	
	public static void main(String[] args) {

		String str1 = "�뱸�� ����սô�. �뱸!";
		String str2 = "I Love LG, I Like Pizza!";
		System.out.println(str1 + " < -- ���ڿ����� �뱸��� �ܾ �� " + count("�뱸�� ����սô�. �뱸!", "�뱸") + "�� �־��.");
		System.out.println(str2 + " < -- ���ڿ����� �뱸��� �ܾ �� " + count("I like LG, I like Pizza!", "�뱸") + "�� �־��.");
	}

}
