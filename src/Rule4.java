import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Rule4 extends Rule 
{
	//This doesn't work at all i know it doesn't but I think it's close to what we need
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
	
	public String message()
	{
		return "rule 4 error";
	}
}
