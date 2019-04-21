package carSample;

public class Sample1 {
	public static void main(String[] args) {
		// 車のナンバー、タンク容量を指定して準備します。
		Car car1 = new Car(1234, 45.8);
		car1.refuel(40.5);
		car1.show();

		// 距離を指定して走ります。(引数が double)
		double remainGas = car1.run(130.7);
		if (remainGas < 10) {
			System.out.println("ガソリンが少なくなったので給油します。");
			car1.refuel(20.0);
		}

		car1.refuel(15.0);

		// 行き先を指定して走ります。(引数が int)
		car1.run(1);

		// ナンバー、タンク容量は指定しないで車を準備します。
		Car car2 = new Car();
		car2.show();

		// 広島までの走行距離を確認します。
		double toHiroshima = Car.cityDistance(2);
		System.out.println("広島までの距離は " + toHiroshima + "km です。");
	}
}
