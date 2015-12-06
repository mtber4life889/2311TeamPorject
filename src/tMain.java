import java.util.Scanner;

public class tMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Please Input your sentence(s)");
		String sentence = sc.nextLine();
		
		while(!sentence.equals("exit"))
		{
        GrammarChecker checker = new GrammarChecker();
        checker.addRule(new Rule1()); //this works
        checker.addRule(new Rule2()); //this works, seriously no joke
        checker.addRule(new Rule3()); //this works
        checker.addRule(new Rule4()); //this works
        //checker.addRule(new Rule5());
        //checker.addRule(new Rule6());
        checker.addRule(new Rule7()); //this works, but if you have time work on it
        //checker.addRule(new Rule8());
        checker.addRule(new Rule9()); //this works
        checker.addRule(new Rule10()); //this works

        
        //checker.check(sentence);  // this was why i got repeated console outputs -Elvin 
        
        if (checker.check(sentence))
        {
        	System.out.println("NOTHINGS WRONG TRY AGAIN SORRY.");
	    }
        System.out.println("Please Input your sentence(s) or type exit to quit.");
        sentence = sc.nextLine();
  }
}
}
