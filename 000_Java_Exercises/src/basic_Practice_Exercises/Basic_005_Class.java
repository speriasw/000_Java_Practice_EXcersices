package basic_Practice_Exercises;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class Basic_005_Class 
{

	public static void main (String[] args)
	{
		
		System.out.println("------------------------------------------------");
		System.out.println("--------------------ArrayList-------------------");
		System.out.println("------------------------------------------------");
		ArrayList<Serializable> al = new ArrayList<Serializable>();
		
		al.add("String");
		al.add(10);
		al.add('A');
		
		System.out.println(al);
		
		al.add(10.001);
		al.add("Bla Bla");
		
		System.out.println(al);
		
		al.remove(3);
		
		System.out.println(al);
		
		
		Iterator<Serializable> it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("------------------------------------------------");
		System.out.println("--------------------ArrayList<String>-----------");
		System.out.println("------------------------------------------------");	
		
		ArrayList<String> ai1 = new ArrayList<String>();
		ai1.add("10");
		ai1.add("20");
		ai1.add("30");
		ai1.add("40");
		ai1.add("50");
		
		for(String a:ai1)
			System.out.println(a);
		
		System.out.println("------------------------------------------------");
		System.out.println("--------------------HashSet<String>-----------");
		System.out.println("------------------------------------------------");	
				
		HashSet<String> hs=new HashSet<>();
		hs.add("10");
		hs.add("20");
		hs.add("30");
		hs.add("40");
		hs.add("50");
		for(String a:hs)
			System.out.println(a);
	}
	
}
