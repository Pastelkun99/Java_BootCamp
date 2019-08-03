package sec03_exam_singleinheritance;


//조상클래스 (부모, Super클래스) 멤버갯수 5개;

public class Tv {

	boolean power;
	int channel = 10;
	
	//기본생성자	
	public Tv() {
		super(); //Object 생성자 호출
		System.out.println("Tv조상 클래스 생성자 호출");
	}
	
	// 전원상태(on/off)
	public void power() {
		this.power = !this.power;
		System.out.println("조상클래스 Tv의 power메서드를 호출하였습니다.");
	}
	
	//채널 업/다운 기능
	public void channelUp() {
		++this.channel;
		System.out.println("조상클래스 Tv의 channelUp메서드를 호출하였습니다.");
	}
	
	public void channelDown() {
		--this.channel;
		System.out.println("조상클래스 Tv의 channelDown메서드를 호출하였습니다.");
	}
	
}
