package OOPsConcepts;

class construct{
	int a,b,c;
	construct(){//constructor with no arguments
	a=6;
	b=4;
	System.out.println("val of a is "+a + " and b is" +b );
	}
	construct(int a, int b){
		this.a=a;
		this.b=b;
	}
	construct(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void large() {
		int c= (a>b)?a:b;
		System.out.println("the largest of two number is :"+c);
	}
	void largestofthree() {
		int d = (a>b && a>c)?a:c;
		System.out.println("largest of three is :"+d);
	}
}


public class Myconstructor {
	public static void main(String[] args) {
			construct obj1 = new construct();
			construct obj2 = new construct(6,8);
			construct obj3 = new construct(5,7,9);
			obj1.large();
			obj2.large();
			obj3.largestofthree();
	}
}
