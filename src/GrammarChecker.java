import java.util.ArrayList;
import java.util.List;

public class GrammarChecker
{
    private List<Rule> rules;
    
    public GrammarChecker()
    {
    	rules = new ArrayList<Rule>();
    }
    
	public void addRule(Rule rule)
    {
        rules.add(rule);
    }
    
    public boolean check(String string)
    {
        boolean passes = true;
    	for (Rule rule : rules)
        {
        	if (!rule.check(string))
            {
            	passes = false;
                System.out.println(rule.message());
            }
        }
        
        return passes;
    }
}