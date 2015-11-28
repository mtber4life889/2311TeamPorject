import java.util.regex.Pattern;

public class Rule5 extends Rule 
{
	public boolean check(String sentence)
	{
		
		String[] Neg = { "n't", "not", "never", "no", "nothing", "nowhere", "non"};     
		String[] DoubleN = sentence.split(sentence); 
		// working on how to match variables from variables
		
		if(Neg == DoubleN) 
		{
			return false; 
		}
		return false;
	
	}
	public String message()
		{
			return "rule 5 error"
		}
}

