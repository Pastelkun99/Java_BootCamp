package sec_verify16;

import java.util.Iterator;
import java.util.TreeSet;

public class StudentExample {

	public static void main(String[] args) {
		
		TreeSet<Student> treeSet = new TreeSet<Student>();
		
		treeSet.add(new Student("신은혁", 96));
		treeSet.add(new Student("김주성", 86));
		treeSet.add(new Student("김동주", 68));
		treeSet.add(new Student("이대호", 100));
		treeSet.add(new Student("김호주", 59));
		treeSet.add(new Student("이주희", 77));
		
		
		System.out.println("전체 학생 리스트입니다.");
		System.out.println();
		
		Iterator<Student> it = treeSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		
		Integer score = null;
		String name = null;
		score = treeSet.last().getScore();
		name = treeSet.last().getName();
		
		System.out.println();
		System.out.println("최고 점수 : " + score + " 학생 이름 : " + name);
	}
}
