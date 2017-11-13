package basic_Practice_Exercises;

public class Basic_004_Main_Class {

	public static void main(String[] args) 
	{
	
		Basic_004_Child_Class ChildObj = new Basic_004_Child_Class();
		
		System.out.println("ChildObj.FirstVariable_Base_Class : " + ChildObj.FirstVariable_Base_Class);
		
		ChildObj.FirstMethod_Base_Class();
		
		ChildObj.SecondMethod_Base_Class();
		
		System.out.println("ChildObj.FirstVariable_Base_Class : " + ChildObj.FirstVariable_Base_Class);
		
		System.out.println("-------------------------------------------------------");
		System.out.println("---------------Base Ref : Base Instance----------------");
		System.out.println("-------------------------------------------------------");
		
		Basic_004_Base_Class BaseObj = new Basic_004_Base_Class();
		BaseObj.FirstMethod_Base_Class();
		BaseObj.SecondMethod_Base_Class();
		BaseObj.FirstMethod_Base_Class();
		
		System.out.println("-------------------------------------------------------");
		System.out.println("---------------Base Ref : Child Instance----------------");
		System.out.println("-------------------------------------------------------");
		
		Basic_004_Base_Class BaseObjRef = new Basic_004_Child_Class();
		BaseObjRef.FirstMethod_Base_Class();
		BaseObjRef.SecondMethod_Base_Class();
		BaseObjRef.FirstMethod_Base_Class();
		
	}

}
