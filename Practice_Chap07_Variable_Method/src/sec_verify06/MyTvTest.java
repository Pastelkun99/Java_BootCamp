package sec_verify06;

public class MyTvTest {

	public static void main(String[] args) {
		
		MyTv t = new MyTv();	
		
		t.setChannel(101);
		t.setChannel(15);
		t.setChannel(8);
		
		System.out.println("현재 채널 : "+t.getChannel());
		System.out.println("이전 채널 : "+t.getPrevChannel());
		
		t.setVolume(101);
		t.setVolume(25);
		t.setVolume(20);
		
		System.out.println("현재 볼륨 : "+t.getVolume());
		System.out.println("이전 볼륨 : "+t.getPrevVolume());
	}

}
