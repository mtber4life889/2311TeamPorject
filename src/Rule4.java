import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Rule4 extends Rule 
{
	public boolean getSpecialChars(String s) {
		 String[] theSplit = s.split("\\s+");
		 for(int i=0; i<=s.length(); i++){
		 if( i == s.length())
		 {
			 break;
		 }
		 System.out.println(theSplit[i]);
		 }
		

	     Pattern p = Pattern.compile("[^A-Za-z0-9]");
	     Matcher m = p.matcher(s);
	     boolean b = m.find();
	     if (b == true)
	        System.out.println("There is a special character in my string ");
	     else
	         System.out.println("There is no special char.");
	     return b;
	 }
	public boolean check(String sentence)
	{	
		if (getSpecialChars(sentence))
		{
			return true;
		}
		else
		{
		return false;
		}
	}
/*	//This doesn't work at all i know it doesn't but I think it's close to what we need
	//If we can figure out this class we can do the other rules that use this same logic
	Pattern SL_Pattern = Pattern.compile("\\W");
	Matcher SC_M = SL_Pattern.matcher("\\W");
	public boolean check(String sentence)
	{	
		if (SC_M.find())
		{
			return true;
		}
		else
		{
		return false;
		}
	}

	
		/* Still working on the matcher. 
		
		Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher("I am a string");
		boolean b = m.find();
		if (b)
   			System.out.println("There is a special character in my string");
   		*/
   		
/*		public boolean check(String sentence) 
		{
			 String patternString = "[^A-Za-z0-9]";
			 Pattern p = Pattern.compile("\\s+");
		     Matcher m = p.matcher(sentence);
		     boolean b = m.find();
			
			String []strArray=sentence.split("\\s+");
			for (int i=0; i<strArray.length;i++){
				System.out.println(strArray[i]);
				if (b){
					return true;
				}
			}
			return false;
			/* String[] theSplit = sentence.split("\\w+");
			 String patternString = "[^A-Za-z0-9]";
			 Pattern p = Pattern.compile("\\w+");
		     Matcher m = p.matcher(sentence);
		     
		     
		    //boolean b = m.matches();
		     //boolean b = m.find();
		     while(m.find()){
		    	 if (m.find(patternString))
		     }
		     
		     if ()
		     {
		        return false;
		     }
		     else
		     {
		        return true;
		     }*/
		     /*String[] theSplit = sentence.split("\\s+");
		    Pattern Conj = Pattern.compile("[^A-Za-z0-9]");  
			Matcher match = Conj.matcher(sentence); 
			System.out.print(theSplit);
			
			return true;*/
		/*	 		if (match.find())
			 		{
			 				return false; 
			 		}
			 		else return true;*/
		    
		//return (sentence == null) ? false : sentence.matches("[^A-Za-z0-9 ]");

	public String message()
	{
		return "rule 4 error";
	}
}
