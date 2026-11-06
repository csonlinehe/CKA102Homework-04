package HW2;

public class Arithmetic1000 {
	
			
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int x = 1; x <= 1000; x++) {
			if (x % 2 == 0) {//最簡單的一題，符合就讓sum做 = x + x 求總和。
				sum += x;
			}	
		}
			System.out.println("1～1000的偶數和總共為：" + sum);
	}
}
