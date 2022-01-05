/*
Class Emp
empId int
empName string
designation string
basic double
hra double readOnly
Methods
printDET()
calculateHRA()
printDET() methods will show details of the EMP.
calculateHRA() method will calculate HRA based on basic.
There will be 3 designations supported by the application.
If designation is “Manager” - HRA will be 10% of BASIC
if designation is “Officer” - HRA will be 12% of BASIC
if category is “CLERK” - HRA will be 5% of BASIC
Have constructor to which you will pass empId, designation, basic and hra.
And check whether the BASIC is less than 500 or not. If it is less than 500 raise a custom exception as given 
below:
Create LowSalException class with proper user message to handle BASIC less than 
500. */

package assign4;

import java.util.Scanner;

 class LowSalException extends Exception{
	
	public LowSalException(String msg){
		super(msg);
	}
}

public class Emp {
	int empId;
	String empName;
	String Designation;
	double basic;
	double hra;
	
	
	
	static void validate(int basic) throws LowSalException{
			if(basic<500){
				throw new LowSalException("Basic salary is less than 500");
			}
			
		}

	
	Emp(int empId,String empName, String designation, double basic){
		this.empName = empName;
		this.empId = empId;
		this.Designation = designation;
		this.basic = basic;
	}
	
	public void calculateHRA(){
		System.out.println(this.Designation);
		if (this.Designation == "Manager"){
			
			this.hra = (10/100)*this.basic;
			System.out.println("hra of manager" + this.hra);
		}
		else if(this.Designation == "Officer"){
			this.hra = (20/100)*this.basic;
			System.out.println("hra of Officer" + this.hra);
		}
		else if(this.Designation == "CLERK"){
			this.hra = (5/100)*this.basic;
			System.out.println("hra of CLERK" + this.hra);
		}
	}
	
	void printDET(){
		System.out.println("EmpName "+ this.empName + " Designation" + this.Designation + " basic " + this.basic  );
		
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter emp name");
		String name = scan.nextLine();
		System.out.println("enter emp id");
		int id = scan.nextInt();
		scan.nextLine();
		System.out.println("enter designation");
		String designation = scan.nextLine();
		System.out.println("enter emp basic salary");
		int basicSalary = scan.nextInt();

		
		try{
			validate(basicSalary);
		}
		catch(LowSalException e){
			System.out.println("basic salary is very low "+ e);
		}
		
		Emp obj = new Emp(id, name, designation, basicSalary);
//		obj.printDET();
		System.out.println(id + name + designation + basicSalary);
		obj.calculateHRA();
		
	}

}
