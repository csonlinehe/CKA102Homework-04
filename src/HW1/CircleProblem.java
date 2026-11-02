package HW1;

public class CircleProblem {
	public static void main(String[] args) {
		
		final double PI = 3.1415; 
		int radius = 5;
		
		double perimeter = PI * (radius*2); // 也可以用10，但還是主打一個手把手操作
		double area = PI * (radius * radius);//同上= =
		
		System.out.printf("此圓周長為：%.3f\n" + "此圓面積為：%.3f\n", perimeter, area);
	}
}
