package sec04_exam_Nested_Interface;

public class MessageListener implements Button.OnClickListener {
//Button Ŭ������ ��ø�������̽��� OnClickListener�� �߻�޼��带 �������Ѵ�.
	
	@Override
	public void OnClick() {
		System.out.println("�޼����� �����ϴ�.");
	}

}
