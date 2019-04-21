package carSample;

public class Sample1 {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.num = 1234;
		car1.gas = 40.2;

		car1.show();

		car1.run(5.7);
		car1.refuel(5.0);
		car1.show();
	}
}
