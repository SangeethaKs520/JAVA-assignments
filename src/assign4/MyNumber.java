/* Create a class MyNumber having the following features:
Attributes
int first number
int second number
result double stores the result of arithmetic operations performed on a 
and b
Member functions
MyNumber(x, y) constructor to initialize the values of a and b
add() stores the sum of a and b in result
sub() stores difference of a and b in result
mul() stores product in result
div() stores a divided by b in result
a) Test to see if b is zero (0) and throw an appropriate exception since division by zero is 
undefined.
b) Display a menu to the user to perform the above four arithmetic operations*/

package assign4;

import java.util.Scanner;

public class MyNumber {
	
	int a;
	int b;
	double result;
	
	MyNumber(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public void add(){
		 this.result= this.a + this.b;
		 System.out.println("Addition " + this.result);
	}
	
	public void sub(){
		 this.result= this.a - this.b;
		 System.out.println("Subtraction " + this.result);
	}
	
	
	public void mul(){
		this.result= this.a * this.b;
		 System.out.println("Multiplication " + this.result);
	}
	
	
	public void div(){
		 this.result= this.a / this.b;
		 System.out.println("Division " + this.result);
	}
	
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int choice = 5;
	
	
		
		do{
			try{
				System.out.println("Enter \n 1.Addition \n 2.Subtraction \n 3.Multiplication  \n 4.Division \n 5.Exit");
				choice = scan.nextInt();
				if(choice !=5){
					System.out.println("Enter number 1");
					int num1 = scan.nextInt();
					System.out.println("Enter number 2");
					int num2 = scan.nextInt();
					MyNumber obj1 = new MyNumber(num1,num2);
					switch(choice){
					case 1: obj1.add();break;
					case 2: obj1.sub();break;
					case 3: obj1.mul();break;
					case 4: obj1.div();break;
					}
				}
			
			}catch(ArithmeticException e){
				System.out.println(e);
				
			}	
		}while(choice!=5);

	}
	
	

}
