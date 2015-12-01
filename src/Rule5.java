import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Rule5 extends Rule 
{
	public boolean check(String sentence)
	{
		  
			   	 Pattern Neg = Pattern.compile("\\b(n't|not|never|no|nothing|nowhere|non){2}\\b");  
			   	 Matcher Matcher = Neg.matcher(sentence); 
			     if (Matcher.find())
			     {
			    	return false; 
			     }
			     else
			     {
			    	 return true;
			     }
			    
	}
			     
	public String message()
		{
			return "rule 5 error"; 
		}
}
