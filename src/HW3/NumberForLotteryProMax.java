package HW3;

import java.util.Scanner;

public class NumberForLotteryProMax {
		
	
		
	void main() {
		Scanner scanner = new Scanner(System.in);
		IO.println("Please input one number (1-9)");	
		int y = scanner.nextInt();
		if (y <= 0 || y >= 10 ) { // 0跟10都不能輸入
			IO.println("Invalid input, please retry!");
			return;
		}
		int[] numbers = new int[49];
		int z = 0;
		for (int x = 1; x <= 49; x++) {
			if (x % 10 == y || x == y || x / 10 == y ) {
			continue;
		} 
			numbers[z] = x;
			IO.print(x + " ");
			z++;
		
		}
			
			
			IO.println("");
			IO.println("The total pickable count of numbers: " + z);
	
	        int remaining = z;//可選總數

	        IO.println("Your six lottery numbers:");

	        for (int i = 0; i < 6; i++) {

	            int index = (int) (Math.random() * remaining);

	            IO.print(numbers[index] + " ");

	            numbers[index] = numbers[remaining - 1];

	            remaining--;
	        }

	        IO.println("");

			
			scanner.close();
	}
			
}






//• 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//的號碼與總數，如圖：
//(提示：Scanner)
//(進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)