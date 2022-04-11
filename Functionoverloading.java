package OOPsConcepts;

class overloading{
	void display() {
		System.out.println("no argument");
	}
	void display(int i) {
		System.out.println("one integer argument");
	}
	void display(float f) {
		System.out.println("one float argument");
	}
	void display(int i, int j) {
		System.out.println("two integer argument");
	}
	void display(float f, float f1) {
		System.out.println("two float argument");
	}
	void display(float f, int i) {
		System.out.println("two argument float and int");
	}
	void display(int j, float f1) {
		System.out.println("two argument int and float");
	}
}

public class Functionoverloading {
	public static void main(String[] args) {
		overloading ovrload = new overloading();
		ovrload.display();
		ovrload.display(4);
		ovrload.display(6.4f);
		ovrload.display(8.5f, 5.8f);
		ovrload.display(6, 8);
		ovrload.display(4.5f, 2);
		ovrload.display(3, 2.3f);
	}
}
