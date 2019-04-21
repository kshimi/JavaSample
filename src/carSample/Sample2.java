package carSample;

public class Sample2 {

	public static void main(String[] args) {
		PatrolCar p1 = new PatrolCar();
		p1.refuel(50);
		p1.show();

		p1.patrolRun(50);

		p1.setSiren(true);
		p1.patrolRun(20);
	}

}
