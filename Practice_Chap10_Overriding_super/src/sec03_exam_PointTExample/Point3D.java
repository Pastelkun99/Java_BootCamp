package sec03_exam_PointTExample;

public class Point3D extends Point {

	int z = 30;
	
	//Point3D(int x, int y, int z)�� ȣ���Ѵ�.
	public Point3D() {
		this(100, 200, 300);
	}
	
	//Point(int x, int y)�� ȣ���Ѵ�.
	public Point3D(int x, int y, int z) {
		super(x, y); 		//����Ŭ���� ������ ȣ��
		this.z = z;			//�ڽ��� ������� �ʱ�ȭ
	}
}
