package sec01_verify;

public class Exercise03 {

	public static void main(String[] args) {
		
		int pencils = 534;
		int students = 30;
		int pencilsPerStudent;
		
		pencilsPerStudent = pencils / students;
		System.out.println("�л� �� ���� ������ ���� �� : " + pencilsPerStudent);
		
		pencilsPerStudent = pencils % students;
		System.out.println("���� ���� �� : " + pencilsPerStudent);

	}

}
