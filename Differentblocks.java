package OOPsConcepts;

import java.util.Scanner;

public class Differentblocks {
	static String cmpyname;
	String ename;
	int salary;
	int id;
	static {
		cmpyname = "zoho";
		System.out.println("static details already exist");
	}
	
	{// anonymous block
		System.out.println("The employee details are:");
	}
	//constructor block
	Differentblocks(){
		Scanner sc = new Scanner (System.in);
		System.out.println("enter ename:");
		ename = sc.nextLine();
		System.out.println("enter sal:");
		salary = sc.nextInt();
		System.out.println("enter id: ");
		id = sc.nextInt();
		
	}
	public static void main(String[] args) {
		System.out.println("main method");
		Differentblocks obj1 = new Differentblocks();
		System.out.println(obj1.cmpyname);
	}
}
