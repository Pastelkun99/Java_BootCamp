package sec01_Exam_SectionTV;

public class CaptionTvExample {

	public static void main(String[] args) {
		
		CaptionTv ctv = new CaptionTv();
		
		ctv.channel = 10; 		//����Ŭ�����κ��� ��ӹ��� ���
		ctv.channelUp();		//����Ŭ�����κ��� ��ӹ��� ���, channel1�� ������Ų��.
		
		System.out.println("���� ä���� " + ctv.channel + "�Դϴ�.");
		ctv.displayCaption("ĸ�Ǳ�� ��� �޽��� : Hello, World");		//false�̹Ƿ� ��������ʴ´�.
		
		ctv.caption = true; //ĸ�Ǳ���� �Ҵ�.
		ctv.displayCaption("ĸ�Ǳ�� ��� �޽��� : Hello, World");		//ĸ���� ȭ�鿡 �����ش�.

	}

}
