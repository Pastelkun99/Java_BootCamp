package sec02_secondArray;

public class Array_Example02 {

	public static void main(String[] args) {
		
		int[][] score = new int[][] { 
									{ 100, 100, 100},
									{ 20, 20, 20},
									{ 30, 30, 30},
									{ 40, 40, 40},
									{ 50, 50, 50}
									};
									
		// ��������
									
	 int kortotal = 0;
	 int engtotal = 0;
	 int mathtotal = 0;
	 
	 int totalsum =0;
	 float averagesum = 0.0f;
	 
	 System.out.println("��ȣ\t����\t����\t����\t����\t��� ");
	 System.out.println("==================================================");
	 
	 for(int i=0; i<score.length; i++) {
		 
		 int sum = 0; //���κ� ����
		 float avg = 0.0f;
		 
		 kortotal += score[i][0];
		 engtotal += score[i][1];
		 mathtotal += score[i][2];
		 
		 System.out.printf("%3d", i+1);
		 
		 for(int j = 0; j < score[i].length; j++) {
			 sum += score[i][j];
			 System.out.printf("\t%d", score[i][j]);
		 }
		 
		 totalsum += sum;
		 avg = sum/(float)score[i].length; // ��հ��
		 averagesum += avg;
		 System.out.printf("\t%d \t%.2f%n", sum, avg);
	 }
	 averagesum /= (float)score.length;
	 System.out.println("==================================================");
	 System.out.printf("����\t%d\t%d\t%d\t%d\t%.2f", kortotal, engtotal, mathtotal, totalsum, averagesum);
	}

}
