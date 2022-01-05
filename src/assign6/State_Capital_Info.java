/*Develop a class with Instance variable state_capital (of type Map), add_sate_capital 
(String state,String capital), viewCapital(String state).
add_state_capital( String state,String capital) stores the state, capital values into the 
state_capital Object.
viewCapital (String state) should display the capital of the given state. If no state is found it 
should display message “The State name is not existing” 

public class State_Capital_Info{

private Map<String,String> state_capital=// Create Object, which is required for you
public void add_state_capital(String state,String capital){
// Write your Logic
}
public void viewCapital(String name){
// Write your Logic
}
} */

package assign6;

import java.util.HashMap;
import java.util.Map;

public class State_Capital_Info {
	private Map<String,String> state_capital= new HashMap<String,String>();
	
	public static void main(String[] args) {
		State_Capital_Info obj = new State_Capital_Info();
		
		obj.add_state_capital("Karnataka", "Bangalore");
		obj.add_state_capital("Tamilnadu", "Kittur");
		obj.viewCapital("tamilnadu");
		

	}
	
	public void add_state_capital(String state,String capital){
		state_capital.put(state, capital);
		System.out.println(state_capital);
		}
	
	
	
		public void viewCapital(String state){
			int flag =0;
			String capital = "";
			for(Map.Entry m:state_capital.entrySet()){
				 if(m.getKey().equals(state)){
					 flag++;
					capital = (String) m.getValue();
				 }
			}
			
			if(flag > 0){
				System.out.println(capital);
			}
			else{
				System.out.println("The State name is not existing");
			}
		
		}

}
