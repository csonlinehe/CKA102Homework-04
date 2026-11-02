package HW1;

public class InvestmentFormulaShit {
	public static void main(String [] args) {
		
		int investment = 1500000;
		double interest = 0.02; //公式為 FV = PV (1+利率)平方比
		
		double FV = investment * Math.pow(1 + interest, 10);//Math.pow(x+y,z)
		
		System.out.printf("預期本金加利息為：%.0f", FV);//不取小數點^^
	}
}
