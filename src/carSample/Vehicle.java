package carSample;

public abstract class Vehicle {
	protected double speed;

	public double run(int destination) {
		double distance = cityDistance(destination);

		return run(distance);
	}

	// 指定された距離を走り、要した時間を返す
	abstract double run(double distance);

	// 乗り物の状態を表示します
	abstract void show();

	// スピードと走行距離から所要時間を求める
	protected double timeRequired(double distance) {
		return distance / speed;
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
