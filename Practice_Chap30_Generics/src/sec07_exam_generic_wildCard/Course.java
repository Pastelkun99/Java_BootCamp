package sec07_exam_generic_wildCard;

// 과정(Course)을 수강할 수 있는 대상을 제네릭 타입으로 선언함.
// 아울러, 어떤 대상이 수강을 할 지 아무도 모르는 상황을 나타냄.
public class Course<T> {

	private String name;			// 과정명. 국어 수학 등등
	private T[] students;			// 과정당 들을 수 있는 수강생수
	
	//생성자
	public Course(String name, int capacity) {
		this.name = name;
		
		// 이거 안된다. 아직 T타입이 결정되지 않았는데 배열을 어떻게 만들 수 있는가?
		// this.students = new T[capacity];
		
		// 이 부분을 보고 숙지해야한다. 이런 코드가 자주 등장한다.
		this.students = (T[])(new Object[capacity]);
		// 모든게 들어갈 수 있는 오브젝트로 먼저 만들었다가 형변환 함.
	}

	// 과정명 getter
	public String getName() {
		return name;
	}

	// 수강생 getter
	public T[] getStudents() {
		return students;
	}

	// 수강생을 추가시켜 줌.
	public void add(T t) {
		// 비어있는 공간에 수강생을 추가하기 위한 코드
		for(int i = 0; i<this.students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
