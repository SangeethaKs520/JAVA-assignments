/*Create a method that accepts an array of String Object and sort the elements. The elements in the left 
half should be completely lowercase and the elements in the right half should be upper case.
public String[] getResults(String names[]){
//Write your logic
}
Hint: 
1. Convert the String array object to List and sort the elements by using Collections API class.
2. Convert the left half elements into lowercase and right half to upper case by processing 
elements from the List.*/

package assign5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionEx1 {
	
	
	
	public String[] getResults(String names[]){		
		List<String> list = new ArrayList<String>();
		
		for(String name:names){
			list.add(name);
		}
		
		Collections.sort(list);
		
		List<String> list1 = new ArrayList<String>();
		
		int n = list.size()/2;
		
		for(int i=0; i<n; i++){
			list1.add(list.get(i).toLowerCase());
	        
		}
		
		for(int i=n; i<list.size();i++){
			list1.add(list.get(i).toUpperCase());
			
		}
		
		 
		String[] array = list1.toArray(new String[list1.size()]);
		return array;
		
		
		//Write your logic
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Sangeetha","Madhu","Pintu","Leela","Suresh","Adhi","Arun","Niveditha"};
		CollectionEx1 obj1 = new CollectionEx1();
		System.out.println(Arrays.toString(obj1.getResults(names)));

	}

}
