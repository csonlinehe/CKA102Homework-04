package HW2;

public class Arithmetic1_10 {
	public static void main(String[] args) {
		
		int sum = 1; //任何數乘以0皆為0，因此設為1。
		for (int x = 1; x <= 10; x++) {
			sum *= x ;
		}
		System.out.println("1～10的連續乘積總共為：" + sum);
	}
}
