package constructor.example2;


public class Constructor {

	public Constructor() {  //Default Constructor
		System.out.println("Constructor running");
	}
	public Constructor(int a) { //Parameterized Constructor
		System.out.println("Constructor running"+" "+a);
	}
	
	public static void main(String[] args) {
		Constructor d1=new Constructor();
		Constructor d2=new Constructor(5);
	}
}
