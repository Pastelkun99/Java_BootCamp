package sec08_exam_generic_extends;

//���� Ŭ������ ���׸� Ÿ���̸� �ڼ�Ŭ������ ���׸� Ÿ���� �Ǿ�� �ϸ�, �ƿ﷯ Ÿ�� �Ķ���͸� �� ���� �� �ִ�.
public class ChildProduct<T,M,C> extends Product<T, M>{

	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
	
}
