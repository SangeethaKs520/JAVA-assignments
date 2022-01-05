/* Write a program to Create class Employee with
Employee(int id,String name)
Employee(int id,String name,float sal)
void display();
If the employee object has to be created with only two parameters, then initial default salary should be
Rs 20000. Display employee details by using display method. */

package assign2;

public class Employee {
	int empId;
	String empName;
	float salary;
	
	public Employee(int id,String name){
		empId = id;
		empName = name;
		salary = 20000f;
	}
	
	public Employee(int id,String name,float sal){
		empId = id;
		empName = name;
		salary = sal;
	}
	
	void display(){
		System.out.println("empId : " + empId + " "+"empName : " + empName + " " + "salary : "+ salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(123, "Navya");
		Employee emp2 = new Employee(456, "Indu",25000);
		emp1.display();
		emp2.display();
		
		

	}

}
