package sec01_exam;

public class DenyLogicOperatorEx {

	public static void main(String[] args) {
		
			boolean play = true;
			System.out.println(play);
			
			play = !play; 
			// !�����ڴ� �ݴ��� ���Ѵ�.
			// !true == false, !false == true
			
			System.out.println(play);

			play = !play;
			System.out.println(play);
	}

}
