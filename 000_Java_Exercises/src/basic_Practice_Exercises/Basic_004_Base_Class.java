package basic_Practice_Exercises;

public class Basic_004_Base_Class 
{
	static int Second_Static_Variable_Base_Class;
	
	int FirstVariable_Base_Class;
	
	public void FirstMethod_Base_Class()
	{
		FirstVariable_Base_Class = 10;
		Second_Static_Variable_Base_Class=11;
		System.out.println("FirstMethod_Base_Class : " + FirstVariable_Base_Class + " , Second_Static_Variable_Base_Class : " + Second_Static_Variable_Base_Class);
	}
	
	public void SecondMethod_Base_Class()
	{
		FirstVariable_Base_Class = 20;
		Second_Static_Variable_Base_Class=12;
		System.out.println("Second_Base_Class : " + FirstVariable_Base_Class  + " , Second_Static_Variable_Base_Class : " + Second_Static_Variable_Base_Class);
	}
}
