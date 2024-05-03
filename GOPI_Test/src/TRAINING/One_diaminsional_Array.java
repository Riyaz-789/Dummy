package TRAINING;

public class One_diaminsional_Array {
	
	public void Int() {

	//most important	
		
		int[] values=new int[4];
		
		
		values[0]=3;
		values[1]=2;
		values[2]=4;
		values[3]=5;
	//	values[4]=6;
		
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		System.out.println(values[3]);
//		System.out.println(values[4]);
		
		
		
	}
	
	public void string(){
		
		String[] data=new String[4];
		
		data[0]="java";
		data[1]="python";
		data[2]="dotenate";
		data[3]="selenium";
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[2]);
		System.out.println(data[3]);
	
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		One_diaminsional_Array obj=new One_diaminsional_Array() ;
		
		obj.Int();
		obj.string();	
		}
	}


