import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Rule4 extends Rule 
{
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
