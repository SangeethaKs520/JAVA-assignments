/*Create a Method that accepts Set<String>, name (String) and process the elements. While processing 
check each element with name, if both are equal then remove the element from the set. And return the 
Set object (If name is not present in the Set, display message as “Name is not found”)
public Set<String> checkName(Set<String> set, String name){
//Write your logic
}
Hint:
1. Process the Elements from the Set by using Iterator Interface
2. Compare content of element with name by String API method */

package assign5;

import java.util.*;


public class CollectionEx3 {
	 int count =0;
	//Set<String>
	
	public void checkName(Set<String> set, String name){
		//Write your logic
		 Iterator<String> i = set.iterator();
		 while(i.hasNext())  
         {  
           if(i.next().equals(name)){
        	  count++; 
           }
         } 
		 
		 System.out.println(count);
		 
		 Iterator<String> ii = set.iterator();
		 if(count>0){
			 System.out.println("coming inside");
			 while(ii.hasNext()){
				 System.out.println(ii.next());
			 }
		 }
		 else{
			 System.out.println("Name not found");
		 }
		 
		 
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ;
      String[]  names = {"Sangeetha","Madhu","Pintu","Leela","Suresh","Pintu"};
      Set<String> set = new HashSet<String>();
      for(String name:names){
    	  set.add(name);
      }
      
      CollectionEx3 obj = new CollectionEx3();
      
      obj.checkName(set, "somu");
      
		
		
	}

	
}
