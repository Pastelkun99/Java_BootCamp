package sec08_verify;

public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("MySql DB���� �˻�");
	}

	@Override
	public void insert() {
		System.out.println("MySql DB���� ����");
	}

	@Override
	public void update() {
		System.out.println("Mysql DB�� ����");
	}

	@Override
	public void delete() {
		System.out.println("Mysql DB���� ����");
	}

	
}