package sec_verify02;

public class StringBufferDelCharExample {

	public static void main(String[] args) {

		System.out.println("(����!�ڹٸ�@���^^�մϴ�.)" + " -> " + delChar("(����! �ڹٸ�@ ���^^�մϴ�.)","(!@^)"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)"," \t"));
		
	}
	
	public static String delChar(String src, String delCh) {
		
		StringBuffer sb = new StringBuffer(src.length());

		for(int i=0; i<src.length(); i++) {
		   char ch = src.charAt(i);
		   if(delCh.indexOf(ch) == -1) {
		   sb.append(ch);
		   }
		}
		  return sb.toString(); 
	}
}
