import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Rule5 extends Rule 
{
	public boolean check(String sentence)
	{
		  
			   	 Pattern Neg = Pattern.compile(".*(n't|not|never|no|nothing|nowhere|non).*{2,3}");  
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

/* Takes string 
 * Split string into array elements 
 * Compare array Neg and split array to find a two or more element match
 * Out put true if matches
 * Out put error, Neg not present
 */


