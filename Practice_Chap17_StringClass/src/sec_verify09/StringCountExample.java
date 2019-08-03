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

		String str1 = "대구를 사랑합시다. 대구!";
		String str2 = "I Love LG, I Like Pizza!";
		System.out.println(str1 + " < -- 문자열에는 대구라는 단어가 총 " + count("대구를 사랑합시다. 대구!", "대구") + "번 있어요.");
		System.out.println(str2 + " < -- 문자열에는 대구라는 단어가 총 " + count("I like LG, I like Pizza!", "대구") + "번 있어요.");
	}

}
