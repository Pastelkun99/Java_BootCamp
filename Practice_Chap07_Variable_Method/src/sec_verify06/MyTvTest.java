package sec_verify06;

public class MyTvTest {

	public static void main(String[] args) {
		
		MyTv t = new MyTv();	
		
		t.setChannel(101);
		t.setChannel(15);
		t.setChannel(8);
		
		System.out.println("���� ä�� : "+t.getChannel());
		System.out.println("���� ä�� : "+t.getPrevChannel());
		
		t.setVolume(101);
		t.setVolume(25);
		t.setVolume(20);
		
		System.out.println("���� ���� : "+t.getVolume());
		System.out.println("���� ���� : "+t.getPrevVolume());
	}

}
