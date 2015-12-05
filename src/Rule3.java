
public class Rule3 extends Rule
{
    public boolean check(String sentence)
    {
        if(sentence.contains("  "))
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
    	return "rule 3 error";
    }

    }
