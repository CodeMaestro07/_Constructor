package constructor.example4;

public class StudentTestOverloading {

	public static void main(String[] args) {
		
		
		StudentData s1=new StudentData();
		
		System.out.println("Student name is: "+s1.getName());
		System.out.println("Student age is: "+s1.getAge());
		System.out.println("Student id is: "+s1.getId());
		
		System.out.println("-----------------------");
		//Object creation call Parameterized Constructor
		
		StudentData s2=new StudentData(555,"Pietersen", 25);
		
		System.out.println("Student name is "+s2.getName());
		System.out.println("Student name is "+s2.getAge());
		System.out.println("Student name is "+s2.getId());
	}
	
}
