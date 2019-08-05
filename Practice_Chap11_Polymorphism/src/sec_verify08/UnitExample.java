package sec_verify08;

public class UnitExample {

	public static void main(String[] args) {
		Unit[] units = new Unit[5];
		units[0] = new AirForce("제1 전투비행단");
		units[1] = new AirForce("제 38 전투비행전단");
		units[2] = new Navy("서애 류성룡함");
		units[3] = new Army("맹호부대");
		units[4] = new Army("무적태풍부대");

		for (int i = 0; i < units.length; i++) {
			units[i].attack();

			if (units[i] instanceof Army) {
				Army army = (Army) units[i];
				army.tank();
				System.out.println();
			} else if (units[i] instanceof Navy) {
				Navy navy = (Navy) units[i];
				navy.incleus();
				System.out.println();
			} else {
				AirForce airforce = (AirForce) units[i];
				airforce.bombing();
				System.out.println();
			}
		}
	}
}
