package sec04_exam_Polymorphism;

public class Product {

	int price;				//제품의 가격
	int bonusPoint;			//제품 구매 시 제공하는 보너스 점수
	
	//생성자
	public Product(int price) {
		this.price = price;
		//보너스 점수는 제품 가격의 10%
		this.bonusPoint = (int)(price/10.0);
	}
}
