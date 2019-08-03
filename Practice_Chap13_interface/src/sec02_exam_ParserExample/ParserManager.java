package sec02_exam_ParserExample;

public class ParserManager {

	// main()�� static�̹Ƿ� static���� �����ؾ� �Ѵ�.
	// �ƿ﷯ ����Ÿ���� �������̽� Ÿ���̶�� ���� �� �������̽���
	// ������ Ŭ������ ���ؼ� �ν��Ͻ��� ��ȯ�ϰڴٴ� �ǹ��̴�.
	
	public static Parseable getParser(String type) {
		// String�� equals�� ���� ���Ѵ�.
		// ��ü�� �񱳴� �⺻������ �ּҺ��̴�.
		
		if(type.equals("XML")) {
			// �ν��Ͻ� �����Ͽ� �ּҰ� ����
			return new XMLParser();
		}
		else {
			// �������̽� �ʵ��� ������
			Parseable p = new HTMLParser();
			return p;
			// return new HTMLParser();
		}
	}
}
