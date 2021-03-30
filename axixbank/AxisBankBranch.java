package axixbank;

public class AxisBankBranch extends BankInfo{
	public void deposit() {
		System.out.println("Bank Saving deposit overidden");
	}
	public static void main(String[] args) {
		AxisBankBranch obj=new AxisBankBranch();
		//overridden deposit
		obj.deposit();
	}
}

