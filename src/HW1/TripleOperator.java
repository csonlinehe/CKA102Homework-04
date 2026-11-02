package HW1;

public class TripleOperator {
	public static void main(String[] args) {
		
		System.out.println(5 + 5);//正常整數計算，故數字為10 ^^
		System.out.println(5 + '5');//這裡的char要對應到Unicode編碼，為53，而整數相加後，為58。
		System.out.println(5 + "5");//這裡的string因為是與整數相加，會成為55，後面的5為字串～
	}
}
