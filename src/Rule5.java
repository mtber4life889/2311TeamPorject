import java.util.regex.Pattern;

public class Rule5 extends Rule 
{
	public boolean check(String sentence)
	{
			Pattern pattern = Pattern.compile("not|Not(\\s)not|Not");
	        if (pattern.matcher(sentence).find())
	        {
	            return false;
	        }
			
		    return true;
		}
	
	public String message()
		{
			return "rule 5 error"; 
		}
}



