package sec01_exam;

public class StringEx {

	public static void main(String[] args) {
		
		// StringŬ������ �������� name, str
		String name = new String("Ja" + "Va");
		String str = new String(name + 8.0);
		
		// anytype + ���ڿ� = ���ڿ�
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " "); // '+' �� ������ Ÿ���� ���� ���ڿ�ȭ �Ͽ� �������ݴϴ�.
		System.out.println(" " + 7);
		
	    // 1234567�� ������ Ÿ���� �����ΰ�? = ������
		System.out.println(1234567);
		
        // �� ��쿣 ���ڿ� Ÿ��, �� ��ũ���� ������ ���� ���� �ֽ��ϴ�.
		System.out.println("" + 1234567);
	}

}
