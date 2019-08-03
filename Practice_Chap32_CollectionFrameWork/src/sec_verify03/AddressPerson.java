package sec_verify03;

import java.util.ArrayList;

public class AddressPerson {

	private ArrayList<Person> db;
	
	public AddressPerson() {
		System.out.println("데이터 베이스가 생성되었습니다!");
		this.db = new ArrayList<Person>();
		System.out.println();
	}
	
	public int isExists(String s) {
		Person personclass;
		int index = -1;
		
		for(int i = 0; i < db.size(); i++) {
			personclass = db.get(i);
			if((personclass.getName()).equals(s)) {
				index = i;
			}
		}
		return index;
	}
	
	public void print() {
		System.out.println("현재 고객 리스트 입니다.");
		System.out.println("-------------------------------------------------------------------------");
		for(int i = 0; i<db.size(); i++) {
			System.out.println("이름 : " + db.get(i).getName() + ", 나이 : " + db.get(i).getAge() + ", 연락처 : " + db.get(i).getHandPhone());
		}
		System.out.println("-------------------------------------------------------------------------");
	}
	
	public void insert(Person p) {
		int index = isExists(p.getName());
		if(index == -1) {
			db.add(p);
		}
		else {
			System.out.println(p.getName() + "님은 이미 등록된 회원입니다.");
		}	
		System.out.println();
	}
	
	public void delete(String s) {
		int index = isExists(s);
		if(index == -1) {
			System.out.println(s + "라는 고객은 존재하지 않습니다.");
		}
		else {
			db.remove(index);
			System.out.println(s + "라는 고객을 삭제하였습니다.");
		}
		System.out.println();
	}
	
	public void update(String s, Person p) {
		int index = isExists(s);
		if(index == -1) {
			System.out.println(s + "라는 고객은 존재하지 않습니다.");
		}
		else {
			db.set(index, p);
			System.out.println(s + "씨 정보를 업데이트 했습니다.");
		}
		System.out.println();
	}
	
	
	
	
	
}
