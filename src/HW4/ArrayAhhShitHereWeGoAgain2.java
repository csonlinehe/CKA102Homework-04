package HW4;

public class ArrayAhhShitHereWeGoAgain2 {

	
		void main() {
			
			String s = new String("Hello World");
			String S[] = {"H", "e", "l", "l", "o", " ", "W", "o", "r", "l", "d"};
			for (int i = S.length -1; i >= 0 ; i--) { //length得-1，因為...i從0開始，不減會ArrayOutOfBound...
				
				IO.print(S[i]);
			}
		}
}









//請建立一個字串，經過程式執行後，輸入結果是反過來的
//例如String s = “Hello World”，執行結果即為dlroW olleH
//(提示：String方法，陣列)