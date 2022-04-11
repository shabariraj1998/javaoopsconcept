package OOPsConcepts;


import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;

class Employer{
	String name;
	int salary;
	String id;
		
	void input() throws IOException{
//Scanner sc = new Scanner(System.in);
	InputStreamReader is=new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(is);

		//name = sc.nextLine();
		//salary = sc.nextInt();
		//id = sc.next();	
	System.out.println("enter name:");
	name = br.readLine();
	System.out.println("enter salary:");
	salary = Integer.parseInt(br.readLine());
	System.out.println("enter id");
	id = br.readLine();
	}
	void output() {
		System.out.println("Employe name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("id: "+id);
	}
}

public class Employeedetails {
	public static void main (String args[]) throws IOException {
	Employer eob1 = new Employer();
	Employer eob2 = new Employer();
	eob1.input();
	eob1.output();
	eob2.input();
	eob2.output();
	}
}
