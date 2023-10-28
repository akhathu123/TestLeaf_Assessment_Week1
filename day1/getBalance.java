package week1.day1;

public class getBalance {
	
	private double balance=500.63;
	
	public double getbalance() {
		return balance;
	}
	
	public static void main(String[] args) {
		getBalance acc = new getBalance();
		double value = acc.getbalance();
		System.out.println("The account balance is :"+value);
		
		
	}

}
