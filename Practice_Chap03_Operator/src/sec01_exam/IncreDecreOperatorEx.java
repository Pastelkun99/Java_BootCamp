package sec01_exam;

public class IncreDecreOperatorEx {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		
		System.out.println("-----------------------------");
		System.out.println("x = " + x++); // x = 11
		x++; //후위증가 x = 12
		++x; //전위증가 x = 13
		
		System.out.println("x = " + x++); // x = 14
		System.out.println("x = " + x); // x = 14
		
		System.out.println("------------------------------");
		y--; // y = 9
		--y; // y = 8
		System.out.println("y = " + y); // y = 8
		
		/*System.out.println("------------------------------");
		 int z;
		 z = x++;
		 System.out.println("z = " + z);
		 System.out.println("x = " + x);
		 
		 System.out.println("-------------------------------");
		 z = ++x;
		 System.out.println("z = " + z);
		 System.out.println("x = " +x);
		 
		 System.out.println("------------------------------");
		 z = (++x) + (y++);
		 System.out.println("z = " + z);
		 System.out.println("x = " + x);
		 System.out.println("y = " + y);*/
		 		 
		

	}

}
