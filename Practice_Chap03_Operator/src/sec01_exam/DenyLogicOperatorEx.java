package sec01_exam;

public class DenyLogicOperatorEx {

	public static void main(String[] args) {
		
			boolean play = true;
			System.out.println(play);
			
			play = !play; 
			// !연산자는 반댓값을 취한다.
			// !true == false, !false == true
			
			System.out.println(play);

			play = !play;
			System.out.println(play);
	}

}
