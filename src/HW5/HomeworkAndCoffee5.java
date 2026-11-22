package HW5;

public class HomeworkAndCoffee5 {

	public void genAuthCode(){

//		int x[] = new int [1];
//		int y = 0;
//		for (int i = 0; i <x.length; i++) {
//			y = (int)(Math.random() * 10);
//			
//		}
//					IO.print(y);
					
					for(int i = 0; i < 4; i++) {
						String s[] = {"abcdefghijklmnopqrstuvwxyz", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
						int row = (int)(Math.random() *2);
						int column = (int)(Math.random() * 26);
							char c = s[row].charAt(column);
								IO.print(c);
								int y = (int)(Math.random() * 10);
								IO.print(y);
					}
	}
					
					
	
			
	
	
	
	
		void main() {
			HomeworkAndCoffee5 x = new HomeworkAndCoffee5();
			x.genAuthCode();
		}
}
//身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//與數字的亂數組合，如圖：

//將陣列定義為亂數？！ 
//將陣列定義為大小寫亂碼？！


//IM SO FUCKING BAD AT THIS LOL