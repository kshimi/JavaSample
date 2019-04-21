package carSample;

public class Sample1 {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.makeCar(1234, 42.5);
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

	}
}
