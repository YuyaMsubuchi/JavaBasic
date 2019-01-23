package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();

		car1.serialNo = 10000;
	
		car1.color = "Red";

		car1.gasoline = 50;
		

		car2.serialNo = 20000;
		
		car2.color = "White";

		car2.gasoline = 30;
		
		
		car3.serialNo = 30000;
		
		car3.color = "Blue";

		car3.gasoline = 40;
		
		final int distance = 300;

		int far = 0;
		
		int n = 0;
		while(distance > far) {
			far += car1.run();
			n += 1;
			
			if(car1.gasoline < 0) {
			break;
			}
		}
		
		if(car1.gasoline < 0) {
			System.out.println("目的地に到達できませんでした。");
		} else {
			System.out.println("目的地にまで" +n +"時間かかりました。残りのガソリンは" + car1.gasoline +"リットルです");

		}
		while(distance > far) {
			far += car2.run();
			n += 1;
			
			if(car2.gasoline < 0) {
			break;
			}
		}
		
		if(car2.gasoline < 0) {
			System.out.println("目的地に到達できませんでした。");
		} else {
			System.out.println("目的地にまで" +n +"時間かかりました。残りのガソリンは" + car2.gasoline +"リットルです");

		}
		while(distance > far) {
			far += car3.run();
			n += 1;
			
			if(car3.gasoline < 0) {
			break;
			}
		}
		
		if(car3.gasoline < 0) {
			System.out.println("目的地に到達できませんでした。");
		} else {
			System.out.println("目的地にまで" +n +"時間かかりました。残りのガソリンは" + car3.gasoline +"リットルです");

		}
	}
}
