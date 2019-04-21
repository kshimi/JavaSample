package carSample;

public class Car {
	int num;
	double gas;

	double run(double distance) {
		gas -= (distance * 0.1);
		System.out.println(distance + "km 走りました。");

		return gas;
	}

	void refuel(double amount) {
		gas += amount;
		System.out.println(amount + "l 給油しました。");
	}

	void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}
