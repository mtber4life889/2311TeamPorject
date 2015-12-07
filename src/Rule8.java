import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rule8 extends Rule 
{
	public boolean check(String sentence)
	{
		if (sentence.matches(".*,.*"))
		{
			 Pattern Conj = Pattern.compile(".*,(\\s)and|but|nor|so|yet");  
			 Matcher match = Conj.matcher(sentence); 
			 		if (match.find())
			 		{
			 				return true; 
			 		}
			 		else return false;
		}
		else return true; 
	}
	
	
	public String message()
		{
			return "8. Conjunction not detected after comma.";
		}
	
}



