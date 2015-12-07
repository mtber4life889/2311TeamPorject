import java.util.regex.Pattern;

public class Rule5 extends Rule 
{
	public boolean check(String sentence)
	{
		if(sentence.matches("not|Not"))
		{
			Pattern pattern = Pattern.compile("not|Not(\\s)not|Not");
	        if (pattern.matcher(sentence).find())
	        {
	            return true;
	        }
		    	return false;
		}
		else return false; 
		
	}
	public String message()
		{
			return "5. Double negatives detected. Please change."; 
		}
}

