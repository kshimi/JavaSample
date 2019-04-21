package carSample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 乗り物を5台分用意します。
		Vehicle vehicles[] = {
				new Car(1, 50.0),
				new Bycycle(2),
				new Bycycle(3),
				new PatrolCar(),
				new Airplane()
		};

		System.out.println("0～" + (vehicles.length - 1)
				+ "のうち、何号車を走らせますか？");

		// 走らせる車を選ぶ
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int vehicleNum = Integer.parseInt(br.readLine());
		if (vehicleNum < 0 || vehicleNum > vehicles.length) {
			System.out.println("申し訳ございません、そのお車は準備致しておりません。");
		} else {
			driveVehicle(vehicles[vehicleNum]);
		}
	}

	private static void driveVehicle(Vehicle v) throws NumberFormatException, IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			v.show();
			System.out.println("  0:東京まで走ります 1:名古屋まで走ります 2:広島まで走ります");
			System.out.println("  10以上:入力した分だけ給油します");
			System.out.println("  マイナス:走行を中止します");
			System.out.println("  -------------------------");

			int action = Integer.parseInt(br.readLine());
			if (action < 0) {
				break;
			} else if (action < 10) {
				System.out.println(v.run(action) + " 時間かかりました。");
			} else {
				if (v instanceof IHasEngine) {
					((IHasEngine)v).refuel(action);
				}
			}
		}
	}
}
