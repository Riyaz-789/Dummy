package TRAINING;

import java.util.HashMap;

public class Hash_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,Integer> emp=new HashMap<String,Integer>(); //
//store data
       
       emp.put("java", 11);
       emp.put("ruby", 12);
       emp.put("python",13);
       emp.put("selenium",14);
       emp.put("appium",15);
      
        //only get keys
        for(String emps:emp.keySet()) {
	System.out.println(emps);
} System.out.println();

       System.out.println();
        //only get values
        for(Integer id:emp.values()) {
        	System.out.println(id);
        }
        
        System.out.println();
        	 System.out.println(emp.get("java"));
             System.out.println(emp.get("python"));
        	
        }
	}


