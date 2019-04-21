package carSample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 車を4台分用意します。
		Car cars[] = {
				new Car(1, 50.0),
				new Car(2, 25.0),
				new Car(3, 70.5),
				new Car(4, 65.3)
		};

		System.out.println("0～" + (cars.length - 1)
				+ "のうち、何号車を走らせますか？");

		// 走らせる車を選ぶ
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int carNum = Integer.parseInt(br.readLine());
		if (carNum < 0 || carNum > cars.length) {
			System.out.println("申し訳ございません、そのお車は準備致しておりません。");
		} else {
			driveCar(cars[carNum]);
		}
	}

	private static void driveCar(Car c) throws NumberFormatException, IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			c.show();
			System.out.println("  0:東京まで走ります 1:名古屋まで走ります 2:広島まで走ります");
			System.out.println("  10以上:入力した分だけ給油します");
			System.out.println("  マイナス:走行を中止します");
			System.out.println("  -------------------------");

			int action = Integer.parseInt(br.readLine());
			if (action < 0) {
				break;
			} else if (action < 10) {
				c.run(action);
			} else {
				c.refuel(action);
			}
		}
	}
}
