package basic_Practice_Exercises;

public class Basic_003_Class 
{

	public static void main(String[] args)
	{
		double Emp_numbers[] = new double[10];
		
		Emp_numbers[0]=10;
		Emp_numbers[1]=20;
		Emp_numbers[3]=30;
		Emp_numbers[5]=40;
		
		for( double a:Emp_numbers)
			System.out.print(a + " ");
	
		int[] Emp_RollNum = {1, 2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10};
		
		
		for( int a:Emp_RollNum)
			System.out.print(a + " ");
		
		char[][] Stars = new char[10][10];
		
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++)
			{
				Stars[i][j] = '*'; 
			}
		}
		
		System.out.println("");
		
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++)
			{
				if((i+j)==9 || (i==j))
				{	
					System.out.print(Stars[i][j] + "  "); 
				}
				else
				{
					System.out.print("  ");
				}
			}
				System.out.println("");
		}
	}
	
	
}
