package sec_verify14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapLoginExample {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("perpear", "4321");
		map.put("fly", "1012");
		map.put("numeric", "1234");
		map.put("fish", "15244");
		map.put("ruby", "00145");
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��� �ּ���.");
			System.out.print("���̵� >> ");
			String id = scan.nextLine();
			System.out.print("��й�ȣ >> ");
			String password = scan.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println(id + "���� �α��� �Ǿ����ϴ�!");
					break;
				}
				else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
					System.out.println();
				}
			}
			else {
				System.out.println("�Է��Ͻ� ���̵�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				System.out.println();
			}
			
		}
		scan.close();
	}
}
