package sec02_exam_starCraftUnit;

public class UnitExample {

	public static void main(String[] args) {
		
		//Unit unit = new Unit(); �߻�Ŭ������ �ν��Ͻ� ���� �Ұ�
		System.out.println("-----------------------------------------------");
		Tank tank = new Tank();
		tank.move(100, 300);
		tank.seizemode();
		tank.stop("��ũ", 300, 400);
		
		System.out.println("-----------------------------------------------");
		
		Marine marine = new Marine();
		marine.move(200, 500);
		marine.stimPack();
		marine.stop("����", 300, 400);
		
		System.out.println("-----------------------------------------------");
		DropShip dp = new DropShip();
		dp.move(500, 600);
		dp.load();
		dp.unload();
		dp.stop("�����", 200, 100);
		
		System.out.println("-----------------------------------------------");
	}

}