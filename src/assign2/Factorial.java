/*Write a program to find the factorial of a given number using recursive function ? */

package assign2;

public class Factorial {
	
	static int fact(int n){
		if(n==0){
			return 1;
		}
		else{
			return (n*fact(n-1));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = fact(5);
		System.out.println("factorial of given number is " +  fact);

	}

}
