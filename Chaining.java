package constructor.example7;

public class Chaining {

	public Chaining() {
		System.out.println("Defult Constructor");
	}
	public Chaining(String str) {
		this();
		System.out.println("Parameterized Constructor");
	}
	public Chaining(String str, int num) {
		this("Hello");
		System.out.println("Parameterized constructor with double args");
		
	}
	public Chaining(int num1, int num2, int num3) {
		
		this("Hello", 2);
		System.out.println("Parameterized constructor with three args");
	}
	
	public static void main(String[] args) {
		Chaining c1=new Chaining(5,5,15);
	}
}
