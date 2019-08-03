package sec05_verify;

public class StudentAnonymous {

	Student field = new Student("문수빈") {
		
		public void goSchool() {
			System.out.println(this.name + "이 등교합니다.");
			System.out.println("==========================================");
		}
		
		@Override
		public void wake() {
			System.out.println("==========================================");
			System.out.println("필드(멤버변수)의 초기값으로 생성된 자식객체");
			System.out.println(this.name + "이 6시에 일어납니다.");
			this.goSchool();
		}
		
	};
	
	public void method1() {
		
		Student localVar = new Student("배한규") {
			public void goMoving() {
				System.out.println(this.name + "가 영화를 보러갑니다.");
				System.out.println("==========================================");
			}
			
			@Override
			public void wake() {
				System.out.println("==========================================");
				System.out.println("로컬변수의 초기값으로 생성된 자식객체");
				System.out.println(this.name + "가 9시에 일어납니다.");
				this.goMoving();
			}
		};
		localVar.wake();
	}

	public void method2(Student stu) {
		stu.wake();
	}
}
