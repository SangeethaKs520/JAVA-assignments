/*Create class Employee with fields empno, ename, job, showInfo() and create another class with 
name EmployeeContainer which contains:
addEmployee(Employee emp);
deleteEmployee(int empno);
viewEmployee(int empno);
viewEmployees();
addEmployee(): should add the employee to the Set in the container class, if the employee is 
already existing it should display “ employee already exists”.
deleteEmployee():It should search for empno in the Set, if empno is found the employee object 
has to be removed, otherwise it should display “Sorry! Employee is not found”.
viewEmployee():It should search for empno in the Set, if empno is found, the employee details has 
to be displayed , otherwise it should display “Sorry! Employee is not found”.
viewEmployees(): First make sure Set is not empty, if it is not empty you should display all the 
employees from Set, otherwise it should display “No elements are added to the Set” */

package Collection;

public class Employee {
	int empNo;
	String eName;
	String job;
	
	public Employee(int empno, String eName, String job){
		this.empNo = empno;
		this.eName = eName;
		this.job = job;
	}
	
	
	public void showInfo(){
		System.out.println("employee no" +" "+ this.empNo);
		System.out.println("employee name" + " " + this.eName);
		System.out.println("job" + " " + this.job);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(123,"Sangeetha","Software engineer");
		Employee emp2 = new Employee(456,"Madhu","HR");
		Employee emp3 = new Employee(789,"Leela","HM");
		Employee emp4 = new Employee(789,"Leela","HM");
		
		EmployeeContainer obj = new EmployeeContainer();
		
		obj.addEmployee(emp1);
		obj.addEmployee(emp2);
		obj.addEmployee(emp3);
		obj.addEmployee(emp4);
		obj.deleteEmployee(123);
		obj.viewEmployee(456);
		obj.viewEmployees();
		obj.deleteEmployee(123);
	}

}
