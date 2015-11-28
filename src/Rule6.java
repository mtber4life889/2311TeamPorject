public class Rule6 extends Rule {
	
	public boolean check(String sentence) {
			
		    return (sentence == null) ? false : sentence.matches("[^0-9 ]");
		    // hopefully it works 
		}	

	public String message()
	{
		return "rule 6 error";
	
	}
}

