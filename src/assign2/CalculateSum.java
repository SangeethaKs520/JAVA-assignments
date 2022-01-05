/*Write a program to create a class CalculateSum with the int sum() method and pass different number 
of parameters of type int and invoke the sum() method and display the result. */

package assign2;

public class CalculateSum {

	public static void main(String[] args) {
		CalculateSum obj = new CalculateSum();
		System.out.println("Sum of 2 numbers is" + " " + obj.sum(10, 20));
		

	}
	
	int sum(int a,int b){
		return a+b;
	}

}
