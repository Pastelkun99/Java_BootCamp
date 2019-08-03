package sec_verify04_3;

public class Toilet {

	public Toilet() {}
	
	public synchronized void use(String irum) {
		System.out.println(irum + " 가/이 화장실에 입장하였습니다.");
		try {
			Thread.sleep(1000);
			System.out.println(irum + " 의 말 : 아 열나게 시원하다~");
			Thread.sleep(1000);
			System.out.println(irum + " 가/이 화장실 사용을 마쳤습니다.");
			Thread.sleep(1000);
			System.out.println();
		} catch (Exception e) {}
	}

	
}
