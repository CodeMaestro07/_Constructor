package constructor.example1;

public class ConsOverloading {
	
	int value1;
	int value2;
	
	ConsOverloading(){
		value1=20;
		value2=30;
		System.out.println("Inside 1st Constructor");
	}
	ConsOverloading(int a){
		value1=a;
		System.out.println("Inside 2nd Constructor");
	}
	ConsOverloading(int a, int b){
		value1=a;
		value2=b;
		System.out.println("Inside 3rd Constructor");
	}
	public void display() {
		
		System.out.println();
		System.out.println("Value1 ="+" "+value1);
		System.out.println("Value2 ="+" "+value2);
	}
	
	public static void main(String[] args) {
		
		ConsOverloading d1=new ConsOverloading();
		ConsOverloading d2=new ConsOverloading();
		ConsOverloading d3=new ConsOverloading();
		
		d1.display();
		d2.display();
		d3.display();
	}
}
