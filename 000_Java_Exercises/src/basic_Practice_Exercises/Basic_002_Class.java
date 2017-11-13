package basic_Practice_Exercises;



public class Basic_002_Class 
{
	
	public static void main(String[] args)
	{
		String sText = "Daenerys of the House Targaryen, the First of Her Name, The Unburnt, Queen of the Andals, the Rhoynar and the First Men, Queen of Meereen, Khaleesi of the Great Grass Sea, Protector of the Realm, Lady Regnant of the Seven Kingdoms, Breaker of Chains and Mother of Dragons";
		
		System.out.println("sText.length() : " + sText.length());
		
		System.out.println("sText.startsWith(\"Daenerys\") : " + sText.startsWith("Daenerys"));
				
		System.out.println("sText.endsWith(\"Dragons\") : "+ sText.endsWith("Dragons")); 
		
		System.out.println("sText.substring(0,10) : " + sText.substring(0,31));
		
		System.out.println("sText.lastIndexOf(\"of\") : " + sText.lastIndexOf("of"));
		
		System.out.println("sText.equals(\"First\") : " + sText.equals("First"));
		
		System.out.println("sText.contains(\" Queen\") : " + sText.contains("Queen"));
		
		System.out.println("sText.equals(\"Unburnt\") : " + sText.equals("Unburnt"));
		
		System.out.println("sText.equalsIgnoreCase(\"Bla Bla\") : " + sText.equalsIgnoreCase("Bla Bla"));
		
		
		
		String []sArray = sText.split(" ");
		
		for (String s:sArray)
		System.out.println(s);
		
		
	}
}
