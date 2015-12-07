
public class Rule1 extends Rule 
{
	public boolean check(String sentence)
	{	
		if (Character.isUpperCase(sentence.charAt(0)))
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
		return "1. First Character isn't capitalized.";
	}
}
