package sec02_hashcode;

public class Key {

	int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	//���� ������ ���� 1�������� ������ �ƴ϶�
	//���� ���Բ� �ؾ��Ѵ�. (Hash�ø���)
	@Override
	public int hashCode() {
		System.out.println("Hashcode");
		return this.number;
	}
	
	//2�������� equals�� ȣ���ؼ� �� ���� �񱳸� �ؼ� ������ ���� �������� �����Ѵ�.
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		if(obj instanceof Key) {
			Key compareKey = (Key)obj; //����ȯ
			//�����ϴºκ�
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
}
