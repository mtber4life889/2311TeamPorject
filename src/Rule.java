
abstract public class Rule 
{
	abstract public boolean check(String sentence);
	
	public String message()
	{
		return "error";
	}
}