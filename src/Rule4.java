import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Rule4 extends Rule 
{
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
   		
		public boolean check(String sentence) 
		{
		return (sentence == null) ? false : sentence.matches("[^A-Za-z0-9 ]");
		}
	
	public String message()
	{
		return "rule 4 error";
	}
}
