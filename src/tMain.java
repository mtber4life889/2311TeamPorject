import java.util.Scanner;

public class tMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Please Input your sentence(s)");
		String sentence = sc.next(); 	
		
        GrammarChecker checker = new GrammarChecker();
        checker.addRule(new Rule1());
        checker.addRule(new Rule2());
        checker.addRule(new Rule3());
        // now you just add rules here like this
        
        checker.check(sentence);
        
        if (checker.check(sentence))
        {
        	System.out.println("ur face");
	}
  }
}