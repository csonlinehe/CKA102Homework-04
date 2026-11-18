package HW3;

import java.util.Scanner;

public class HowRandomizedCanItBe {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Comrade, welcome to the GuessNumberSession. As always, each wrong guess gets you closer to the Gulag. So be cautious with it!");
			System.out.println("");
			System.out.println("Enter Your Name, comrade: ");
			String Name = scanner.nextLine();
			if (Name.equals("Stalin") || Name.equals("stalin") || Name.equals("STALIN") ){
				System.out.println("Comrade... Due to your blatant disrepect to the supreme leader. Your date of execution is... Today!");
				System.exit(0);
			}
			System.out.println("");
			System.out.println("Let the game begin, comrade " + Name + "." + " Guess a number (0~100)!");
			
			int a =(int)(Math.random() * 101); 
			int b = scanner.nextInt();
				if (0 > b || b > 100) {
					System.out.println("Invalid number, comrade " + Name + ". Gulag Time!");
					System.exit(0);
				}
				if (b == a) {
					System.out.println("*Comrade Stalin is in shock and awe of your masculine presence. You have made yourself famous!");
					System.out.println("");
					System.out.println("*Comrade Stalin presents you a suspicious trophy of a man in tracksuits. Do you receive it? (Y/Y)");
					scanner.nextLine();
					String Choice = scanner.nextLine();
					if (Choice.equals("Y")) {
						System.out.println("You receive a rather large house down south Moscow, housing shitloads of Vodka!");
					} else {
						System.out.println("In Soviet Russia, you don't accept the prize, the prize ACCEPTS you! *You still receive the trophy anyway!");
					}
				}
				int c = 0; //A counter of DOOM... Be careful, ye who enters...
				while (b != a && c < 14) {
					if (b < a) {
						System.out.println("Guess a bigger number!");
					} else if (b > a) {
						System.out.println("Guess a smaller number!");
					}
						scanner.nextLine();
						b = scanner.nextInt();
						c++;
						if (0 > b || b > 100) {
							System.out.println("Invalid number, comrade " + Name + ". Gulag Time!");
							System.exit(0);
						}
					if (c == 9) {
						System.out.println("Last 5 attempts, comrade " + Name + "!");
					} else if (c == 14) {
						System.out.println("Comrade Stalin is upset with your performance... Your next stop will be... Gulag!");
					}
				if (b == a) {
					System.out.println("Congratulations! Comrade " + Name + ", your extra slavness has paid off. You guessed the exact number right!");
					System.out.println("");
					System.out.println("*Comrade Stalin presents you a suspicious trophy of a man in tracksuits. Do you receive it? (Y/N)");
					scanner.nextLine();
					String Choice1 = scanner.nextLine();
					if (Choice1.equals("Y")) {
						System.out.println("Very Nice! Comrade " + Name + ". You will be an honorable Soviet Russian citizen hereafter!");
						System.out.println("Comrade Stalin gives you a warm hug of Soviet welcome. Your Slavness is now off the charts");
					} else {
						System.out.println("Comrade Stalin is disappointed in you. Your yearly ration of tracksuits is now revoked!");
						System.out.println("");
						System.out.println("Your ordeal to the Gulag has now begun! Embark on your 'journey', comrade " + Name + " !");
					}
					
				}
				}
		}
}
		

		



//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//對則顯示正確訊息，如圖示結果：
//(提示：Scanner，亂數方法，無窮迴圈)
//(進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案