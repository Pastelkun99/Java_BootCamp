package sec_verify04;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
			
	public List<Board> getBoardList() {
		
		List<Board> box = new ArrayList<>();
		Board b1 = new Board("이것이 자바다", "신용권");
		Board b2 = new Board("자바의 정석", "남궁성");
		Board b3 = new Board("명품 자바프로그래밍", "황기태");
		
		box.add(b1);
		box.add(b2);
		box.add(b3);
		
		System.out.println("현재 list에 저장되어있는 Board 객체 입니다.");
		System.out.println(b1.getTitle() + " : " + b1.getContent());
		System.out.println(b2.getTitle() + " : " + b2.getContent());
		System.out.println(b3.getTitle() + " : " + b3.getContent());
		return null;
	}
}
