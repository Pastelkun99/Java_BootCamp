package sec05_finalize;

public class FinalizeExample {

	public static void main(String[] args) {

		Counter count = null;
		
		for(int i=1; i <=50; i++) {
			count = new Counter(i);
			count = null;
			System.gc();
			//지맘대로 삭제함. 결과를 보면 알 수 있다.
		}
		
	}

}
