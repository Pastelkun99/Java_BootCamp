package sec01_exam_contentSender;

public class kakaoSender extends ContentSender {

	String content;

	// ������
	public kakaoSender(String title, String nm, String content) {
		// ����Ŭ���� ������ ȣ��
		super(title, nm);
		// �ڽ��� ��� �ʱ�ȭ
		this.content = content;
	}

	// ����Ŭ������ �߻�޼����� sendMsg() ��ӹ޾� �������̵��մϴ�.
	@Override
	public void sendMsg(String receipient) {
		System.out.println("���� = " + this.title);
		System.out.println("�̸� = " + this.nm);
		System.out.println("���� = " + this.content);
		System.out.println("�޴»�� = " + receipient);
	}
}
