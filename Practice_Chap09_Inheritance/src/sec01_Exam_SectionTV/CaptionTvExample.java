package sec01_Exam_SectionTV;

public class CaptionTvExample {

	public static void main(String[] args) {
		
		CaptionTv ctv = new CaptionTv();
		
		ctv.channel = 10; 		//조상클래스로부터 상속받은 멤버
		ctv.channelUp();		//조상클래스로부터 상속받은 멤버, channel1을 증가시킨다.
		
		System.out.println("현재 채널은 " + ctv.channel + "입니다.");
		ctv.displayCaption("캡션기능 출력 메시지 : Hello, World");		//false이므로 출력하지않는다.
		
		ctv.caption = true; //캡션기능을 켠다.
		ctv.displayCaption("캡션기능 출력 메시지 : Hello, World");		//캡션을 화면에 보여준다.

	}

}
