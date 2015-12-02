import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rule8 extends Rule 
{
	public boolean check(String sentence)
	{
		 if (sentence.matches("\\s(,)."))
		 {
			 Pattern Conj = Pattern.compile("\\b(and|but|for|nor|or|so|yet)\\b");  
			 Matcher match = Conj.matcher(sentence); 
			 		if (match.find())
			 		{
			 				return false; 
			 		}
			 		else return true;
			 		
		
		 }
		 else return false; 
	}
	
	public String message()
		{
			return "rule 8 error";
		}
	
}



/* Takes string 
 * Split string into array elements 
 * Compare array conj and split array to find single element matches 
 * Out put true if matches
 * Out put error, conj not present
 */
