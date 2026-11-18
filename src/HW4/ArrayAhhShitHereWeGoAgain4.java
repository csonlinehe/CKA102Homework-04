package HW4;

import java.util.Scanner;

public class ArrayAhhShitHereWeGoAgain4 {

		void main() {
			
			Scanner scanner = new Scanner(System.in);
			int empno[] = {25, 32, 8, 19, 27};
			int cash[] = {2500, 800, 500, 1000, 1200};
					
			IO.println("The sum Lil Wen wanna borrow from his co-workers: ");
			int ReqCash = scanner.nextInt();
				if(ReqCash <= 0) {
					IO.println("Invalid Input!");
					System.exit(0);
				}
			IO.println("The Query for Lil Wen: ");
			System.out.printf("%-5s %5s%n", "Empno", "Cash");
			IO.println("-------------------------");
			int count = 0;
			for (int i = 0; i < 1; i++) {
				for (int j = 0; j < cash.length; j++) {
					if (ReqCash <= cash[j]) {	
						System.out.printf("%-5d %5d%n", empno[j], cash[j]);
						count++;
				}
						
				}
			}
						IO.println("");
						IO.println("The Willing Guys Count(Allegedly): " + count);
						scanner.close();
		}				
						
}


//阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//表如下：
//員工編號：25、32、8、19、27
//身上現金：2500、800、500、1000、1200
//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//員工編號: 25 19 27 共 3 人!」