package sec01_exam;

public class EasyIfelse {

	public static void main(String[] args) {
		
		int score = 81;
		
		// IF��
		// if( ���� ) {
		//		�ش� ������ True�϶� ����Ǿ�� �� �ڵ�
		// } else if ( ���� ) {
		// 		if�� ���� ������ �ƴ� �ٸ� ������ �����Ҷ� ����Ǿ�� �� �ڵ�
		// } else {
		// 		�ռ� ��� ���ǿ� �ش����� ���� ��� ����Ǿ�� �� �ڵ�
		// }
		
		
		if(score >= 70 && score <= 100) {
			System.out.println("���迡 �հ��Ͽ����ϴ�.");
		}
		else if(score >= 0 && score < 70){
			System.out.println("���迡 ���հ��Ͽ����ϴ�.");
		}
		else {
			System.out.println("������ ���� 0~100 �� ������ϴ�.");
		}
		
		// �ڵ带 ���� �����ϱⰡ �����ϴ�.

	}

}
