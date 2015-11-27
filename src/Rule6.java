
public class Rule6 extends Rule
	{
			public boolean check(String sentence) {
				
			    return (sentence == null) ? false : sentence.matches("[^A-Za-z0-9 ]");
			}	
	
		public String message()
		{
			return "rule 6 error";
		
		}
	}
	
	
	
