package constructor.example6;


public class Super1 extends Super{

	void display() {
		System.out.println("Child class method");
	}
	void printMsg() {
		
		display(); //Overriding method
		super.display(); //overridden method
	}
	public static void main(String[] args) {
		Super1 m1=new Super1();
		m1.printMsg();
	}
}
