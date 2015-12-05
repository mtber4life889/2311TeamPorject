import java.util.Scanner;

public class tMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Please Input your sentence(s)");
		String sentence = sc.nextLine();
		
        GrammarChecker checker = new GrammarChecker();
        //checker.addRule(new Rule1()); this works
        //checker.addRule(new Rule2()); this works
        //checker.addRule(new Rule3()); this works
        checker.addRule(new Rule4());
        //checker.addRule(new Rule5()); this somewhat works but practical application would be impossible
        //checker.addRule(new Rule6());
        //checker.addRule(new Rule8());

        
        checker.check(sentence);
        
        if (checker.check(sentence))
        {
        	System.out.println("NOTHINGS WRONG TRY AGAIN SORRY.");
	    }
  }
}
