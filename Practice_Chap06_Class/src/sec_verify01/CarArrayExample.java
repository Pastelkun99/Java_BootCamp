package sec_verify01;

public class CarArrayExample {

	public static void main(String[] args) {
		
		Car[] cArr = new Car[5];
		int i = 0;
		
		for(i=0; i<cArr.length; i++) {
			cArr[i] = new Car(); //Attach 작업
			System.out.println("cArr[" + i + "] 인스턴스 생성");
		}
		
		for(i=0; i<cArr.length; i++) {
			cArr[i].amp = i;
			System.out.printf("cArr["+ i +"] = %d\n", cArr[i].amp);
		}
	}

}
