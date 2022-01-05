/* Create class Employee
int empNumber;
String name;
float exp;
Employee(int empNumber,String name,float exp);
While creating employee object , if exp is >2.5 years and exp < 3.6 years, create an object 
otherwise throw IllegalArgumentException .*/

package assign4;

import java.util.Scanner;

public class Employee {
	int empNumber;
	String name;
	float exp;
	
	Employee(int empNumber,String name,float exp){
		this.empNumber = empNumber;
		this.name = name;
		this.exp = exp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the employee emp name");
		String empName = scan.nextLine();
		System.out.println("Enter the employee number");
		int empNumber = scan.nextInt();
		System.out.println("Enter the employee experiance");
		float exp = scan.nextFloat();
		try{
			if(exp > 2.5 && exp <3.6){
				Employee obj = new Employee(empNumber,empName,exp);
				
				System.out.println("Object created");
				
			}
			else{
				throw new IllegalArgumentException("Experiance must be greater than 2.5 and 3.6 years");
			}
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		
	}
}
