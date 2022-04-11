package OOPsConcepts;

import AccessSpecifier.EmployeeAnotherpack;

class Access{
	private int id;
	String name;
	protected float Fees;
	public String collegename;
	public Access(int id, String name, float Fees, String collegename) {
		this.id = id;
		this.name = name;
		Fees = Fees;
		this.collegename = collegename;
	}
}

public class InheritEduclass {
	public static void main(String[] args) {
		Access obj1 = new Access(1,"nlsr",2300f,"SKACAS");
		//System.out.println("id="+obj1.id);
		System.out.println("name="+obj1.name);
		System.out.println("fees="+obj1.Fees);
		System.out.println("collegename="+obj1.collegename);
		
		EmployeeAnotherpack eob = new EmployeeAnotherpack(001,"shbari",53600.52f,"zoho");
		System.out.println("empcompanyname:"+eob.compname);
//		System.out.println("empid:"+eob.Empid);
//		System.out.println("empname:"+eob.name);
//		System.out.println("empsalary:"+eob.salary);
	}

}
