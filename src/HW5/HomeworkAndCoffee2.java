package HW5;

import java.math.*;

public class HomeworkAndCoffee2 {

		public void randAvg() {
			
				
				int x;
				int avg = 0;
				int sum = 0;
				for(int i = 0; i <= 9; i++) {
					x = (int)(Math.random() * 101);
					System.out.printf("%d ", x);
					sum += x;	
				}
					avg = (int) sum / 10;
					IO.println("平均值為:" + avg);
				}
	
	
	
	
	
		void main() {
			HomeworkAndCoffee2 x = new HomeworkAndCoffee2();
			x.randAvg();
		}
}


//• 請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：