package sec01_exam_contentSender;

public class SenderExample {

	public static void main(String[] args) {

		// �߻�Ŭ������ �ν��Ͻ��� ����� ������ �� �����ϴ�.
		// ContentSender sc = new ContentSender(); ���� ����?

		// �߻�Ŭ������ �����̱� ������ �������� ����� �� �ֽ��ϴ�.
		// ��, ����Ŭ���� ����� �߻�޼��带 ��� ������ �ڼ�Ŭ������ ������ �����մϴ�.

		ContentSender cs = new letterSender("SMS����", "�����", "ȸ���սô�.");
		cs.sendMsg("������");
		System.out.println();

		letterSender ls = new letterSender("SMS����", "������", "������� ȸ�����ڰ� �Ͻʴϴ�.");
		kakaoSender ks = new kakaoSender("īī����", "������", "�� �˰ڽ��ϴ�.");

		// ����Ŭ������ �߻�޼��带 �������̵��� �޼��尡 ȣ��˴ϴ�. ���� �ٸ� ���� ����� ���� �� �ֽ��ϴ�.
		ls.sendMsg("������");
		System.out.println();
		ks.sendMsg("������");

	}

}
