package HW4;

public class ArrayAhhShitHereWeGoAgain6 {

		void main() {
			
			int test[][] = {{10, 35, 40,100, 90, 85, 75, 70},
						   	{37, 75, 77, 89, 64, 75, 70, 95},
						   	{100,70, 79, 90, 75, 70, 79, 90},
						   	{77, 95, 70, 89, 60, 75, 85, 89},
						   	{98, 70, 89, 90, 75, 90, 89, 90},
						   	{90, 80,100, 75, 50, 20, 99, 75}		};
				
				int Dude[] = new int [8]; //所有怪人都在這，會用在第二次回圈找人
				for (int i = 0; i < test.length; i++) {
					
					int max = test [i][0]; //總要先找一個能比的數字，就從陣列第一數開始
					
					for (int j = 0; j < test[i].length; j++) {//先比大小！
						if (test[i][j] > max ) {
							max = test[i][j] ;//max是變數，所以迴圈比對之後一定是最大
						}			
						}
								IO.print(max + " ");
								IO.println("");
						
							for (int j = 0; j < test[i].length; j++) {//
							if (test[i][j] == max) {
								Dude[j]++; //把這怪人的最高分次數逐一次增加
								
							}
								
							}		
}									
				IO.println("Student Num:        	   [1, 2, 3, 4, 5, 6, 7, 8]");
				IO.println("Times for Top-scoring:     " + java.util.Arrays.toString(Dude));//黑科技
		}
				
}	


//班上有8位同學，他們進行了6次考試結果如下：
//請算出每位同學考最高分的次數