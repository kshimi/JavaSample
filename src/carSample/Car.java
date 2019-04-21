package carSample;

public class Car {
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
		this.gas = 0.0;
		this.num = num;
		this.tankCapacity = tankCapacity;

		System.out.println("お車の用意ができました。");

		numCars++;
	}

	// 行き先を指定して車を走らせます。
	double run(int destination) {
		double distance = cityDistance(destination);

		return run(distance);
	}

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

	// 車の状態を表示します。
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

	// 行き先番号ごとの走行距離を求めます。
	public static double cityDistance(int destination) {
		switch (destination) {
		case 0:
			System.out.println("東京駅まで走ります。");
			return 35.5;
		case 1:
			System.out.println("名古屋まで走ります。");
			return 340.5;
		case 2:
			System.out.println("広島まで走ります。");
			return 800.0;
		default:
			System.out.println("行き先が分かりませんでした。");
			return 0.0;
		}
	}
}
