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
		return "7. Noun is not plural. Please change.";
	}
}

//Rule 7 works as I wrote in the rule list but only cruely, would suggest
//trying to further improve it.
