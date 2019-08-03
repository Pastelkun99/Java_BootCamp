package sec_verify11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<Student> set = new HashSet<>();
		
		set.add(new Student(1,"½ÅÀºÇõ"));
		set.add(new Student(2,"±è¿¬¾Æ"));
		set.add(new Student(1,"¼Õ¿¬Àç"));
		set.add(new Student(2,"±è¿¬¾Æ"));
		set.add(new Student(5,"±èµ¿¿ì"));
		set.add(new Student(4,"È²ÈñÁ¤"));
		set.add(new Student(1,"½ÅÀºÇõ"));
		set.add(new Student(3,"¹Ú±Ù¿¹"));
		
		int size = set.size();
		System.out.println("ÃÑ °´Ã¼ ¼ö : " + size);
		
		Iterator<Student> it = set.iterator();
		while(it.hasNext()) {
			Student temp = it.next();
			System.out.println("ÇÐ¹ø : " + temp.getStudentNum() + " ÀÌ¸§ : " + temp.getName());
		}
		
	}
}
