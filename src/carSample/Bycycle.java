package carSample;

public class Bycycle extends Vehicle {
	private int num;

	public Bycycle() {
		this(0);
	}

	public Bycycle(int num) {
		this.speed = 12;
		this.num = num;

		System.out.println("自転車の用意ができました。");
	}

	@Override
	double run(double distance) {
		System.out.println(distance + "km 走りました。");

		return timeRequired(distance);
	}

	@Override
	void show() {
		System.out.println("自転車のナンバーは" + num + "です。");
	}
}
