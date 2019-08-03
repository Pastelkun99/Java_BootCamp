package sec01_getProperty;

import java.util.Properties;
import java.util.Set;

public class PropertyExample {

	public static void main(String[] args) {
		
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println("�ü�� �̸� : " + osName);
		System.out.println("����� �̸� : " + userName);
		System.out.println("����� Ȩ���丮 : " + userHome);
		
		System.out.println("------------------------------------------------");
		System.out.println(" [KEY]                                    value ");
		System.out.println("------------------------------------------------");
		
		//Property�� ���� set��ü �����Ͽ� keyset���� ������ ���
		Properties props = System.getProperties(); 		//��� �ý����� �Ӽ��� ��Ƽ� ����
		
		//Properties �÷����� Ű�� ���� ��ü�� String �̴�. ���⼭�� Properties�÷�����
		//Ű���� �޾ƿͼ� set�÷����� ����� ����غ���. �ֳ� map�迭�� Ű���� �˾Ƶ�
		//���� �����µ� ������ ���� ������ ���̴�.
		
		Set<Object> keys = props.keySet();
		
		for(Object objkey : keys) {
			String key = (String)objkey;		//Ű���� String�̹Ƿ� ����ĳ���� ��.
			String value = System.getProperty(key);		//Ű���� �̿��Ͽ� �� ���
			System.out.println("[" + key + "]" + value);
		}
	}
}
