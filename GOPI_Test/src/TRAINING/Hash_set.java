package TRAINING;

import java.util.HashSet;

public class Hash_set {
public static void main(String[] args) {
	HashSet<Integer> empId=new	HashSet<Integer>();
	
	empId.add(21);
	empId.add(31);
	empId.add(41);
	empId.add(51);
	
	//print all empId
	for (Integer a:empId) {
		System.out.println(a);
	}
	System.out.println();
		//remove id
		empId.remove(31);
		for(Integer a:empId) {
			System.out.println(a);
		}
		System.out.println();
		//condition
		if (empId.contains(31)) {
			System.out.println("Available");
			
		}
		else {
			System.out.println("not Available");
		}
	}
	
}

