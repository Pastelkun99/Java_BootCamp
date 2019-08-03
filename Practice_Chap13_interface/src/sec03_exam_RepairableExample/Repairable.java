package sec03_exam_RepairableExample;

public interface Repairable {

	//1개만 추상메서드를 가지고 있는 인터페이스 (함수적인터페이스)
	void DamageUnit(Repairable r, int Damage); // 추상메서드
}
