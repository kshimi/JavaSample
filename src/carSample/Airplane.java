package carSample;

public class Airplane extends Vehicle implements IHasEngine {
	private double tankCapacity;
	private double gas;

	public Airplane() {
		this.speed = 1200;
		this.tankCapacity = 127000.0;
		this.gas = 0.0;

		System.out.println("飛行機のご用意が出来ました。");
	}

	@Override
	public void refuel(double amount) {
		if (addGas(amount)) {
			System.out.println(amount + "l 給油しました。");
		}
	}

	@Override
	double run(double distance) {
		double consumeGas = distance * 8.3;
		if (addGas(consumeGas * -1)) {
			System.out.println(distance + "km 飛びました。");
			return timeRequired(distance);
		}

		return 0.0;
	}

	@Override
	void show() {
		System.out.println("飛行機のタンク容量は" + tankCapacity + "l です。");
		System.out.println("燃料残量は" + gas + "です。");
	}

	// 航空燃料の残量をチェックして燃料残量を計算します
	private boolean addGas(double amount) {
		if (amount > 0 && (gas + amount) > tankCapacity) {
			System.out.println("タンクが溢れます！ 給油を中止します。");
			return false;
		} else if (amount < 0 && (gas + amount) < 0.0) {
			System.out.println("ガス欠になります！ 飛行を中止します。");
			return false;
		}

		gas += amount;
		return true;
	}
}
