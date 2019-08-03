package sec04_exam_Nested_Interface;

public class Button {

	//중첩인터페이스
	interface OnClickListener {
		
		void OnClick();
	}
	
	
	//인터페이스 참조변수 선언
	OnClickListener listener;
	
	
	//setter -- 매개변수로 인터페이스타입이 선언되어있다면 무슨 의미인가? - 구현객체만 들어간다.
	void setOnClickListener(OnClickListener listener) {
		
		this.listener = listener;
	}
	
	
	//touch() 메서드가 호출되면서 중첩인터페이스를 구현한 객체의 
	//OnClick()메서드가 호출됨.
	void touch() {
		listener.OnClick();
	}
}
