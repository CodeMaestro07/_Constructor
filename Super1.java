package constructor.example5;


public class Super1 extends Super {
	int num=110;
	
	void printNumber() {
		System.out.println(super.num);
	}
	
	public static void main(String[] args) {
		Super1 s1=new Super1();
		s1.printNumber();
	}
}
