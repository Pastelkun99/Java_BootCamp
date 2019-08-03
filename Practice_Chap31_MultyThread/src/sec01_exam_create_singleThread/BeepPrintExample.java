package sec01_exam_create_singleThread;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		
		// �Ʒ� �ڵ�� �̱۽����忡�� ���ư��� �۾��̹Ƿ�, �������� 5�� �︮�� �� �� 
		// "��"�̶�� ���ڿ��� 5�� ����Ѵ�. ������, �츮�� ���ϴ� ���� "��"�̶��
		// ���ڿ��� ��µǸ鼭 �������� ���� ����Ǵ� ���� ���Ѵ�.
		// �̰��� �ٷ� �̱۽������� �����̴�. �������̶�� ���̴�.
		// �̰��� ��Ƽ������� �ٲ㰡�� ���� ������ �忡�� �ؾ��� ���̴�.
		// �������� 5�� �����ؼ� �Ҹ����� ��.
		// Toolkit�� AWT(Abstract Window Toolkit) �߻�Ŭ������ ��ӹ��� �Ǵٸ� �߻�Ŭ�����̴�.
		// �� ��, GUI���õ� �޼������ �ִ�. getDefaultToolkit()�� �⺻���� �޼������ �����س���
		// �޼����̴�.
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<5; i++) {
			toolkit.beep(); //������
			try {
				// �����޼��� sleep()�� �����ϴ� �����带 0.5�� ���ߴ� ���
				// (���α׷��� �ʹ� ���� ���ư��ϱ� ������)
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// "��"�̶�� ���ڿ��� 5�� �ݺ��ؼ� �����.
		for(int i = 0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {	}
		}
	}
}
