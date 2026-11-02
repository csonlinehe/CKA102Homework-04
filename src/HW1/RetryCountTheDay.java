package HW1;

public class RetryCountTheDay {
	public static void main(String[] args) {
		
		int seconds = 256559;
		int days = seconds / 86400;
		int hours = (seconds % 86400) / 3600;
		int minutes = (seconds % 3600) / 60;
		int second = (seconds % 60);
		//此為修正版本，更簡潔易懂。
		System.out.print( seconds + "秒為：\n"
		+ days + " 天\n" 
		+ hours + " 時\n" 
		+ minutes + " 分\n" 
		+ second + " 秒\n");
	}
}
