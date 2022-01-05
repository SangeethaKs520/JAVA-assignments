/*Develop a class with instance variable map( of type Map<Integer,Student>), 
addStudent(Student s), viewStudents( ), viewStudent(Integer id).
addStudent(Student s): get key value from Student class by invoking getId( ),should add student 
object and id to the Map.
viewStudents( ) : It should display all the student’s detail from the map object.
viewStudent(Integer id): It should display the particular student’s detail.
The Student class :
 public static int id=10001;
 private String name ,email, course;
 Student(String name,String email,String course){
------------
 }
 public static int getId( ){
// Write the Code here 
 }
 
 / Do display student details override toString( ) method of the Object class.
 */

package assign6;

import java.util.HashMap;
import java.util.Map;

public class Student {

//	Map<Integer,Student> map = new HashMap<Integer,Student>();
	public static int id=10001;
	 private String name ,email, course;
	 
	 Student(String name,String email,String course){
		 this.name = name;
		 this.email = email;
		 this.course = course;
	 }
	 
//	 public static int getId( ){
	// Write the Code here 
//	 }
	 
	 public static void main(String[] args) {
		 
	 }
	}


