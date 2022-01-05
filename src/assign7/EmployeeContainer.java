package Collection;

import java.util.HashSet;
import java.util.Set;

public class EmployeeContainer {
	
	Set<Employee> empList = new HashSet<Employee>();
	
	public void addEmployee(Employee emp){
		if(empList.isEmpty()){
			empList.add(emp);
		}
		else{
			if(empList.stream().anyMatch(s-> s.empNo == emp.empNo)){
				System.out.println("Employee already exist");
			}
			else{
				empList.add(emp);
			}
		}
			
	};
	
	public void deleteEmployee(int empno){
		if(empList.isEmpty()){
			System.out.println("Employee list is empty");
		}
		else{
			if(empList.stream().anyMatch(s-> s.empNo == empno)){
				empList.removeIf(s->s.empNo == empno);
			}
			else{
				System.out.println("Sorry! Employee is not found");
			}
		}
		
	};
	
	public void viewEmployee(int empno){
		if(empList.isEmpty()){
			System.out.println("Employee list is empty");
		}
		else{
			if(empList.stream().anyMatch(s-> s.empNo == empno)){
				empList.stream().filter(s->s.empNo==empno).forEach(s->s.showInfo());
			}
			else{
				System.out.println("Sorry! Employee is not found");
			}
		}
		
	};
	
	public void viewEmployees(){
		if(empList.isEmpty()){
			System.out.println("No elements are added to the Set");
		}
		else{
			empList.stream().forEach(s->s.showInfo());
		}
		
	};



}
