package sec_verify01;

public class Myexp {
	
		int base = 0;
		int exp = 0;
		int a = 1;
	
		
		public void getValue() 
		{
			  for(int i=1; i <= exp; i++) {
				  a = a*base;
				}
		}
}
