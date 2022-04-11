package OOPsConcepts;

class cpyconstruct{
	int a,b;
	cpyconstruct(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("val of a is "+a);
		System.out.println("val of b is "+b);
	}
	cpyconstruct(cpyconstruct firstobj) {
		this.a = firstobj.a;
		this.b = firstobj.b;
		System.out.println("copyconstrct of a is:"+this.a);
		System.out.println("copyconstrct of b is:"+this.b);
	}
}

public class Copyconstructor {
	public static void main(String[] args) {
		cpyconstruct firstobj = new cpyconstruct(6,2);
		cpyconstruct secondobj = new cpyconstruct(firstobj);
	}

}
