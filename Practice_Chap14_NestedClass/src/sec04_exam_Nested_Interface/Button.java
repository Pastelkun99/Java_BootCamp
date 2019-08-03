package sec04_exam_Nested_Interface;

public class Button {

	//��ø�������̽�
	interface OnClickListener {
		
		void OnClick();
	}
	
	
	//�������̽� �������� ����
	OnClickListener listener;
	
	
	//setter -- �Ű������� �������̽�Ÿ���� ����Ǿ��ִٸ� ���� �ǹ��ΰ�? - ������ü�� ����.
	void setOnClickListener(OnClickListener listener) {
		
		this.listener = listener;
	}
	
	
	//touch() �޼��尡 ȣ��Ǹ鼭 ��ø�������̽��� ������ ��ü�� 
	//OnClick()�޼��尡 ȣ���.
	void touch() {
		listener.OnClick();
	}
}
