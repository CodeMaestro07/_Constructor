package constructor.example10;

public class Singleton {
	private static Singleton obj;
	
	private Singleton() {
	}
	public static Singleton getInstance() {
		if(obj==null) {
			obj=new Singleton();
		}
		return obj;
	}
	public void getSomeThing() {
		System.out.println("I am here...");
	}
	
	public static void main(String[] args) {
		Singleton s1= Singleton.getInstance();
		s1.getSomeThing();
	}
}
