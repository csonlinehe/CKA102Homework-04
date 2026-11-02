package HW1;

public class CountTheDays {
	public static void main(String[] args) {
		
		int seconds = 256559; //總秒數
		double days = seconds / 86400;//這裡用總秒數除86400等於總天數，餘數另計
		double hours = (seconds % 86400) / 3600;//小時的餘數
		double minutes = ((seconds % 86400) % 3600) / 60;//分鐘的餘數；
		double second = ((seconds % 86400) % 60) % 60;//剩餘餘數便是剩餘秒數
		
		
		System.out.printf("256559秒為: " + days + " 天 "+ hours + " 時 " + minutes + " 分 " + second + " 秒 ");
		
		
	}
}
