package sec_verify01;

public class MonitorExample {

	public static void main(String[] args) {

		Monitor mon = new Monitor("LG", 23, 500000);
		System.out.println("제조사 : " + mon.company + "이며, " + mon.inch + "인치이고, 가격은 " + mon.price + "입니다.");

	}

}
