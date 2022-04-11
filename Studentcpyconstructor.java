package OOPsConcepts;

class Student{
	String name;
	int id;
	static String collegename;
	public Student(String string, int i) {
		this.id=i;
		this.name=string;
	}
	
	public Student(Student sp) {
		this.id = sp.id;
		this.name = sp.name;
	}

	static {
		collegename = "sri krishna adithya college";
	}
	void display() {
		System.out.println("student name is:"+name);
		System.out.println("student id is:"+id);
		System.out.println("college :"+collegename);
	}
}

public class Studentcpyconstructor {
	public static void main(String[] args) {
		Student sp = new Student("shabari",001);
		Student sp1 = new Student (sp);
		sp.display();
		sp1.display();
	}

}
