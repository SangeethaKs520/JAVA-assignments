/*Write a program to create class Student with id, name, address , display(),Student(id,name). Create 
several objects and initialize them. Display the details of each student and finally display the number of 
student objects that are created. */

package assign2;

public class Student {
	int id;
	String name;
	String address;
	static int count;
	
   public Student(){
		count++;
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		stu1.id = 123;
		stu1.name = "keerthi";
		stu1.address = "9th cross";
		stu2.id = 456;
		stu2.name = "Ravi";
		stu2.address = "9th cross";
		stu1.display(stu1.id, stu1.name, stu1.address);
		stu2.display(stu2.id, stu2.name, stu2.address);
		stu3.display(stu3.id, stu3.name, stu3.address);
		System.out.println("Number of student objects that r created" + " " + Student.count);

	}
	 
  
	void display(int id, String name, String address){
		System.out.println("Student name is" + " " + name + "with id" + " " + id);
		
	}
	
	

}
