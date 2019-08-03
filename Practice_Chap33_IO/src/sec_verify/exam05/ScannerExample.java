package sec_verify.exam05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws FileNotFoundException {
		
		Score score = new Score();
		Scanner sc = new Scanner(new File("C:\\Users\\PC\\Desktop\\WorkSpace\\Practice_Chap33 (IO기반 입출력)\\src\\sec_verify\\exam05\\scoredata.txt"));

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				Scanner sc2 = new Scanner(line).useDelimiter(",");
				score.add(sc2.next(), sc2.next(), sc2.nextInt(), sc2.nextInt(), sc2.nextInt());
			}
			score.displayList();
			sc.close();
	}
}
