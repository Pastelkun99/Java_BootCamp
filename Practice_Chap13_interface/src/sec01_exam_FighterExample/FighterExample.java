package sec01_exam_FighterExample;

public class FighterExample {

	public static void main(String[] args) {
		
		Fighter f = new Fighter();
		//Fightable f = new Fighter();
		//Unit f = new Fighter();
		
		/*
		 * A instanceof B �� : A�� BŸ���� ��� true�� ��ȯ�Ѵ�.
		 * ��, A�� B�� ����ȯ(TypeCasting)�ȴٴ� �ǹ��̴�.(����Ŭ������ ���̴�.)
		 * �������� ������ ���÷�����.(����Ÿ���� ���������� �ڼ�Ÿ���� �ν��Ͻ��� ������ �� �ִ� ��.)
		 * ��Ӱ������� �׷�����.
		 */

		if(f instanceof Unit) {
			System.out.println("f�� Unit Ŭ������ �ڼ��Դϴ�.");
		}
		if(f instanceof Fightable) {
			System.out.println("f�� Fightable Ŭ������ �ڼ��Դϴ�.");
		}
		if(f instanceof Movable) {
			System.out.println("f�� Movable Ŭ������ �ڼ��Դϴ�.");
		}
		if(f instanceof Attackable) {
			System.out.println("f�� Attackable Ŭ������ �ڼ��Դϴ�.");
		}
		if(f instanceof Object) {
			System.out.println("f�� Object Ŭ������ �ڼ��Դϴ�.");
		}
		
	}

}
