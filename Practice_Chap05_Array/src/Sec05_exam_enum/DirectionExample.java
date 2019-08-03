package Sec05_exam_enum;

public class DirectionExample {

	public static void main(String[] args) {
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf(Direction.class, "EAST");
		//enumŬ������ �����޼����� valueof�� ȣ����. �� ���ڰ��� Enum��.class, "������ ���"��.
		
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		
		System.out.println("d1=" + d1);
		System.out.println("d2=" + d2);
		System.out.println("d3=" + d3);

		System.out.println("d1 == d2 ? " + (d1==d2));
		System.out.println("d1 == d3 ? " + (d1==d3));
		System.out.println("d1.equals(d3) ? " + d1.equals(d3));
		//System.out.println("d2 > d3 ?" + (d1 > d3)); ����
		
		System.out.println("d1.compareTo(d3) ? " + d1.compareTo(d3));
		System.out.println("d1.compareTo(d2) ? " + d1.compareTo(d3));
		
		switch(d1) {
			case EAST:
				System.out.println("The direction is EAST.");
				break;
			case SOUTH:
				System.out.println("The direction is SOUTH.");
				break;
			case WEST:
				System.out.println("The direction is WEST.");
				break;
			case NORTH:
				System.out.println("The direction is NORTH.");
				break;
			default:
				System.out.println("Invalid diretion.");
				break;
		}
		//������ Ÿ��.values() ���ϰ��� ������ ��ü �迭�̴�.
		Direction[] dArr = Direction.values();
		//���� for��
		for(Direction d : dArr) {
			System.out.printf("%s = %d%n", d.name(), d.ordinal());
		}//for(Direction d : Direction.values())
	}

}
