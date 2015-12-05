import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Rule4 extends Rule 
{
	public boolean check(String sentence)
	{
		int testInt = 0;
		String[] theSplit = sentence.split("\\s+");
		
		for(int i=0; i<=theSplit.length-1; i++){
			
		    Pattern p = Pattern.compile("[^A-Za-z0-9 \\.\\,\\?\\!\\'\\-\\:\\(\\)]");
		    Matcher m = p.matcher(sentence);
		    boolean b = m.find();
		    
		    if (b == true)
		    {
		    	testInt=1;
		    }
		 }
		 if(testInt == 1)
		 {
			 return false;
		 }
		return true;
		 
	}

	public String message()
	{
		return "rule 4 error";
	}
}
