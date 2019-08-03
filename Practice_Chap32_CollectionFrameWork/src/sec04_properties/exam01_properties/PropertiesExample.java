package sec04_properties.exam01_properties;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception {
		//Properties Ű�� ���� String���� ������� map�÷����̴�.
		Properties properties = new Properties();
		
		// PtopertiesExample�� ������ ���� ���� ������Ƽ ������ �����ϹǷ� �Ʒ��� ���� �н� ����
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		
		//�����ڵ�� ���� ��ΰ� ���
		System.out.println(path);
		// path = URLDecoder.decode(path, "EUC-KR");
		
		// �ѱ۷� ���� ��ΰ� ���
		path = URLDecoder.decode(path, "utf-8"); 		//�ѱ� ����
		System.out.println(path);
		// ù��° ��� �д� ��(������)
		properties.load(new FileReader(path));
		// �� ��° ��� �д� ���(������)
		properties.load(new FileReader("C:\\Users\\PC\\Desktop\\WorkSpace\\Practice_Chap32 (�÷��� �����ӿ�ũ)\\src\\sec04_properties\\exam01_properties\\PropertiesExample.java"));
		
		// Ű�� �ְ� ���� ����
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		//���� ���� ����غ�
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
	}
}
