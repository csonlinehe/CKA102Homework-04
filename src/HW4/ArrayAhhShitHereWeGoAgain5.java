
package HW4;

import java.util.Scanner;

public class ArrayAhhShitHereWeGoAgain5 {

    void main() {

        Scanner scanner = new Scanner(System.in);

        IO.println("Please enter the year:");
        	int yyyy = scanner.nextInt();
        IO.println("Please enter the month (1-12):");
        	int mm = scanner.nextInt();
        IO.println("Please enter the day:");
        	int dd = scanner.nextInt();
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        	if (yyyy < 1 || mm < 1 || mm > 12) {//驗證年份及月份

        		IO.println("Invalid year or month!");
        		return;
        			}

        if (yyyy % 400 == 0 ||(yyyy % 4 == 0 && yyyy % 100 != 0)) {//判斷閏年
        	days[1] = 29;
        	
        		}
        if (dd < 1 || dd > days[mm - 1]) { //驗證日期
        	IO.println("Invalid day!");
        	return;
        	}
        int totalDays = 0;//計算該年的第幾天
        	for (int i = 0; i < mm - 1; i++) {
        		totalDays += days[i];
        	}
        			totalDays += dd;

        				IO.println("The day is the " + totalDays + "th" + " day of the year!");//輸出結果
        					scanner.close();
    }
}

//請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//(提示1：Scanner，陣列)
//(提示2：需將閏年條件加入)
//(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)