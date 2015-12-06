public class Rule9 extends Rule {

	public boolean check(String sentence)
	{			
				if (sentence.matches(".*(who|Who).*"))
					{
						if (sentence.matches(".*(him|her|Her|Him).*"))
						{
							return false; 
						}
						else 
						{
							return true; 
						}
					}
					else if (sentence.matches(".*(Whom|whom).*"))
						{
							if (sentence.matches(".*(he|she|He|She).*"))
							{			
								return false; 
							}
							else 
							{
							return true; 
							}
						}
						else return true; 	
	}
			
	public String message()
	{
		return "rule 9 error";
	}
}

		
