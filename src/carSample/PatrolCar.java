package carSample;

public class PatrolCar extends Car {
	private boolean siren;

	public PatrolCar() {
		super();

		siren = false;
	}

	// サイレンのON/OFFを切り替える
	public void setSiren(boolean siren) {
		this.siren = siren;
	}

	// パトロール走行する
	public double patrolRun(double distance) {
		if (siren) {
			System.out.println("ウ～～～！ ウ～～～！ ウ～～～！");
		}

		return super.run(distance);
	}
}
