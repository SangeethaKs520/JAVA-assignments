/*. Create a method that accepts the List <String> Object and display all the elements in the given list 
without using Iterator or ListIterator. (Confirm that List is not empty, if empty it should not process the 
elements and the result should be “List is Empty”)
public void showElements(List<String> list){
//Write Your Logic
 }
Hint:
1. To process elements from the List use one of the features of Java 1.5
2. Use List API method to find “List is empty”  */

package assign5;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx {
	
		public void showElements(List<String> list){
//			for(String person:list){
//				System.out.println(person);
//			}
			
			boolean res = list.isEmpty();
			if(res){
				System.out.println("List is empty");
			}
			else{
				for(int i=0; i<list.size();i++){
					System.out.println(list.get(i));
				}
			}
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>  list = new ArrayList<String>();
		list.add("Sangeetha");
		list.add("Madhu");
		list.add("pintu");
		list.add("leela");
		list.add("suresh");
		
		CollectionEx obj = new CollectionEx();
		obj.showElements(list);
		
		
	}

}
