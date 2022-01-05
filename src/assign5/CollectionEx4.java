/* Create a Method that accepts Map<Integer,String> and process the elements and display the result as
Example: 
1001 = Manoj
1002 = Krish. 
public void viewElements(Map<Integer, String> map){
//Write your logic
}
Don’t try to get the key values first and corresponding value from the map. 
Hint :
1. Process the elements from Map object using entrySet( ) method */

package assign5;

import java.util.HashMap;
import java.util.Map;

public class CollectionEx4 {
	
	public void viewElements(Map<Integer, String> map){
		//Write your logic
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey() + " = " + m.getValue());
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1001,"Manoj");
		map.put(1002, "Krish");
		
		CollectionEx4 obj1 = new CollectionEx4();
		
		obj1.viewElements(map);
		

	}

}
