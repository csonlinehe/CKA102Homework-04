package HW2;

public class UprightTriangleOfLetters {
	public static void main(String[] args) {
		
	 int x;
	 int y;
	 char a = 'A';
	 char b = 'B';
	 char c = 'C';
	 char d = 'D';
	 char e = 'E';
	 char f = 'F';
	 				for (x = 1; x < 7; x++) {
	 					for (y = 1; y <= x; y++) {
	 						if (x == 1){
	 						System.out.print(a);
	 					} else if (x == 2){
	 						System.out.print(b);
	 					} else if (x == 3) {
	 						System.out.print(c);
	 					} else if (x == 4) {
	 						System.out.print(d);
	 					} else if (x == 5) {
	 						System.out.print(e);
	 					} else {
	 						System.out.print(f);
	 					}
	 				}
	 				System.out.println();
	 				}
}
}
//請設計一隻Java程式，輸出結果為以下：
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF

//可能不是最聰明的方法...