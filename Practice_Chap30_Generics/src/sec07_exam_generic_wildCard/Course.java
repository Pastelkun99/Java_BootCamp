package sec07_exam_generic_wildCard;

// ����(Course)�� ������ �� �ִ� ����� ���׸� Ÿ������ ������.
// �ƿ﷯, � ����� ������ �� �� �ƹ��� �𸣴� ��Ȳ�� ��Ÿ��.
public class Course<T> {

	private String name;			// ������. ���� ���� ���
	private T[] students;			// ������ ���� �� �ִ� ��������
	
	//������
	public Course(String name, int capacity) {
		this.name = name;
		
		// �̰� �ȵȴ�. ���� TŸ���� �������� �ʾҴµ� �迭�� ��� ���� �� �ִ°�?
		// this.students = new T[capacity];
		
		// �� �κ��� ���� �����ؾ��Ѵ�. �̷� �ڵ尡 ���� �����Ѵ�.
		this.students = (T[])(new Object[capacity]);
		// ���� �� �� �ִ� ������Ʈ�� ���� ������ٰ� ����ȯ ��.
	}

	// ������ getter
	public String getName() {
		return name;
	}

	// ������ getter
	public T[] getStudents() {
		return students;
	}

	// �������� �߰����� ��.
	public void add(T t) {
		// ����ִ� ������ �������� �߰��ϱ� ���� �ڵ�
		for(int i = 0; i<this.students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
