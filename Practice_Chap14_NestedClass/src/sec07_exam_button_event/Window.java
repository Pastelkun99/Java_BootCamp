package sec07_exam_button_event;

public class Window {

	Button btn1 = new Button();
	Button btn2 = new Button();
	
	//�ʵ��� �ʱⰪ���� �͸�����ü�� �����ϰ� �ִ�.
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void OnClick() {
			System.out.println("���α׷� ��ġ�� ����˴ϴ�.");
		}
	};
	
	public Window() {
		//ButtonŬ������ �ν��Ͻ��� setOnClickListenerȣ���ϸ鼭 ���� ������ �Ű����� �ѱ��.
		btn1.setOnClickListener(listener);
		
		//ButtonŬ������ �ν��Ͻ��� �ٷ� �͸�����ü�� �ѱ��.
		btn2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void OnClick() {
				System.out.println("������ �����մϴ�.");				
			}
		});
	}
}
