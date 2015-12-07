import java.util.regex.Pattern;
public class Rule6 extends Rule 
{
	public boolean check(String sentence)
	{
		String[] theSplit = sentence.split("\\s+");
		Pattern pattern = Pattern.compile("[^0-9]");
        
		for(int i = 0; i < theSplit.length; i++)
        {
            if (pattern.matcher(theSplit[i]).find())
            {
                return true;
            }
		 }
		 
		 return false;
	}

	public String message()
	{
		return "rule 6 error";
	}
}
