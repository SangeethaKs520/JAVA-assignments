/*Create a class BankAccount having the members as given below:
accNo integer
custName string
accType string (indicates ‘Savings’ or ‘Current’)
balance float
a) Include the following methods in the BankAccount class:
void deposit(float amt);
void withdraw(float amt);
float getBalance();
➢ deposit(float amt) method allows you to credit an amount into the current balance. If amount is 
negative, throw an exception NegativeAmount to block the operation from being performed.
➢ withdraw(float amt) method allows you to debit an amount from the current balance. Please 
ensure a minimum balance of Rs. 1000/- in the account for savings account and Rs. 5000/-for 
current account, else throw an exception InsufficientFunds and block the withdrawal operation. 
Also throw an exception NegativeAmount to block the operation from being performed if the 
“amt” parameter passed to this function is negative.
➢ getBalance() method returns the current balance. If the current balance is below the minimum 
required balance, then throw an exception LowBalanceException accordingly.
b) Have constructor to which you will pass, accno, cust_name, acctype and initial balance. Check 
whether the balance is less than 1000 or not in case of savings account and less than 5000 in 
case of a current account. If so, then raise a LowBalanceException.
In either case if the balance is negative then raise the NegativeAmount exception accordingly.
 */

package assign4;



public class BankAccount {
	int accNo;
	String custName;
	String accType;
	float balance = 0.0f;
	
	BankAccount(int accNo, String custName,String accType,float balance){
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		this.balance = balance;
		
	}
	
	void deposit(float amt){
		if(amt < 0){
			throw new ArithmeticException("negative amount not allowed");
		}
		else{
			this.balance = this.balance+amt;
		}
	}
	
	void withdraw(float amt){
		if (this.accType == "S"){
			if(this.balance <1000){
				throw new ArithmeticException("cannot withdraw");
			}
			else{
				this.balance = this.balance-amt;
			}
		}
		else{
			if(this.balance <5000){
				throw new ArithmeticException("cannot withdraw");
			}
			else{
				this.balance = this.balance-amt;
			
			}
		}
	}
	
	public void getBalance(){
		if(this.balance <500){
				throw new ArithmeticException("Low balance");   
		}
		else{
			System.out.println("your balance is " + this.balance);
		}
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount obj = new BankAccount(123,"sang","C",5000);
		obj.deposit(500);
		obj.withdraw(6000);
		obj.getBalance();
		
		
		

	}

}
