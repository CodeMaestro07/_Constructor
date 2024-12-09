package constructor.example9;

public class ConsOverloading {
	private int rollno;
	
	ConsOverloading(){
		rollno=100;
	}
	ConsOverloading(int rno){
		this();
		rollno = rollno + rno;
	}
	public int getRollNo() {
		return rollno;
	}
	public void setRollNo(int rollno) {
		this.rollno=rollno;
	}
}
