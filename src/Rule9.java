public class Rule9 extends Rule {
	
	public boolean check(String sentence) {
			
		    return true;
		}	

	public String message()
	{
		return "rule 6 error";
	
	}
}

//Rule. Use this he/him method to decide whether who or whom is correct:

/*Who/Whom wrote the letter?
  He wrote the letter. Therefore, who is correct.

  Who/Whom should I vote for?
  Should I vote for him? Therefore, whom is correct.
*/

// 9) Check if the sentence for who and he is present or whom and him.  If both does not occur, return false.
