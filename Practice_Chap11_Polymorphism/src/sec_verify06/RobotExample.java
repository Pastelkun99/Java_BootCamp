package sec_verify06;

public class RobotExample {

	public static void main(String[] args) {

		action(new DanceRobot());
		action(new DrawRobot());
		action(new SongRobot());

	}

	public static void action(Robot r) {

		if (r instanceof DanceRobot) {
			DanceRobot cr = (DanceRobot) r;
			cr.dance();
		}
		if (r instanceof SongRobot) {
			SongRobot sr = (SongRobot) r;
			sr.song();
		}
		if (r instanceof DrawRobot) {
			DrawRobot dr = (DrawRobot) r;
			dr.draw();
		}
	}
}
