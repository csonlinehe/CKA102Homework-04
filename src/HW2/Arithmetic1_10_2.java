package HW2;

public class Arithmetic1_10_2 {
	public static void main(String[] args) {
		
		int sum = 1;
		int x = 1;
		while (x <= 9) { // 這裡不能照著 for 迴圈的概念寫 x <= 10，因為 x++是後執行，會多乘到一個11...
			x++;
		sum *= x;
		}
		System.out.println("1～10的連續乘積為：" + sum);
	}
}
