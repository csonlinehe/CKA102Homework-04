package HW4;

public class ArrayAhhShitHereWeGoAgain3 {

	
		void main() {
		
			String S[] = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
				int total = 0;
				IO.println("The vowels detected within the Strings are: ");
				IO.println("");
				for (int i = 0; i < S.length; i++) {
					for (int j = 0; j < S[i].length(); j++) {
						char letter = S[i].charAt(j); //用前一個迴圈跑String，第二個迴圈跑charAt找char！
							if(letter == 'a'|| letter == 'e'|| letter == 'i'|| letter == 'o'|| letter == 'u') {
								IO.print(letter);
								total++;
					}
				}
								
		}
								IO.println("");
								IO.println("");
								IO.println("The total count of vowels within the Array: " + (int)total);
		}
}





//有個字串陣列如下 (八大行星)：
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//(提示：字元比對，String方法)