package HW3;

import java.util.Scanner;

public class SovietGuessTheNumberGame {
	
	public static class TimeToGuessNumber{
		String yourName;
		
		Scanner scanner = new Scanner(System.in); //建立呼叫名稱
		
		public void getGreeting() {
			System.out.println("Please Enter Your Name, Comrade!");
			yourName = scanner.nextLine();
			if (yourName.equals("Stalin") || yourName.equals("STALIN") || yourName.equals("stalin")) {
				System.out.println("Comrade. Your date of execution is... Tomorrow!");
				System.exit(0);
			}
		}
//		public void guessNumber() { //多餘的，留著當作紀念
//			System.out.println("Welcome, comrade " + yourName + ". You are now going to guess the numbers. (0~100)"); 
//			int d = scanner.nextInt();
//			 }
		
		public void guessNumberMethod() { //超大串方法
			System.out.println("Welcome, comrade " + yourName + ". You are now going to guess the numbers. (0~100)"); 
			int a = scanner.nextInt();
			int b =(int)(Math.random() * 101); 
			
				if (0 > a || a > 100) {
					System.out.println("Invalid number, comrade " + yourName + ". Gulag Time!");
					System.exit(0);
				}
				if (a == b) {
					System.out.println("*Comrade Stalin is in shock and awe of your masculine presence. You have made yourself famous!");
					System.out.println("");
					System.out.println("*Comrade Stalin presents you a suspicious trophy of a man in tracksuits. Do you receive it? (Y/Y)");
					scanner.nextLine();
					String Choice = scanner.nextLine();
					if (Choice.equals("Y") || Choice.equals("y")) {
						System.out.println("You receive a rather large house down south Moscow, housing shitloads of Vodka!");
					} else {
						System.out.println("In Soviet Russia, you don't accept the prize, the prize ACCEPTS you! *You still receive the trophy anyway!");
					}
				}
				int c = 0; //A counter of DOOM... Be careful, ye who enters...
				while (a != b && c < 14) {
					if (a < b) {
						System.out.println("Guess a bigger number!");
					} else if (a > b) {
						System.out.println("Guess a smaller number!");
					}
						scanner.nextLine();
						a = scanner.nextInt();
						c++;
						if (0 > a || a > 100) {
							System.out.println("Invalid number, comrade " + yourName + ". Gulag Time!");
							System.exit(0);
						}
					if (c == 9) {
						System.out.println("Last 5 attempts, comrade " + yourName + "!");
					} else if (c == 14) {
						System.out.println("Comrade Stalin is upset with your performance... Your next stop will be... Gulag!");
					}
				if (a == b) {
					System.out.println("Congratulations! Comrade " + yourName + ", your extra slavness has paid off. You guessed the exact number " + "(" + b + ")" + " right!");
					System.out.println("");
					System.out.println("*Comrade Stalin presents you a suspicious trophy of a man in tracksuits. Do you receive it? (Y/N)");
					scanner.nextLine();
					String Choice1 = scanner.nextLine();
					if (Choice1.equals("Y") || Choice1.equals("y")) {
						System.out.println("Very Nice! Comrade " + yourName + ". You will be an honorable Soviet Russian citizen hereafter!");
						System.out.println("");
						System.out.println("Comrade Stalin gives you a warm hug of Soviet welcome. Your Slavness is now off the charts");
					} else if (Choice1.equals("N") || Choice1.equals("n")) {
						System.out.println("Comrade Stalin is disappointed in you. Your yearly ration of tracksuits is now revoked!");
						System.out.println("");
						System.out.println("Your ordeal to the Gulag has now begun! Embark on your 'journey', comrade " + yourName + " !");
					}
					
				}
		}
	}
	}
	public static void main(String[] args) {
			TimeToGuessNumber player = new TimeToGuessNumber();
			player.getGreeting();
			player.guessNumberMethod();
	}
	
}
