public class Rule3 extends Rule
{
  // 3) Check each word of the sentence and make sure the character between them is a single space character, 
  // if it isn't return a true value for rule 3
  
	/*	public static boolean containsWhiteSpace(final String sentence){
		    if(sentence != null){
		        for(int i = 0; i < sentence.length(); i++){
		            if(Character.isWhitespace(sentence.charAt(i))){
		                return true;
		            }
		        }
		    }
		    return false;
		}*/

public boolean check(String sentence) {
    if(sentence != null){
        for(int i = 0; i < sentence.length(); i++){
            if(Character.isWhitespace(sentence.charAt(i))){
                return true;
            }
        }
    }
	return false;
}

}
