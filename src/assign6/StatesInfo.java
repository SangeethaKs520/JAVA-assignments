/*Develop a class with Instance variable states (of type Set), addSate(String name), 
viewStates( ).

addState( String name) stores the state name into the states Object.

viewStates( ) should display the elements from the states object in the descending order. 

public class StatesInfo{
private Set<String> states=// Create Object, which is required for you
public void addState(String name){
// Write your Logic
}
public void viewStates(){
// Write your Logic
}
}
Hint: 
 1. To sort the elements in Set, use java.util API interface */

package assign6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StatesInfo {
	private Set<String> states= new HashSet<String>();

	public static void main(String[] args) {
		StatesInfo obj = new StatesInfo();
		obj.addState("Karnataka");
		obj.addState("Maharastra");
		obj.addState("Rajastan");
		obj.addState("Punjab");
		obj.addState("Gujurath");
		obj.viewStates();

	}
	
	public void addState(String name){
		states.add(name);
//		System.out.println(states);
		}
	
		public void viewStates(){
			List<String> array = new ArrayList<String>(states);
			Collections.sort(array, Collections.reverseOrder()); 
			 for(String str:array){
				 System.out.println(str);
			 }
			
			
		}

}
