public class Rule2 extends Rule
{
  // 3) Check each word of the sentence and make sure the character between them is a single space character, 
  // if it isn’t return a true value for rule 3
  
	public boolean check(String sentence)
	{
		if (sentence.endsWith(".") || sentence.endsWith("?") || sentence.endsWith("!"))
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
		return "error2";
	}
}
