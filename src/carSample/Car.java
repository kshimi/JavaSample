package carSample;

public class Car extends Vehicle {
	private static int numCars = 0;

	private int num;
	private double tankCapacity;
	private double gas;

	// ナンバーとタンク容量が指定されないとき、ナンバー0、タンク50Lにします。
	public Car() {
		this(0, 50.0);
	}

	// 車のナンバーとタンク容量を設定します。
	public Car(int num, double tankCapacity) {
		this.speed = 40;
		this.gas = 0.0;
		this.num = num;
		this.tankCapacity = tankCapacity;

		System.out.println("お車の用意ができました。");

		numCars++;
	}

	// 距離を指定して車を走らせます
	@Override
	double run(double distance) {
		double consumeGas = distance * 0.1;
		if (addGas(consumeGas * -1)) {
			System.out.println(distance + "km 走りました。");
			return timeRequired(distance);
		}

		return 0.0;
	}

	// 給油量を指定して給油します。
	void refuel(double amount) {
		if (addGas(amount)) {
			System.out.println(amount + "l 給油しました。");
		}
	}

	// 車の状態を表示します。
	@Override
	void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("車のタンク容量は" + tankCapacity + "l です。");
		System.out.println("ガソリン量は" + gas + "です。");

		System.out.println("車は全部で" + numCars + "台あります。");
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
