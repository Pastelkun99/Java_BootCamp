package sec01_Exam_SectionTV;

//�ڼ�Ŭ����(�ڽ�Ŭ����) ����� 7��

public class CaptionTv extends Tv {

	boolean caption; // ĸ�ǻ���(on/off) �⺻�� : false
	
	public CaptionTv() {
		super();	//����Ŭ������ �����ڸ� ȣ���ϴ� �޼���(�����Ϸ��� �˾Ƽ� ȣ��)
		System.out.println("�ڼ� Ŭ���� ������ ȣ��");
	}
	
	public void displayCaption(String text) {
		//1��° ȣ��ÿ� false, 2��° ȣ��ÿ��� true
		//ĸ�� ���°� on(true)�� ���� text�� �����ش�.
		if(this.caption) {
			System.out.println(text);
		}
	}
}
