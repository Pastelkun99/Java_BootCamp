package sec03_exam_singleinheritance;

public class TVCRExample {

	public static void main(String[] args) {
			
		TVCR tvcr = new TVCR();		//�ڼ� Ŭ������ ���� �ν��Ͻ� ������ ��.
		Tv tv = new Tv(); 			//���� Ŭ������ ���� �ν��Ͻ� ������ ��.
		
		tv.power();
		
		//�������̵�(������)�� �ڼ� Ŭ������ power()�� ȣ���.
		tvcr.power();
		
		System.out.println(tvcr.getChannel());
		System.out.println(tvcr.channel);
		
		tvcr.vcr.play();
		tvcr.play();
		tvcr.stop();
		tvcr.rew();
		tvcr.ff();
		tvcr.channelUp();
		tvcr.channelDown();
		
	}

}
