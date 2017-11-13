package basic_Practice_Exercises;

public class Basic_000_Class {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Calling Class");
	
		//comment 1 From Server to client
		//Comment 2 From Server to client
		//Comment 3 From client to server
		
		Basic_001_Class Obj1 = new Basic_001_Class();
		
		FirstMethod(1);
		SecondMethod(2);
		Basic_001_Class.ThirdMethod(3);
		Obj1.FourthMethod(4);
		Basic_001_Class.ThirdMethod(5);
	}
	
	public static void FirstMethod(int a)
	{
		System.out.println("First Method " + a);
	}

	public static void SecondMethod(int a)
	{
		System.out.println("Second Method " + a);
	}
}
