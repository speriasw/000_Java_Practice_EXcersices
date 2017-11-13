package Excersice_Sets;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excersice_001 {
//Comment
	public static void main(String[] args) 
	{		
		PayRateList();
	}

	public static void PayRateList()
	{
		int iRate = 0;
		double dInHand=0,dOldInhand=0,dDiff = 0;
		int iEnd=0;
		
		
		try
		{
		iRate=GetUserInput("Enter the starting rate\n");
		
		iEnd=GetUserInput("Enter the ending rate\n");

		System.out.println("Rate	\tInHand\t\tDiff");

			for (int i=iRate ; i<iEnd ; i=i+5)
			{
				
				dInHand = i * 160; 
				dInHand = (dInHand * 0.80);
				dInHand = dInHand - 5000;
				dInHand = dInHand + 3500;
				
				dDiff = dInHand - dOldInhand;
				
				System.out.printf("%d\t\t%f\t%f\n", i, dInHand,dDiff);
				
				dOldInhand = dInHand;
				
			}		
		}
		catch(Exception e)
		{System.out.println("Start Again");}

	}
	
	private static int GetUserInput(String sExceptionText)
	{
		int iIntNumber = 0;
		Scanner scanedInput = new Scanner(System.in);
		
		System.out.println(sExceptionText+"\n");
		
		try
		{
			iIntNumber =scanedInput.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter only interger value \n");
			throw e;
		}		
		finally
		{
			scanedInput=null;
		}
		return iIntNumber;		
	}

}
