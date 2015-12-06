import java.util.regex.Pattern;
public class Rule10 extends Rule {
// Detects if there is an i by itself and if its lower case it throws the error
// because an i by itself should be capitalized	
	public boolean check(String sentence) {
		Pattern pattern = Pattern.compile(" i ");
            if (pattern.matcher(sentence).find())
            {
                return false;
            }
			
		    return true;
	}

	public String message()
	{
		return "rule 10 error";
	
	}
}
