package sec_verify04_3;

public class Toilet {

	public Toilet() {}
	
	public synchronized void use(String irum) {
		System.out.println(irum + " ��/�� ȭ��ǿ� �����Ͽ����ϴ�.");
		try {
			Thread.sleep(1000);
			System.out.println(irum + " �� �� : �� ������ �ÿ��ϴ�~");
			Thread.sleep(1000);
			System.out.println(irum + " ��/�� ȭ��� ����� ���ƽ��ϴ�.");
			Thread.sleep(1000);
			System.out.println();
		} catch (Exception e) {}
	}

	
}
