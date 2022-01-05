/*Create a method that accepts an array of Integer Object and should return Map<Integer, Integer>. In 
Map, key is array element and value is Cube of key element.
public Map<Integer,Integer> getMap(Integer numbers[]){
//Write your logic
}
 Hint:
1. Process the elements from array and find Cube of element using Math class API.
2. Store element and cube values into Map Object */


package assign5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CollectionEx2 {
	//Map<Integer,Integer>
	
	public Map<Integer,Integer> getMap(Integer numbers[]){
		System.out.println(Arrays.toString(numbers));
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();  
		
		for(int number:numbers){
			int pow =(int) Math.pow(number, 3);
			map.put(number,pow);
		}
		
		return map;
		
		//Write your logic
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] numbers = {1,2,3,4,5};
		
		CollectionEx2 obj = new CollectionEx2();
		
		System.out.println(obj.getMap(numbers));
		

	}

}
