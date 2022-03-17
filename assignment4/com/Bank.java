package assignment4.com;

public interface Bank {
	int getBalance();
}
class BankA implements Bank{
	public int getBalance() {
		return 100;
}
}
class BankB implements Bank{
	public int getBalance() {
		return 150;
	}
}
class BankC implements Bank{
	public int getBalance() {
		return 200;
	}
}
class Bank1{

	public static void main(String[] args) {
		Bank a=new BankA();
		Bank b=new BankB();
		Bank c=new BankC();
		
		System.out.println(a.getBalance());
		System.out.println(b.getBalance());
		System.out.println(c.getBalance());
	}

}
