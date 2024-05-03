package TRAINING;


	
	
	abstract class riyaz
	{
		 abstract public void hello();
		 abstract public void hii();
	}
	
	class Gopi 
	{
		public void hello()
		{
			System.out.println("how are you");
		}
		public void hii()
		{
			System.out.println("fine");
		}
		
		
	}
	public class ABSTRACTION_eXP {
		public static void main(String[] args) {
			Gopi obj=new Gopi();
			obj.hello();
			obj.hii();
			
		}

}
