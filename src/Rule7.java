import java.util.regex.Pattern;

public class Rule7 extends Rule 
{
	public boolean check(String sentence)
	{	
		Pattern pattern = Pattern.compile("s are");
        if (pattern.matcher(sentence).find())
        {
            return false;
        }
		
	    return true;
	}
	
	public String message()
	{
		return "rule 7 error";
	}
}

