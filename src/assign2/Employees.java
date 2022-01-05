/*Write a program to create a class Employee with id, name and salary. With the getter and
setter methods initialize the employee object. When you invoke toString() method, it should
display the id, name and salary.
Example:
Id=100;
Name =”miani”
Salary=25000;
If invoked toString() method ,the output should be id =100 and name = miani and
Salary = 25000 */

package assign2;

public class Employees {
	int id;
	String name;
	double salary;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString(){
		return  "empId : " + id + " "+"empName : " + name + " " + "salary : "+ salary;
	}
	

	public static void main(String[] args) {
		Employees emp1 = new Employees();
		
		emp1.setId(100);
		emp1.setName("Miani");
		emp1.setSalary(25000);
		
		System.out.println("Employee details: " + emp1.toString());

		
	}

}
