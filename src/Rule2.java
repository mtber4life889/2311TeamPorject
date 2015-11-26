
public class Rule2
{
	public static boolean check(String sentence)
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
	
	public static String message()
	{
		return "error2";
	}
}