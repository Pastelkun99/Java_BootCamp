package sec_verify04_3;

public class ToiletUsingThread extends Thread{

	private Toilet toilet;
	private String irum;
	
	public ToiletUsingThread(Toilet t, String name) {
		this.toilet = t;
		irum = name;
		
	}
	@Override
	public void run() {
		toilet.use(irum);
	}
}
