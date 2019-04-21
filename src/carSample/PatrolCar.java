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
	public double run(double distance) {
		if (siren) {
			System.out.println("ウ～～～！ ウ～～～！ ウ～～～！");
		}

		return super.run(distance);
	}

	// パトカーの状態を表示します
	public void show() {
		super.show();
		if (siren) {
			System.out.println("サイレンを鳴らしています！");
		}
	}
}
