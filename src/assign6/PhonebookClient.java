/*Create class PhonebookClient having user interface like
 1. Add new phone book entry
2. Search name
3. Quit.
Create another 

public class PhoneBook{
Map<String,String> map=new HashMap<>();
public void addDetails(String phno,name){
//Write your logic
}
public String getName(String phno){
//Write your logic
}
}
addDetails(): It should add the phno,name to map object
getName(): It should search the given phone number in the map and should return the person 
name, if not it should return “Sorry! No person found with the given number”.
 Option 1: It allows add Phno and Name.
 Option 2: It has to take Phno as input from the user and based on that it should return Name
 Option 3: Will terminate the program
*/

package assign6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhonebookClient {

	
	public static void main(String[] args) {
	

		int choice;
		PhoneBook obj = new PhoneBook();
		do{
			System.out.println("1. Add new phone book entry \n2. Search name \n 3.Quit");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your choice");
			choice = scan.nextInt();
			scan.nextLine();
			switch(choice){
			case 1 : System.out.println("Enter phone number");
			String phno = scan.nextLine();
			System.out.println("Enter name");
			String name = scan.nextLine();
			obj.addDetails(phno, name);
			break;
			case 2 : System.out.println("Enter phone number");
			String phnum = scan.nextLine();
			System.out.println(obj.getName(phnum));
			}
			
		}while(choice != 3);

	}

}



