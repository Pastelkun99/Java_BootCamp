package sec_verify15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PhoneBookApp {

	final int INSERT = 1;
	final int DELETE = 2;
	final int SEARCH = 3;
	final int SHOWALL = 4;
	final int EXIT = 5;
	
	private Scanner scanner;
	private HashMap<String, Phone> map;
	
	public PhoneBookApp() {
		scanner = new Scanner(System.in);
		map = new HashMap<>();
		System.out.println(" ------------------------------------------ ");
		System.out.println("전화번호 관리 시스템을 시작합니다.");
		System.out.println(" ------------------------------------------ ");
	}
	
	public void run() {
		while(true) {
		System.out.print("1: 삽입, 2: 삭제, 3: 찾기, 4: 전체보기, 5: 종료 >> ");
		int status = scanner.nextInt();
		switch(status) {
		case INSERT : 
			insert();
			break;
		case DELETE : 
			delete();
			break;
		case SEARCH :
			search();
			break;
		case SHOWALL :
			showall();
			break;
		case EXIT :
			System.out.println("프로그램을 종료합니다...");
			System.exit(0);
			break;
		}
		}
	}
	
	public void insert() {
		System.out.print("이름 >> ");
		String name  = scanner.next();
		if(map.get(name) != null) {
			System.out.println(name + "님은 이미 등록되었습니다.");
			System.out.println();
			return;
		}
		System.out.print("주소 >> ");
		String address = scanner.next();
		System.out.print("전화번호 >> ");
		String telnum = scanner.next();
		System.out.println(name + "님이 저장되었습니다.");
		map.put(name, new Phone(name, address, telnum));
		System.out.println();
		
	}
	
	public void delete() {
		System.out.print("이름 >> ");
		String name = scanner.next();
		if(map.get(name) == null) {
			System.out.println(name + "님은 존재하지 않는 이름입니다.");
			return;
		}
		map.remove(name);
	}
	
	public void search() {
		System.out.print("이름 >> ");
		String name = scanner.next();
		if(map.get(name) == null) {
			System.out.println(name + "님은 등록되지 않은 사람입니다.");
			return;
		}
		Phone p = map.get(name);
		System.out.println(p.toString());
	}
	
	public void showall() {
		System.out.println("현재 저장되어 있는 고객 정보 리스트입니다.");
		Set<String> keyset = map.keySet();
		Iterator<String> keyit = keyset.iterator();
		while(keyit.hasNext()) {
			String key = keyit.next();
			Phone p = map.get(key);
			System.out.println(p.toString());
		}
	}
}
