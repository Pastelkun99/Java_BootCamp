package sec_verify06;

public class MyTv {
	
	boolean isPowerOn = false;
	public int Channel ;
	public int Volume ;
	public int prevChannel;
	public int prevVolume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	public void setChannel(int Channel) {
		if(Channel > MAX_CHANNEL || Channel == 0 || Channel < MIN_CHANNEL) {
			System.out.println("ä���� 100�� �Ѱų�, 0�̰ų�, ������ ���� �����ϴ�.");
		}
		prevChannel = this.Channel;
		this.Channel = Channel;
	}
	
	public int getChannel() {
		return Channel;
	}
	
	public void setVolume(int Volume) {
		if(Volume > MAX_VOLUME || Volume == 0 || Volume < MIN_VOLUME) {
			System.out.println("������ 100�� �Ѱų�, ������ ���� �����ϴ�.");
		}
		prevVolume = this.Volume;
		this.Volume = Volume;
	}
	
	public int getVolume() {
		return Volume;
	}
	
	public int getPrevChannel() {
		return prevChannel;
	}
	
	public int getPrevVolume() {
		return prevVolume;
	}
	
}
