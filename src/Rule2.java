
public class Rule2
{
	public static boolean check(String sentence)
	{
		if (Character.isLowerCase(sentence.charAt(0))==true)
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