/*  Write a program to accept the number from the user and based on the user’s choice , give the
appropriate result to the user. The choices are :
1. Factorial
2. Table
3. Prime or not
Note: Invoke the methods without creating the object */

package assign2;

import java.util.Scanner;

public class UserChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("select 1 for factorial , 2 for table, 3 to find prime or not");
		int num = scan.nextInt();
		System.out.println("Enter number");
		int val = scan.nextInt();
		scan.close();
		
		
		if(num == 1)
		{
			factorial(val);
		}
		else if(num ==2){
			table(val);
		}
		else if(num == 3){
			primeOrNot(val);
		}
		else{
			System.out.println("Select correct option");
		}
	}
	
	static void factorial(int num){
		int fact = 1;
		for(int i=1;i<=num;i++){
			fact = fact*i;
		}
		System.out.println("Factorial of a given number is" + " " + fact);
		
	}
	
	static void table(int num){
		for (int i =1; i<=10; i++){
			System.out.println(i + " " + "*" + num + " " + "=" + " " + i*num);
		}
	}
	
	static void primeOrNot(int num){
		int m,flag=0;
		m=num/2;
		if(num==0 || num==1){
			System.out.println("not a prime number");
		}
		else{
			for(int i=2;i<=m;i++){
				if(num%i==0){
					flag = 1;
					System.out.println("not a prime number");
					break;
				}
			}
			if(flag==0){
				System.out.println("Prime number");
			}
		}
	}

}
