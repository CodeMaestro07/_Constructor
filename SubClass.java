package constructor.example11;

public class SubClass extends SuperExplicit{
	SubClass(){
		super();
		System.out.println("Constructor of subclass");
	}
	void display() {
		System.out.println("Hello");
		
	}
	
	public static void main(String[] args) {
		SubClass obj=new SubClass();
		obj.display();
	}
}
