package sec_verify01;

public class SamsungCar {

		public String company ; //= "Samsung";
		public String model ; //= "SM5";
		public String color ; //= "white";
		public int maxSpeed ; // = 240;
		
		
		public String getcompany() {
			return this.company;
		}
		public String getmodel() {
			return this.model;
		}
		public String getcolor() {
			return this.color;
		}
		public int maxSpeed() {
			return this.maxSpeed;
		}
		
		public void setcompany(String company) {
			if(company != "Samsung") {
				System.out.println("삼성차가 아닙니다.");
				return;
			}
			this.company = "Samsung";
		}
		public void setmodel(String model) {
			if(model != "SM5") {
				System.out.println("삼성차 모델이 아닙니다.");
				return;
			}
			this.model = "SM5";
		}
		public void setcolor(String color) {
			if(color != "white") {
				System.out.println("조건에 안맞음");
				return;
			}
			this.color = "white";
		}
		public void setmaxSpeed(int maxSpeed) {
			if(maxSpeed < 0) {
				System.out.println("속도는 음수일수가 없네요. 뒤로 갈까요?");
				return;
			}
			this.maxSpeed = maxSpeed;
		}
		@Override
		public String toString() {
			String str = this.getcompany() + "회사의 " + this.color + "색상의 " + this.model + "모델이며, " + this.maxSpeed + "의 최고 속도를 자랑합니다.";
			return str;
		}
		
}
