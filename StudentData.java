package constructor.example4;

public class StudentData {

	
	private int id;
	private String name;
	private int age;
	
	StudentData(){
		//Default Constructor
		id=100;
		name="Anderson";
		age=34;
	}
	StudentData(int num1, String str, int num2){
		//Parameterized Constructor
		id=num1;
		name=str;
		age=num2;
	}
	
	//Getter and Setter methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
