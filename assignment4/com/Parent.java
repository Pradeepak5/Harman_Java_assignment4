package assignment4.com;

public abstract class Parent {
	abstract void message();

}
class Son extends Parent{
	void message() {
		System.out.println("this is First Subclass.");
	}
}
class Daughter extends Parent{
	void message() {
		System.out.println("This is Second Subclass.");
	}
}

class Main{
	public static void main(String args[]) {
		Daughter d=new Daughter();
		Son s=new Son();
		d.message();
		s.message();
	}
}