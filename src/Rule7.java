public class Rule7 extends Rule 
{
	public boolean check(String sentence)
	{
		
		String[] Conj = { ",and", ",but", "for", "nor", "or", "so", "yet"};     
		String[] COMPARE = sentence.split(sentence); 
		
		
		if(Conj == COMPARE) 
		{
			return true; 
		}
		return false;
	
	}
	public String message()
		{
			return "rule 8 error";
		}
}
