package HW4;

import java.util.Scanner;

public class ArrayIdontExist { 
	
	void main() {
	Scanner scanner = new Scanner(System.in);	

//		 WOW YOU EXIST 
//		 WOW YOU EXIST 
//		 WOW YOU EXIST 
//		 WOW YOU EXIST 
//		 WOW YOU EXIST 
//		 WOW YOU EXIST 
//		 WOW YOU EXIST 
//		 WOW YOU EXIST 
//	 	 WOW YOU EXIST 
//	 	 WOW YOU EXIST 
//	 	 WOW YOU EXIST 
//	 	 WOW YOU EXIST 
//	 	 WOW YOU EXIST 
//	 	 WOW YOU EXIST 
//	 	 WOW YOU EXIST 
//	 	 WOW YOU EXIST 
//		 WOW YOU EXIST 
//	 	 WOW YOU EXIST 
//		 WOW YOU EXIST 
//		 WOW YOU EXIST 
//		 WOW YOU EXIST 
		
		
//			int a[] = {3, 4, 5, 6, 7, 20};
//				
//				int max = a[0];//要放這不然吃不到變數= = 區域變數
//				for (int i = 1; i < a.length; i++) {
//					
//					if(a[i] > max) {
//						max = a[i];
//						
//					}
//					
//				}
//					IO.println("WTF" + max); //最大值

			//陣列中的大小取值
				
//			int b[][] = {{35, 67, 99, 103, 65, 46},
//						{66, 56, 32, 23, 89, 79},
//						{12, 98, 73, 34, 51, 52}};
//			
//				for	(int i = 0; i < b.length; i++) {
//					int max2 = b[i][0];
//					for(int j = 0; j < b[i].length; j++) {
//						if (b[i][j] > max2) {
//							max2 = b[i][j];
//						}
//					}
//					IO.println("WTF Bro" + max2);//還是最大值
//				}
//		
//				int empno[] = {14, 27, 35, 42, 56};
//				int cash[] = {1000, 750, 2400, 500, 1800};
//				
//				IO.println("So how much he wants to borrow again? This Ah-Wen ffs: ");
//					
//					int Voluntolds = 0;
//					int reqCash = scanner.nextInt();
//					
//					if (reqCash <= 0) {
//						IO.println("Comrade, your Math is not mathing!");
//						IO.println("Next time, you need to exist!");
//						System.exit(0);
//					}
//				for (int i = 0; i < cash.length; i++) {
//					if (reqCash <= cash[i]) {
//						System.out.println(empno[i]);
//						System.out.println(cash[i]);
//						Voluntolds++;
//					}
//					
//				}
//						IO.println("Your count of the volunteering guys: " + Voluntolds);
////				
//	有個一維陣列如下：
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	(提示：陣列，length屬性)
//						
//					int avg = 0;
//					int sum = 0;
//				
//					int x[] = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
//					for (int i = 0 ; i < x.length; i++) {
//						sum += x[i];
//						
//						
//					}
//					avg = sum / x.length; 
//					for (int i = 0 ; i < x.length; i++) {
//					if (x[i] > avg) {
//						IO.print(x[i] + " ");
//					
//					}		
//}					
//					
//					IO.println("");						
//					IO.println(sum);
//					IO.println(avg);
	
	//
//  int [] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
// for int sum 
	//判斷閏年 if (yyyy % 400 == 0 ||(yyyy % 4 == 0 && yyyy % 100 != 0)) { 
	
	//有個字串陣列如下 (八大行星)：
	//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
	//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
	//(提示：字元比對，String方法)
	
//		String a[] = {"venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
////		char letter = S[i].charAt(j);
//		int total = 0;
//			for (int i = 0; i < a.length; i++) {
//				for (int j = 0; j < a[i].length(); j++) {
//					char letter = a[i].charAt(j);
//						if (letter == 'a' || letter == 'e'|| letter == 'i'|| letter == 'o' || letter == 'u') {
//							IO.print(letter);
//							total++;
//						}
//				}
//			}
//							IO.println("");
//							IO.println(total);
//	
		
//	int x [] = {23, 24, 25, 26, 27};
//		
//		int avg = 0;
//		int sum = 0;
//			for (int i = 0; i < x.length; i++) {
//				 sum += x[i];
//				 
//				
//			}
//				avg = sum/x.length;
//					IO.println(avg);
//					IO.println(sum);
//	
	
					
//						
//					int x [][] = {{21, 23, 25, 26, 57, 43, 56},
//								 {34, 56, 67, 79, 89, 100, 25},
//								{45, 41, 53, 78, 96, 12, 55},
//								 {10, 11, 34, 46, 56, 68, 79}};
//								int avg2 = 0;
//								int sum2 = 0;
//						for (int i = 0; i < x.length; i++) {
//								int g = x[i][0]; //比較大小從這裡開始；
////								int sum = 0;
//								sum2 = 0;//每列
//	//							int avg = 0;
//								avg2 = 0;//每列
//							for (int j = 0; j < x[i].length; j++) {
//								sum2 += x[i][j];
////								sum += x[i][j];
//								avg2 = sum2 / x[i].length;
////								avg = sum / (x.length * x[i].length);//總total後的avg在這！
//							}
//								IO.println(avg2);
////								IO.println(avg);
////								IO.println(sum);
//								IO.println(sum2);
//						}
//								IO.println(avg2);
						
	
	
	
	
	
}
}