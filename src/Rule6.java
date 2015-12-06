import java.util.regex.Pattern;

public class Rule6 extends Rule {
	
	public boolean check(String sentence) {
		String[] theSplit = sentence.split("\\s+");
		Pattern pattern = Pattern.compile("[^A-Za-z0-9 \\.\\,\\?\\!\\'\\-\\:\\(\\)]");
		
		if (Character.isAlphabetic((sentence.charAt(0)))&& Character.isAlphabetic((sentence.charAt(sentence.length() - 1))) )
		{
			
		}
			
		    //return (sentence == null) ? false : sentence.matches("[^0-9 ]");
		    // hopefully it works 
		return false;
		}	

	public String message()
	{
		return "rule 6 error";
	
	}
}

