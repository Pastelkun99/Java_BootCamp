package sec05_verify;

public class StudentExample {

	public static void main(String[] args) {

		StudentAnonymous studan = new StudentAnonymous();
		
		
		studan.field.wake();
		
		studan.method1();
	
		studan.method2(new Student("김연아") {
			
			public void study() {
				System.out.println(this.name + "가 공부합니다.");
				System.out.println("==========================================");
			}
			
			@Override
			public void wake() {
				System.out.println("==========================================");
				System.out.println("매개변수의 매개값으로 익명자손객체를 생성");
				System.out.println(this.name + "가 4시에 일어납니다.");
				this.study();
			}
		});
	}

}
