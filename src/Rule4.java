import java.util.regex.Pattern;
public class Rule4 extends Rule 
{
	public boolean check(String sentence)
	{
		String[] theSplit = sentence.split("\\s+");
		Pattern pattern = Pattern.compile("[^A-Za-z0-9 \\.\\,\\?\\!\\'\\-\\:\\(\\)]");
        
		for(int i = 0; i < theSplit.length; i++)
        {
            if (pattern.matcher(theSplit[i]).find())
            {
                return false;
            }
		 }
		 
		 return true;
	}

	public String message()
	{
		return "rule 4 error";
	}
}
