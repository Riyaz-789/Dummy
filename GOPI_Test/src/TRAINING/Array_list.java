package TRAINING;

import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a1=new ArrayList<>();//duplicate
		
	
		a1.add("riyaz1");
		a1.add("imthiyaz2");
		a1.add("mayur3");
		a1.add("prem4");
		a1.add("riyaz1");
		
		System.out.println(a1);
		
		a1.remove(1);
		
		System.out.println(a1);
		
		System.out.println(a1.get(2));
		
System.out.println(a1.set(0, "namea1"));

System.out.println(a1);
}
}
