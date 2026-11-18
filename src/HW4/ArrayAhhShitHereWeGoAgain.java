package HW4;

public class ArrayAhhShitHereWeGoAgain {

		void main() {
			
			int x[] = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
				
			int sum = 0;
			
				for (int i = 0; i < x.length; i++) {
					sum += x[i];
					}
				
			
			
			int average = sum/x.length;
			IO.println("所有元素之平均值為：" + average);
			IO.println("");
			IO.println("比平均值還大之元素如下：");
					for (int i = 0; i < x.length; i++) {
						if (x[i] > average) {
							IO.print(x[i] + " ");
						}
			}
		}
}
//有個一維陣列如下：
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//(提示：陣列，length屬性)