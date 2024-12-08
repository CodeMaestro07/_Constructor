package constructor.example8;


public class SubClass extends ConstructorCallParent{

	SubClass(){
		System.out.println("Constructor of subclass");
	}
	SubClass(int num){
		System.out.println("Constructor with arg");
	}
	void display() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		SubClass c1=new SubClass();
		c1.display();
		
		SubClass c2=new SubClass(10);
		c2.display();
		
	}
}
