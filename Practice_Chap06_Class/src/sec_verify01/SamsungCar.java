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
				System.out.println("�Ｚ���� �ƴմϴ�.");
				return;
			}
			this.company = "Samsung";
		}
		public void setmodel(String model) {
			if(model != "SM5") {
				System.out.println("�Ｚ�� ���� �ƴմϴ�.");
				return;
			}
			this.model = "SM5";
		}
		public void setcolor(String color) {
			if(color != "white") {
				System.out.println("���ǿ� �ȸ���");
				return;
			}
			this.color = "white";
		}
		public void setmaxSpeed(int maxSpeed) {
			if(maxSpeed < 0) {
				System.out.println("�ӵ��� �����ϼ��� ���׿�. �ڷ� �����?");
				return;
			}
			this.maxSpeed = maxSpeed;
		}
		@Override
		public String toString() {
			String str = this.getcompany() + "ȸ���� " + this.color + "������ " + this.model + "���̸�, " + this.maxSpeed + "�� �ְ� �ӵ��� �ڶ��մϴ�.";
			return str;
		}
		
}
