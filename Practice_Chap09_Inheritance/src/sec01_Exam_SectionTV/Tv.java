package sec01_Exam_SectionTV;


//조상클래스 (부모, Super클래스) 멤버갯수 5개;
//super() 는 조상클래스의 생성자 호출.

public class Tv {

	boolean power;
	int channel;
	
	public Tv() {
		System.out.println("조상 클래스 생성자 호출");
	}
	
	// 전원상태(on/off)
	public void power() {
		this.power = !power;
	}
	
	//채널 업/다운 기능
	public void channelUp() {
		++this.channel;
	}
	
	public void channelDown() {
		--this.channel;
	}
	
}
