
public class Rule2 extends Rule
{
	public boolean check(String sentence)
	{
		if (sentence.endsWith(".") || sentence.endsWith("?") || sentence.endsWith("!"))
		{
			return true;
		}
		else
		{
		return false;
		}
	}
	
	public String message()
	{
		return "Sentence doesn't end with a punctuation.";
	}
}
