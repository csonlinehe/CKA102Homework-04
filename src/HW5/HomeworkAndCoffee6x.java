package HW5;

public class HomeworkAndCoffee6x {

	public void getAuthCode() {
		
		String s = new String ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"); 
		
		char c;
		
			for (int i = 0; i <8; i++) {
				int z = (int)(Math.random() * s.length() );
				c = s.charAt(z);
				IO.print(c);
			}
	}
	
	
	void main() {
		HomeworkAndCoffee6x r = new HomeworkAndCoffee6x();
		
		r.getAuthCode();
	}
}
