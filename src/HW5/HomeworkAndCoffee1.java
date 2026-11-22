package HW5;

import java.util.Scanner;

public class HomeworkAndCoffee1 {

	Scanner scanner = new Scanner(System.in);
	
		public void starSquare() {
			IO.println("Please input width: ");
			int width = scanner.nextInt();
			IO.println("Please input height: ");
			int height = scanner.nextInt();
			for (int i = height - 1; i >= 0; i--) {
				for (int j = width - 1; j >= 0; j--) {
					System.out.printf("*");
				}
					IO.println();
			}
		
		}
	
		public static void main(String[] args) {
			
			HomeworkAndCoffee1 x = new HomeworkAndCoffee1();
			x.starSquare();
		}
}



//
//請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如
//圖：