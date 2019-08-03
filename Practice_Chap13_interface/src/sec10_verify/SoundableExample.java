package sec10_verify;

public class SoundableExample {

	public static void main(String[] args) {

		Soundable snd = new Soundable() {
			
			@Override
			public void sound() {
				System.out.println("ù��° �͸�����ü : ����");
				System.out.println("���� ���� ����ϴ�.");
			}
		};
		
		Soundable snd2 = new Soundable() {
			
			@Override
			public void sound() {
				System.out.println("�ι�° �͸�����ü : ��������");
				System.out.println("���������� ������ �մϴ�.");
			}
		};
		
		snd.sound();
		snd2.sound();
	}

}
