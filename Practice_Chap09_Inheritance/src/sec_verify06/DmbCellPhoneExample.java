package sec_verify06;

public class DmbCellPhoneExample {

	public static void main(String[] args) {

		DmbCellPhone dmbphone = new DmbCellPhone("�ڹ���", "����", 10);
		System.out.println(dmbphone);

		dmbphone.powerOn();
		dmbphone.bell();
		dmbphone.sendVoice("��������");
		dmbphone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		dmbphone.sendVoice("��~ �� �ݰ����ϴ�.");
		dmbphone.hangUp();
		dmbphone.turnonDmb();
		dmbphone.changeChannelDmb(12);
		dmbphone.turnOffDmb();

	}

}
