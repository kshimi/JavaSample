package carSample;

public class Sample1 {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.num = 1234;
		car1.gas = 20.2;

		car1.show();

		double remainGas = car1.run(130.7);
		if (remainGas < 10) {
			System.out.println("ガソリンが少なくなったので給油します。");
			car1.refuel(20.0);
		}
		car1.show();
	}
}
