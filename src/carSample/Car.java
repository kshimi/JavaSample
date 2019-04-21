package carSample;

public class Car {
	private int num;
	private double tankCapacity;
	private double gas = 0.0;

	// 距離を指定して車を走らせます
	double run(double distance) {
		double consumeGas = distance * 0.1;
		if (addGas(consumeGas * -1)) {
			System.out.println(distance + "km 走りました。");
		}

		return gas;
	}

	// 給油量を指定して給油します。
	void refuel(double amount) {
		if (addGas(amount)) {
			System.out.println(amount + "l 給油しました。");
		}
	}

	// 車のナンバーとタンク容量を設定します。
	void makeCar(int num, double tankCapacity) {
		this.num = num;
		this.tankCapacity = tankCapacity;
	}

	// 車の状態を表示します。
	void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("車のタンク容量は" + tankCapacity + "l です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}

	// ガソリンの残量をチェックしてガソリンの量を計算します。
	private boolean addGas(double amount) {
		if (amount > 0 && (gas + amount) > tankCapacity) {
			System.out.println("タンクが溢れます！ 給油を中止します。");
			return false;
		} else if (amount < 0 && (gas + amount) < 0.0) {
			System.out.println("ガス欠になります！ 止まります。");
			return false;
		}

		gas += amount;
		return true;
	}
}
