
package HW3;

import java.util.Scanner;

public class IfThisIsTriangleOrNah {

    static class IAmTheOneWhoJudges {
    		
    	
        void TriangleTest(int a, int b, int c) {

            if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
                System.out.println("Congratulations, Comrade! You have made a Triangle! Comrade Stalin approves of you!");
                System.out.println("");
                if (a == b && b == c) {
                    System.out.println("Mother Russia will be proud. This is a Regular Triangle. Extra Bonus Slav point for you!");
                } else if (a == b || b == c || a == c) {
                    System.out.println("The Triangle is a Isosceles Triangle! Now you are just flexing...");
                } else if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {              
                    System.out.println("Oтлично, a Right Triangle! The Mother Russia welcome your arithmetic prowess!");
                } else {
                    System.out.println("Comrade, this is still a solid triangle albeit hideous.");
                }

            } else {
                System.out.println("Comrade, you have failed the Soviet Triangle test! Next stop, Gulag for you, comrade.");
            }
        	}
    		
    			 void NameTheParameters() { 
    				Scanner scanner = new Scanner(System.in);
    				System.out.println("Comrade, for that comrade Stalin requires, you need to tell me three numbers to see if it's a triangle! if you fail this, comrade Stalin will not be proud.");
					System.out.println(" ");

					System.out.println("Enter The Length, Comrade: ");
					int a = scanner.nextInt();
					System.out.println("Then The Width? ");
					int b = scanner.nextInt();
					System.out.println("You're doing well, comrade. Now, Height: ");
					int c = scanner.nextInt();
					 TriangleTest(a, b, c);
					 
					 scanner.close();
    			}
    	    		
    			}
    		public static void main(String[] args) {
    			Scanner scanner = new Scanner(System.in);
    			

    					IAmTheOneWhoJudges YOLO = new IAmTheOneWhoJudges();

    						
    						YOLO.NameTheParameters();
    						

    						scanner.close();
    }
    		}
