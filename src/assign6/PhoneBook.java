package assign6;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

	
	Map<String,String> map=new HashMap<>();
	
	public void addDetails(String phno, String name){
		map.put(phno, name);
		System.out.println(map);
	}
	
	public String getName(String phno){
		int count = 0;
		String name = " ";
		for(Map.Entry m:map.entrySet()){
			if(m.getKey().equals(phno)){
				count++;
				 name = (String) m.getValue();
			}
		}
		
		if(count>0){
			return name;
		}
		else{
			return "Sorry! No person found with the given number";
		}
		
		

	}
	
	

}
