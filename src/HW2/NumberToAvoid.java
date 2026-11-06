package HW2;

public class NumberToAvoid {
	public static void main(String[] args) {
		//阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
		//輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		System.out.print("阿文可以選擇的數字有： ");
		//找出含4的數，個位數，至40~49；找十位數為4、個位數為4之數
		int count = 0;
		
		for (int x = 1; x <= 49; x++) {
				if (x % 10 == 4 || x / 10 == 4) { //餘數為四（4%10仍為4）以及除以十得4的數！
					continue;//找不符合的數，也就是阿文要的可用數字
				
		}
				System.out.printf("%d ", x);
				count++;//計算總共符合條件的數
	}
				System.out.println("");
				System.out.println("可用的數字總數為： " + count);
}
}