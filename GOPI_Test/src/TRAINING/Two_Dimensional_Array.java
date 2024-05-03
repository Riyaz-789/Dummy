package TRAINING;

import java.lang.reflect.Array;

public class Two_Dimensional_Array {
	
	public void Int()
	{
		int[][] value=new int[2][2];	
		
	value [0][0]=3;
	value [0][1]=4;
	value [1][0]=5;
	value [1][1]=6;
	
	
	System.out.println(value[0][1]);
	System.out.println(value[1][0]);
	System.out.println(value[1][1]);
		
	}
	
	public void string() {
		
		String[][] data=new String[2][2];
		
		data[0][0]="java";
		data[0][1]="python" ;
		data[1][0]="dotenate";
		data[1][1]="selenium";
		
		
		System.out.println(data[0][0]);
		System.out.println(data[0][1]);
		System.out.println(data[1][0]);
		System.out.println(data[1][1]);
	}
	
	public static void main(String[] args) {
		
		Two_Dimensional_Array obj=new Two_Dimensional_Array();
		obj.Int();
			obj.string();
		

			

}
}